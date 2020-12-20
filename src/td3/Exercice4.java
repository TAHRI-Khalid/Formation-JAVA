
package td3;

import java.util.Scanner;


public class Exercice4 {
    /*
     * Écrivez un programme pour entrer le numéro du mois 
     * entre (1-12) et afficher le nombre de jours de ce 
     * mois .
     */
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        byte numMois;

        System.out.print("Entrer le numéro du mois : ");
        numMois = sc.nextByte();

        if (numMois == 1 || numMois == 3 || numMois == 7 || numMois == 8 || numMois == 10 || numMois == 12) {
            System.out.println("31 jours");
        } else if (numMois == 2) {
            System.out.println("28/29 jours");
        } else if (numMois == 4 || numMois == 6 || numMois == 9 || numMois == 11) {
            System.out.println("30 jours");
        } else {
            System.out.println("ce n’est pas un numéro de jour correct");
        }
    }
}
