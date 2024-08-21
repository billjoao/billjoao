/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package facensexemsala;

import java.util.Scanner;


public class FacensExEmSala {

    
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        System.out.print("digite o primeiro número: ");
      int num1 = scanner.nextInt();
        System.out.print("digite o segundo número: ");
      int num2 = scanner.nextInt();
        System.out.print("pressione 1 para somar, 2 para subtrair, 3 para multiplicar e 4 para dividir: ");
        int opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
            int soma = num1 + num2;
                System.out.println("a soma dos dois números é de " + soma);
                break;
            case 2:
                int subtracao = num1 - num2;
                System.out.println("a subtração dos números é de " + subtracao);
                break;
            case 3:
                int multi = num1 * num2;
                System.out.println("a multiplicação dos múmeros é de " + multi);
                break;
            case 4:
                int divisao = num1 / num2;
                System.out.println("a divisao dos números é de " + divisao);
                
        }
    }
    
}
