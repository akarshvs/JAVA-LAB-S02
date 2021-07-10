public class pgm19 {
    public static void main(String[] args) {
        results res = new results();
        res.ise(80);
        res.ese(70);
        res.final_result();
    }
    
}
interface i_exam{
    void ise(double i_m);
}
interface e_exam{
    void ese(double e_m);
}
class results implements i_exam, e_exam{
    double i_mark, e_mark;
    public void ise(double i_m){
        this.i_mark = i_m;

    }
    public void ese(double e_m){
        this.e_mark = e_m;
    }
    void final_result(){
        double t_mark = i_mark + e_mark;
        double p = (t_mark / 200) * 100;
        double cgpa = (p + 2.5)/10;
        System.out.println("\nTOT MARK: " + t_mark + "\nPERCENTAGE: " + p + "\nCGPA: " + cgpa);
    }

} 

