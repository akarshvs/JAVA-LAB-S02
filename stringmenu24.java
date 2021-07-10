import mypack.myutil;

public class stringmenu24 {
    static myutil io = new myutil();

    int menu(){
        io.out("1.LENGTH\n2.REVERSE\n3.UPPERCASE\n4.LOWERCASE\n0.EXIT");
        return io.i(io.in("OPTION: "));
    }
    String rev(String x){
        String res = ""; 
        for(int i = x.length() - 1; i >= 0; --i)
            res = res + x.charAt(i);
        return res;
    }
    public static void main(String[] args) {
        boolean flag = true;
        stringmenu24 obj = new stringmenu24();
        String s = io.in("INPUT STRING: ");
        while(flag){
        switch(obj.menu()){
            case 1: io.out("LEN: " + s.length()); break;
            case 2: io.out("REV: " + obj.rev(s)); break;
            case 3: io.out("UPPERCASE: " + s.toUpperCase()); break;
            case 4: io.out("LOWERCASE: " + s.toLowerCase()); break;
            case 0: flag = false; break;
            default: io.out("INVALID OPTION");
            }
            io.out("----------------------------");
        } 
    
    }
}
