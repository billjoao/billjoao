/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javavetor03;

import java.util.Arrays;

/**
 *
 * @author Joaoe
 */
public class JavaVetor03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int v[] = {3, 7, 0, 8, 2};
      Arrays.sort(v);
      for (int valor: v){
          System.out.print(valor + " ");
      }
    }
    
}
