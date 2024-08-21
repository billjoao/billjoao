/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex5;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int soma = 0;
       Scanner scanner = new Scanner(System.in);
       for (int x = 1; x<=10; x++){
           System.out.print("digite o " + x + "º numero: ");
           int num = scanner.nextInt();
           soma += num;
       }
        System.out.println("a soma dos números é de " + soma);
    }
    
}
