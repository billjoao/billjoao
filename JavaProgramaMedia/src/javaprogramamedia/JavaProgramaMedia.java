/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaprogramamedia;

import java.util.Scanner;

/**
 *
 * @author Joaoe
 */
public class JavaProgramaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);
        System.out.print("Primeira nota: ");
     float n1 = teclado.nextFloat();
        System.out.print("Segunda nota: ");
     float n2 = teclado.nextFloat();
     float m = (n1+n2)/2;
        System.out.println("Sua media foi " + m);
        if (m>=8) {
            System.out.println("parabens");
        }
        }
    }
    
