/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
      System.out.print("Escreva seu nome: ");
    String nome = scanner.nextLine();
    for (int x = 1; x <=10; x++){
        System.out.println(x + " " + nome);
    }
      
    
        
    
    }
    
}
