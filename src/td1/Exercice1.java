package td1;

import java.util.Scanner;

public class Exercice1 {

    /*
     * Écrire un programme Java qui prend deux nombres comme entrée 
     * et afficher le produit des deux nombres .
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1;
        int n2;
        int resultat;

        System.out.println("Entrer le premier nombre : ");
        n1 = sc.nextInt();

        System.out.println("Entrer le deuxième nombre : ");
        n2 = sc.nextInt();

        resultat = n1 * n2;

        System.out.println("Résultat du produit : " + resultat);
    }

}
