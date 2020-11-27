package td1;

import java.util.Scanner;

public class Exercice3 {

    /*
     * Écrire un programme Java pour imprimer la somme ,la multiplication,
     * la soustraction, la division et le reste de deux nombres.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1, n2, somme, soustraction, produit, reste;
        float division;

        System.out.print("Entrer le premier nombre : ");
        n1 = sc.nextInt();

        System.out.print("Entrer le deuxième nombre : ");
        n2 = sc.nextInt();

        somme = n1 + n2;
        soustraction = n1 - n2;
        produit = n1 * n2;
        division = (float) n1 / n2;
        reste = n1 % n2;

        System.out.println("Résultats des opérations : ");
        System.out.println(n1 + " + " + n2 + " = " + somme);
        System.out.println(n1 + " - " + n2 + " = " + soustraction);
        System.out.println(n1 + " * " + n2 + " = " + produit);
        System.out.println(n1 + " / " + n2 + " = " + division);
        System.out.println(n1 + " mod " + n2 + " = " + reste);
    }

}
