
package td2;

import java.util.Scanner;


public class Exercice3 {

    /*
     * Écrire un programme Java qui demande à l’utilisateur deux notes 
     * (la note de l’arabe , et la note de math ) , et imprimer la moyenne
     * et la décision,
     * moy >=10 l’étudiant est admis ,
     * moy < 10 l’étudiant est exclus .
     */ 
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        float arabe,math, moy;
        
        System.out.print("Entrer la note de l’arabe :");
        arabe=sc.nextFloat();
        
        System.out.print("Entrer la note de math : ");
        math=sc.nextFloat();   
        
        moy=(arabe+math)/2;
        
        System.out.println("Moyenne : "+moy);
        
        if(moy>=10){
            System.out.println("Décision : Admis");
        }else{
            System.out.println("Décision : Exclus");
        }
        
    }
    
}
