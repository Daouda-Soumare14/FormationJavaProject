package exo1;

import lombok.*;

@Data
@AllArgsConstructor

public class Rectangle
{
    private double longueur;
    private double largeur;
    

    public Rectangle()
    {}

    public double calculerSurface(double longueur, double largeur){
        return longueur * largeur;
    }

    public double calculerPerimetre(double longueur, double largeur){
        return (longueur + largeur) * 2;
    }

    public boolean estCarre(double longueur, double largeur){
        if (longueur == largeur) {
            return true;
        }
        else{
            return false;
        }
    }
}
