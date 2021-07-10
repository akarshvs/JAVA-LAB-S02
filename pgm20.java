import mypack.myutil;

//result class
public class pgm20 extends student implements sports, test{
    float[] marks = new float[5];
    float score;
    pgm20(int rollno, String name){
        super(rollno, name);
    }
    public void getmarks(float[] marks){
        this.marks = marks;
    }
    public void putmarks(){
        io.out("--TEST MARKS--");
        for(int i = 0; i < 5; ++i)
            io.out("MARK " + i + ": " + this.marks[i]);
    }
    public void getscore(float score){
        this.score = score;
    }
    public void putscore(){
        io.out("SPORTS SCORE: " + this.score);
    }
    public float total_mark(){
        float total_mark = 0;
        for(int i = 0; i < 5; ++i)
            total_mark += this.marks[i];
        return total_mark;
    }
    public void display(){
        super.display_student();
        putmarks();
        putscore();
        io.out("TOTAL MARKS:  " + total_mark());
    }
    public static void main(String[] args) {
        pgm20 obj = new pgm20(7, "DHONI");
        float[] sub_marks = {10, 50, 70, 100, 80};
        obj.getmarks(sub_marks);
        obj.getscore(8);
        obj.display(); 
    }
}

class student{
    int rollno;
    String name;
    static myutil io = new myutil();
    student(int rollno, String name){
        this.rollno = rollno;
        this.name = name;
    }
    void display_student(){
        System.out.println("NAME: " + this.name + "\nROLL NO: " + this.rollno);
    }

}
interface test{
    public void getmarks(float[] marks);
    public void putmarks();
    public float total_mark();
}

interface sports{
    public void getscore(float marks);
    public void putscore();
}


