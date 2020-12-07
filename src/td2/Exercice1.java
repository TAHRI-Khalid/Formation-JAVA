
package td2;

import java.util.Scanner;

public class Exercice1 {
    /*
     * Écrivez un programme Java pour obtenir un nombre 
     * de l'utilisateur et imprimez s'il est positif ou négatif.
     */

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        int num;
        
        System.out.print("Numéro d'entrée : ");
        num=sc.nextInt();
        
        if(num >=0){
            System.out.println("Le nombre est positif");
        }else{
            System.out.println("Le nombre est négatif");
        }
  
    }
    
}
