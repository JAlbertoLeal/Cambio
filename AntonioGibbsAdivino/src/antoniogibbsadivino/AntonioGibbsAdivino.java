
package antoniogibbsadivino;

import java.util.Scanner;

public class AntonioGibbsAdivino {
	//El programa funciona. Revisado por Juan Alberto! 
    public static void main(String[] args) {
        
        int n = 10,cont = 10;
        int x = (int) (50*Math.random());
        //System.out.print(x);
        try ( 
          Scanner sc = new Scanner(System.in)) {
            do {
                System.out.print("\nIntroduce el valor de X: ");
                n = sc.nextInt();
                if (n > x) {
                    System.out.print("Te pasaste Amigo");
                } else if (n < x){
                    System.out.print("Casi cerca ...");
                }
                cont++;
            } while (n != x);
            System.out.print("Exelente!!! Haz acertado , No. de intentos: "+cont );
        }
    }
  
}
