/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javavetor04;

import java.util.Arrays;

/**
 *
 * @author Joaoe
 */
public class JavaVetor04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int vet[] = {9, 7, 6, 5, 3, 1};
     for(int valor: vet) {
         System.out.print(valor + " ");
     }
        System.out.println("");
     int p = Arrays.binarySearch(vet, 6);
        System.out.println("Encontrei o valor na posicao " + p);
    
    }
    
}
