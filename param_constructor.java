import mypack.myutil;
class param_constructor {
    String name;
    int rollno;
    param_constructor(String name, int rollno)
    {
        this.name = name;
        this.rollno = rollno;
    }
    public static void main(String[] args) {
        myutil io = new myutil();
        param_constructor obj = new param_constructor((io.in("NAME: ")), (io.i(io.in("ROLL NO: "))));
        io.out("NAME: " + obj.name + "\nROLL NO: " + obj.rollno);   
    }
}
