
package řazení3čísel.pole;

import java.util.Scanner;


public class Řazení3ČíselPole {

 
    public static void main(String[] args) {
        int [] pole = new int [3];
        Scanner vstup = new Scanner (System.in);
        for (int i=0; i<3; i++) {
            System.out.print("Zadej"+(i+1)+". číslo: ");
            pole [i] = vstup.nextInt ();
        }
        if (pole[0]>pole[1]) {
            //prohození obsahu proměnných pole [0], pole [1]
            int pom = pole [0];
            pole [0] = pole [1];
            pole [1] = pom ;               
        }
        if (pole [1]>pole [2]) {
            //prohození obsahu proměnných pole [1], pole [2]
            int pom = pole [1];
            pole [1] = pole [2];
            pole [2] = pom;
        }
         if (pole [0]>pole [1]) {
            //prohození obsahu proměnných pole [0], pole [1]
            int pom = pole [0];
            pole [0] = pole [1];
            pole [1]= pom ; 
         }   
        System.out.println("Seřazeno: "+pole[0]+","+pole [1]+","+pole [2]);
    }
    
}
