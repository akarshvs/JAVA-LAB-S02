package mypack;
import java.util.Scanner;
public class myutil {

    public String in(String x)
    {
        Scanner input = new Scanner(System.in);
        System.out.print(x);
        return input.nextLine();
    }
    public void out(String y)
    {
        System.out.println(y);
    }
    public float f(String f){return Float.parseFloat(f);}
    public int i(String i){return Integer.parseInt(i);}
    public double d(String d){return Double.parseDouble(d);}
    public long l(String l){return Long.parseLong(l);}
    
}
