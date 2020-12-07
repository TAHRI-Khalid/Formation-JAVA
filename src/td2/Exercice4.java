
package td2;

import java.util.Scanner;


public class Exercice4 {
    /*
     * Écrire un programme Java pour imprimer la moyenne et la décision 
     * pour un étudiant comme l’exercice précédent, on ajoutant maintenant 
     * le mention de l’étudiant .
     * Moy < 12 , mention = Passable,
     * Moy < 14 , mention =  A .Bien,
     * Moy < 16 , mention = Bien,
     * Moy < 18 , mention = T.Bien,
     * Moy < 20 , mention = Excellant .
     */
     
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        float arabe,math, moy;
        
        System.out.print("Entrer la note de l’arabe : ");
        arabe=sc.nextFloat();
        
        System.out.print("Entrer la note de math : ");
        math=sc.nextFloat();   
        
        moy=(arabe+math)/2;
        
        System.out.println("Moyenne : " + moy);
        
        if(moy>=10){
            System.out.println("Décision : Admis");
            
            if(moy<12){
                System.out.println("Mention : Passable");
            }else if(moy<14){
                System.out.println("Mention : A.Bien");
            }else if(moy<16){
                System.out.println("Mention : Bien");
            }else if(moy<18){
                System.out.println("Mention : T.Bien");
            }else {
                System.out.println("Mention : Excellant");
            }
            
        }else{
            System.out.println("Décision : Exclus");
        }
        
    }
    
}
