package exo1;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        try (Scanner scan = new Scanner(System.in)) {
            
            Rectangle rectangle = new Rectangle();

            System.out.println("saisir la longueur du rectangle : ");
            double longueur = scan.nextDouble();

            System.out.println("saisir la largeur du rectangle : ");
            double largeur = scan.nextDouble();

            System.out.println("Surface du rectangle : "+ rectangle.calculerSurface(largeur, largeur));
            System.out.println("Perimetre du rectangle : "+ rectangle.calculerPerimetre(longueur, largeur));
            System.out.println("Est ce que le rectangle est un Carree ? : "+ rectangle.estCarre(longueur, largeur));
        }
    }
}
