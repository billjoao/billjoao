/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javacontador01;

/**
 *
 * @author Joaoe
 */
public class JavaContador01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int cc = 1;
    while(cc<=30) {
        cc++;
        if (cc == 4 || cc == 8) {
            continue;
        }
        System.out.println("Cambalhota " + cc);
        
        
    }
    }
    
}
