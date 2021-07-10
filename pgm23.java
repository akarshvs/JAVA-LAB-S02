import mypack.myutil;

public class pgm23 {
    public static void main(String[] args) {
        circle_area c = new circle_area();
        square_area s = new square_area();
        rectangle_area r = new rectangle_area();
        //referance variable super class
        circle_area obj;
        obj = c; obj.area();
        obj = s; obj.area();
        obj = r; obj.area();
    }
}
class circle_area{
    final double pi = 3.14;
    double r = 5.0; 
    static myutil io = new myutil(); 
    void area(){ 
        io.out("AREA OF CIRCLE: " + (pi * ( r * r)));  
    }
}
class square_area extends circle_area{
    double s =  7.0;
    @Override
    void area(){
        io.out("AREA OF SQUARE: " + (s * s));
    }        
}

class rectangle_area extends circle_area{
    double l = 4.0;
    double b = 3.5;
    @Override
    void area(){
        io.out("AREA OF RECTANGLE: " + (l * b));
    }
}
    
        