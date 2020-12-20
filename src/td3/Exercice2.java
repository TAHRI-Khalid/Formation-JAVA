package td3;

import java.util.Scanner;


public class Exercice2 {
    /*
     * Écrivez un programme pour saisir le prix de fabrication 
     * et le prix de vente d'un produit et vérifiez le profit
     * ou la perte. Si le prix de fabrication est supérieur 
     * au prix de vente, il y a perte sinon profit.
     */ 
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int prixFab, prixVente;

        System.out.print("Prix de fabrication : ");
        prixFab = sc.nextInt();

        System.out.print("Prix de vente : ");
        prixVente = sc.nextInt();


        if (prixVente > prixFab) {
            System.out.println("Perte");
        } else {
            System.out.println("Profit");
        }
        
    }
    
}
