package td1;

import java.util.Scanner;

public class Exercice2 {

    /*
     * Écrire un programme Java qui prend deux nombres comme entrée
     * et afficher le somme des deux nombres .
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1, n2, resultat;

        System.out.print("Entrer le premier nombre : ");
        n1 = sc.nextInt();

        System.out.print("Entrer le deuxième nombre : ");
        n2 = sc.nextInt();

        resultat = n1 + n2;

        System.out.println("Résultat de la somme : ");
        System.out.println(n1 + " + " + n2 + " = " + resultat);
    }

}
