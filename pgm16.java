import mypack.myutil;
public class pgm16 {
    public static void main(String[] args) {
        student  s1 = new student(1, "AKARSH", 23, 80, 2);
        s1.details();
        
    }
}

class Person
{
    int p_id, p_age;
    String p_name;
    public myutil io = new myutil();
    Person(int id, String name, int age)
    {
        this.p_id = id;
        this.p_name = name;
        this.p_age = age; 
    }
    void details()
    {
        io.out("ID: " + p_id);
        io.out("NAME: " + p_name);
        io.out("AGE: " + p_age);
    }

}
class student extends Person
{
    float attendance_percent;
    int  sem_id;

    student(int id, String name, int age, float attendance_percent, int sem_id)
    {
        super(id, name, age);
        this.attendance_percent = attendance_percent;
        this.sem_id = sem_id;
    }
    void details()
    {
        super.details();
        io.out("SEM ID: " + this.sem_id);
        io.out("ATTENDANCE: " + this.attendance_percent + "%");
        if(this.attendance_percent >= 70)
            io.out("ELIGIBLE");
        else
            io.out("NOT ELIGIBLE");
    }
}
