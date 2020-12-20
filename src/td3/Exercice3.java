
package td3;

import java.util.Scanner;


public class Exercice3 {

    /*
     * Écrivez un programme pour entrer le numéro du jour
     * de la semaine (1-7) et affichez le nom du jour 
     * de la semaine correspondant 
     */ 
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        byte numJour;

        System.out.print("Entrer le numéro du jour : ");
        numJour = sc.nextByte();

        if (numJour == 1) {
            System.out.println("Lundi");
        } else if (numJour==2){
            System.out.println("Mardi");
        }else if (numJour==3){
            System.out.println("Mercredi");
        }else if (numJour==4){
            System.out.println("Jeudi");
        }else if (numJour==5){
            System.out.println("Venredi");
        }else if (numJour==6){
            System.out.println("Samedi");
        }else if (numJour==7){
            System.out.println("Dimanche");
        }else{
            System.out.println("ce n’est pas un numéro de jour correct");
        }   
    }
    
}
