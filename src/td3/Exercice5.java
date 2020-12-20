
package td3;

import java.util.Scanner;


public class Exercice5 {
    /*
     * Écrivez un programme pour saisir un caractère 
     * de l'utilisateur et vérifiez si le caractère donné 
     * est un alphabet, un chiffre ou un caractère spécial.
     * 
     * Un caractère est un alphabet s'il se situe entre a-z ou A-Z.
     * Un caractère est un chiffre s'il est compris entre 0 et 9.
     * Un caractère est un symbole spécial s'il est ni alphabet ni chiffre.
     */
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char c;

        System.out.print("Entrer un caractère : ");
        c = sc.next().charAt(0);

        if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
            System.out.println(c + " est un alphabet");
        } else if (c >= '0' && c <= '9') {
            System.out.println(c + " est un chiffre");
        } else {
            System.out.println(c + " est un symbole spécial ");
        }
    }
}
