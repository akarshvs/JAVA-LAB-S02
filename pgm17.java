import mypack.myutil;
public class pgm17 {
    public static void main(String[] args) {
        Result r1 = new Result();
        r1.get();
        r1.getmarks();
        r1.display();
    }
}

class Student{
    int rollno;
    String name;
    myutil io = new myutil();
    void get(){
        this.name = io.in("NAME: ");
        this.rollno = io.i(io.in("ROLL NO: "));
    }
    void put(){
        io.out("NAME: " + this.name);
        io.out("ROLL NO: " + this.rollno);
    }

}

class Test extends Student{
    double mark1, mark2;
    void getmarks(){
        this.mark1 = io.d(io.in("SUB 1 MARK: "));
        this.mark2 = io.d(io.in("SUB 2 MARK: "));
    }
    void putmarks()
    {
        super.put();
        io.out("SUB 1 MARK: " + this.mark1);
        io.out("SUB 2 MARK: " + this.mark2);
    }
}

class Result extends Test{
    double total;
    void display(){
        super.putmarks();
        total = super.mark1 + super.mark2;
        io.out("TOTAL MARKS: " + total);
    }
}
