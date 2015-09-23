
package opakování.pkgif;


public class OpakováníIf {

    
    public static void main(String[] args) {
        int a = 3;
        int b = 1;
        //prohodit proměnné, pokud jsou hodnoty obráceně
        if (a > b) {
            //swap (a, b)
            int pomocná = a;
            a = b;
            b = pomocná;
        }
        System.out.println("Čísla podle pořadí: "+a+" "+b);
        
    }
    
}