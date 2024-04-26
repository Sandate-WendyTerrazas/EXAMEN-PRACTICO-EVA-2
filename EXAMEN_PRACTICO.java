/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_practico;

import java.util.Scanner;

/**
 *
 * @author wendy
 */
public class EXAMEN_PRACTICO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double piedra, papel, tijera;
        piedra = 1;
        papel = 2;
        tijera = 3;
        
        piedra = Math.random();
        papel = Math.random();
        tijera = Math.random(); 
        
        Scanner captu = new Scanner (System.in);
        System.out.println("Introduce piedra, papel, tijera:");
        
        System.out.println("introduce piedra" + papel);
       
        if (piedra < papel)
            System.out.println("ganaste ");
        else 
            System.out.println("perdiste");
        
        System.out.println("introduce papel" + tijera);
        
        if (papel > tijera)
            System.out.println("perdiste");
        else 
            System.out.println("ganaste");
        
        System.out.println("introduce tijera" + papel);
        if (tijera > papel)
            System.out.println("ganaste");
        else 
            System.out.println("perdiste");
        
    }
    
}
