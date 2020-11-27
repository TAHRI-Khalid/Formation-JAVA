package td1;

import java.util.Scanner;

public class Exercice5 {

    /*
     * Écrivez un programme Java pour convertir les secondes 
     * en heures, minutes et secondes.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int seconde, hh, mm, ss;

        System.out.print("Valeur en secondes : ");
        seconde = sc.nextInt();

        hh = seconde / 3600;
        mm = (seconde % 3600) / 60;
        ss = (seconde % 3600) % 60;

        System.out.println();
        System.out.println("Résultat : " + hh + ":" + mm + ":" + ss);

    }

}
