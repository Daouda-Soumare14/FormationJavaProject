package exoé2;

public class Puissance implements Operation{

    @Override
    public double calculer(double a, double b) {
        return Math.pow(a, b);
    }
    
}
