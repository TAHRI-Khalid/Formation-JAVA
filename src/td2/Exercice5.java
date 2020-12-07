
package td2;

import java.util.Scanner;


public class Exercice5 {
    /*
     * Écrivez un programme Java  pour obtenir le montant d’une commande 
     * et calculer la remise. Le client a le droit de 2%  de remise 
     * si la commande dépasse 2000dh et 5% si elle dépasse 4000dh.
     */
     
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        float montant; 
        double remise, resultat;
        
        System.out.print("Montant de la commande : ");
        montant =sc.nextFloat();
        
        if(montant >=5000){
            
            remise=montant*0.05;
            resultat=montant-remise;
            System.out.println("La remise est de 5% : "+remise +" dh");
            System.out.println("Le montant à payer est : " + resultat +" dh");
            
        }else if(montant >=2000){
            
            remise=montant*0.02;
            resultat=montant-remise;
            System.out.println("La remise est de 2% : "+remise+" dh");
            System.out.println("Le montant à payer est : " + resultat +" dh");

        }else{

            System.out.println("La remise est de 0% : 0 dh");
            System.out.println("Le montant à payer est : " + montant +" dh");

        }

    }
}
