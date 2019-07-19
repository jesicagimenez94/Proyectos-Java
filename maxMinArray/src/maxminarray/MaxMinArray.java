
package maxminarray;
import java.util.*;
/**
 *
 * @author JESSI
 */
public class MaxMinArray {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        // write your code here

        Scanner ent = new Scanner(System.in);

        int minimo, maximo;
        
       
        
         int[] num = new int[11];//declaro un arreglo
         minimo=maximo=num[0];
        
        String opc = "Si";



        while(opc.equalsIgnoreCase("Si")) {
                for (int i=1;i <num.length;i++) {

                        System.out.println("ingrese un numero " + i);

                        if (ent.hasNextInt()) {

                                num[i] = ent.nextInt();

                        } else {
                                System.out.println("Numero invalido");
                        }
                        ent.nextLine();


                        if (num[i] < minimo) {
                                minimo = num[i];
                        }
                        if (num[i] > maximo) {
                                maximo = num[i];

                        }


                }
                System.out.println("desea seguir cargando?  si/no");
                opc = ent.nextLine();
                }
              System.out.println("el valor maximo es: "+maximo+" y el valor minimo es: "+minimo);
        }
   }




