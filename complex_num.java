public class complex_num {
    float r, i;
    complex_num(float r, float i){
        this.r = r;
        this.i = i;
    }
    static void add(complex_num n1, complex_num n2){
        System.out.printf("SUM: %.1f + %.1fi", (n1.r + n2.r), (n1.i + n2.i));
    }
    public static void main(String args[]) {

        complex_num n1 = new complex_num(1 , 3);
        complex_num n2 = new complex_num(5 , 6);
        add(n1,n2);
    }
    
}
