import mypack.myutil;
public class pgm18 {
    public static void main(String[] args) {

        float stud_sub_marks[] = {60, 90, 86, 60, 100, 95};
        Student stud_1 = new Student(1, "Saintgits", 7, "AKARSH", "MCA", stud_sub_marks);
        Staff staff_1 = new Staff(7, "Saintgits", 6, "AKHIL", 30000, 500, 500, 1000, "ASSITANT PROF", 6);
        stud_1.details();
        staff_1.details();
    }
    
}

class College{
    protected int college_id;
    protected String college_name;
    myutil io = new myutil();
    College(int college_id, String college_name){
        this.college_id = college_id;
        this.college_name = college_name;
    }
    void details()
    {
        io.out("\nCOLLEGE: " + this.college_name + " COLLEGE ID: " + this.college_id);
    }

}
class Student extends College{
    protected int stud_id;
    protected String stud_name, stud_course;
    protected float[] stud_sub_marks = new float[6];

    Student(int college_id, String college_name, int stud_id, String stud_name, String stud_course, float[] stud_sub_marks){
        super(college_id, college_name);
        this.stud_id = stud_id;
        this.stud_name = stud_name;
        this.stud_course = stud_course;
        this.stud_sub_marks = stud_sub_marks;


    }
    char grade(float t_percent){
        char grade;
        if(t_percent  >= 90)
            grade = 'S';
        else if(t_percent >= 80)
            grade = 'A';
        else if(t_percent >= 70)
            grade = 'B';
        else if(t_percent >= 60)
            grade = 'C';
        else if(t_percent >= 50)
            grade  = 'D';
        else
            grade = 'F';
        return grade;
        }

    void details()
    {
        float t_marks = 0;
        super.details();
        io.out("STUDENT ID: " + this.stud_id);
        io.out("STUDENT NAME: " + this.stud_name);
        io.out("COURSE: " + this.stud_course);
        for(int i = 0; i < 6; ++i){
            io.out("SUB " + (i + 1) + " MARK: " + this.stud_sub_marks[i]);
            t_marks += this.stud_sub_marks[i];
        }
        //considering every sub is out of 100 6 * 100 = 600    
        float t_percent = (t_marks / 600) * 100;
        System.out.printf("PERCENT: %.2f",t_percent);
        io.out("\nGRADE: " + grade(t_percent));
    }
}

class Staff extends College{
    protected int staff_id;
    protected String staff_name, desig;
    protected float basic_sal, da, pf, ta, total_exp;
    Staff(int college_id, String college_name, int staff_id, String staff_name, float basic_sal, float da, float ta, float pf, String desig, float total_exp){
        super(college_id, college_name);
        this.staff_id = staff_id;
        this.staff_name = staff_name;
        this.basic_sal = basic_sal;
        this.da = da;
        this.ta = ta;
        this.pf = pf;
        this.desig = desig;
        this.total_exp = total_exp;
    }
    float netSalary(){
        return this.basic_sal + this.da + this.ta - this.pf;
    }
    void details(){
        super.details();
        io.out("STAFF ID: " + this.staff_id);
        io.out("STAFF NAME: " + this.staff_name);
        io.out("DESIGNATION: " + this.desig + "\nEXPERIENCE: " + this.total_exp);
        io.out("NET SALARY: " + this.netSalary());
    }
}