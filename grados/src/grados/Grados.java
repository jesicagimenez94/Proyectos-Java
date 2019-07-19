/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grados;

import java.util.Scanner;


/**
 *
 * @author jesica
 */
public class Grados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner lector= new Scanner(System.in);
        
        double C,F;
        
        System.out.println("ingrese grados Celcius: ");
        C= lector.nextDouble();
        
        F=(9/5)*C+32;
        
        System.out.println(C+"° CELCIUS ES IGUAL A "+F+"° FARENHEIT");
    }
    
}
