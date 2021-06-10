import mypack.myutil;

class area_overloading{
    //SQUARE S X S
    private double area(double side){return side * side;}
    //RECTANGLE L X B
    private double area(double len, double bre){return len * bre;}  
    public static void main(String args[]) {
        myutil io = new myutil();
        area_overloading obj = new area_overloading();
        io.out("AREA OF SQUARE: " + (obj.area(io.f(io.in("SIDE OF SQUARE: ")))));
        io.out("AREA OF RECTANGLE: " + (obj.area(io.i(io.in("\nLEN OF REC: ")), io.f(io.in("\nBRE OF REC: ")))));
    }
}