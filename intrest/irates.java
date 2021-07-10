package intrest;

public class irates {
    public Double irate(double amt) {
        double i;
        if (amt >= 25000)
            i = 10;
        else if(amt >= 15000)
            i = 9;
        else if(amt >= 10000)
            i = 7;
        else if(amt >= 5000)
            i = 5;
        else
            i = 0;
        return amt * (i/100);
    }
}
