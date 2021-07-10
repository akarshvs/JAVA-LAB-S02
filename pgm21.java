import mypack.myutil;
public class pgm21 {
    public static void main(String[] args) {
        employee emp = new employee("MS", "Banglore", 101, 7, "AKARSH", 10000, 1000, 1000, 1000, 1000, 1000);
        emp.paySlip();
    } 
}
abstract class company{
    String c_name, location;
    int n_emp;
    static myutil io = new myutil();
    void input(String c, String l, int n){
        this.c_name = c;
        this.location = l;
        this.n_emp = n;
    }
    abstract void paySlip();
}
class employee extends company{
    int id;
    String e_name;
    double b_sal,hra,pf,lic,ta,da,n_pay,g_pay;
    employee(String c, String l, int n, int id, String e_name, double sal, double hra, double pf, double ta, double da, double lic){
        super.input(c, l, n);
        this.id = id;
        this.e_name = e_name;
        this.b_sal = sal;
        this.hra = hra;
        this.pf = pf;
        this.ta = ta;
        this.da = da;
        this.lic = lic;
    }

    void paySlip(){
        io.out("ID: " + id + "\nNAME: " + e_name +"\nCOMPANY: " + c_name);
        io.out("NET SAL: " + calculate());
    }
    double calculate(){
        g_pay = b_sal + hra + ta + da;
        return n_pay = g_pay - (pf + lic);
    }
} 


