
package td3;

import java.util.Scanner;

public class Exercice1 {
    /*
     * Écrivez un programme pour trouver un maximum
     * entre trois nombres
     */

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n1, n2, n3;

        System.out.print("Entrer le nombre 1 : ");
        n1 = sc.nextInt();

        System.out.print("Entrer le nombre 2 : ");
        n2 = sc.nextInt();

        System.out.print("Entrer le nombre 3 : ");
        n3 = sc.nextInt();

        if (n1 >= n2 && n1 >= n3) {
            System.out.println("Le maximum est : " + n1);
        } else if (n2 >= n1 && n2 >= n3) {
            System.out.println("Le maximum est : " + n2);
        } else {
            System.out.println("Le maximum est : " + n3);
        }
    }
    
}
