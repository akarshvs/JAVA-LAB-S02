import mypack.myutil;
public class emparray 
{
    int empid;
    String empname;
    float salary;
    myutil io = new myutil();
    emparray()
    {
        this.empid = io.i(io.in("EMP ID: "));
        this.empname = io.in("EMP NAME: ");
        this.salary = io.f(io.in("NET SALARY: "));

    }
    public void display()
    {
        io.out("EMP NAME: " + this.empname);
        io.out("EMP ID: "+ this.empid);
        io.out("NET SALARY: " + this.salary);
    }
    public static void main(String args[])
    {
        emparray emp_arr[] = new emparray[3];
        for(int i = 0; i < 3; i++)
            emp_arr[i] = new emparray();
        for(int i = 0; i < 3; i++)
            emp_arr[i].display();
    }
    
    
}
