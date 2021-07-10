
public class pgm22 {
    public static void main(String[] args) {
        bank sbi = new sbi();
        bank icici = new icici();
        bank axis = new axis();
        System.out.println("INTREST RATES\nSBI: " + sbi.rateOfInterest() + "\nICICI: " + icici.rateOfInterest() + "\nAXIS: " + axis.rateOfInterest());
    }
    
}

class bank{
    double rateOfInterest(){
        return 0;
    }

}
class sbi extends bank{
    @Override
    double rateOfInterest(){
        return 8.0;
    }
}

class icici extends bank{
    @Override
    double rateOfInterest(){
        return 8.5;
    }

}

class  axis extends  bank{
    @Override
    double rateOfInterest(){
        return 7.5;
    };

}