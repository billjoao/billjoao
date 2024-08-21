/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex4;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        System.out.println("Me diga seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("me diga um numero");
        int num = scanner.nextInt();
        for (int x = 0; x<=num; x++){
            System.out.println(x + " " + nome);
        }
     
    }
    
}
