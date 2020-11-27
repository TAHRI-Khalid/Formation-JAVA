package td1;

import java.util.Scanner;

public class Exercice4 {
    /*
     * Écrire un programme Java pour imprimer la surface et le périmètre 
     * d'un cercle.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double rayon, surface, perimetre;
        
        System.out.print("Rayon = ");
        rayon = sc.nextDouble();

        perimetre= 2 * Math.PI * rayon;
        surface = Math.PI * Math.pow(rayon, 2);

        System.out.println();
        System.out.println("Le périmètre est = "+ perimetre);
        System.out.println("La surface est = "+ surface);
    }

}
