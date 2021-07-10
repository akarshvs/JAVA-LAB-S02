import mypack.myutil;
import intrest.*;
public class insurance {
    int id;
    String name;
    double m_deposit;
    static myutil io = new myutil();
    static irates intrest_obj = new irates();
    insurance(int i, String n, double d){
        this.id = i;
        this.name = n;
        this.m_deposit = d;
    }
    void display(){
        io.out("\nID: "+ this.id +"\nNAME: " + this.name);
        io.out("DEPOSIT: " + this.m_deposit + "\nINTREST: " + intrest_obj.irate(this.m_deposit));
    }
    public static void main(String[] args) {
        insurance obj = new insurance(1, "AKARSH", 25000);
        obj.display();
    } 
    
}
