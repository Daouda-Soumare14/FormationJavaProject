package exoé2;

public class Division implements Operation {

    double div;
    @Override
    public double calculer(double a, double b) {
        if (b != 0) {
            div = a / b;
        }else{
            throw new ArithmeticException("Division par zero!!!");
        }
        return div;
    }
    
}
