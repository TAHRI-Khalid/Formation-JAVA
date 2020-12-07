package td2;

import java.util.Scanner;


public class Exercice2 {
    /*
     * Écrire un programme Java qui lit deux nombres à virgule flottante
     *  et teste s'ils sont identiques
     */ 
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        float num1, num2;
        
        System.out.print("Nombre à virgule flottante en entrée : ");
        num1=sc.nextFloat();
        
        System.out.print("Entrez un autre nombre à virgule flottante : ");
        num2=sc.nextFloat();      
        
        if( num1 == num2){
            System.out.println("Ils sont égaux");
        }else{
            System.out.println("Ils sont différents");
        }
        
    }
    
}
