/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohpembanding2;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Contohpembanding2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a;
        Scanner scan = new Scanner(System.in);
        System.out.print ("Masukan bilangan : ");
        a = scan.nextInt();
        
        if ( a % 2 ==0 && a % 2 ==0)
        {
           System.out.println ("bilangan genap dan kelipatan 4"); 
        }
        else
        {
            System.out.println ("bukan bilangan gena dan kelipatan 4");
        }
    }
    
}