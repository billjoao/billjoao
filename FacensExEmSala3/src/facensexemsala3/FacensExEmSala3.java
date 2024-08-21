/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package facensexemsala3;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class FacensExEmSala3 {

    public static void main(String[] args) {
       int num = 0;
       int soma = 0;
       int valor = 0;
       Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os valores inteiros positivos para calcular a média. Digite um número negativo para finalizar a leitura: ");
        while ((valor = scanner.nextInt()) >0) {
          num++;
          soma += valor;
        }
        if (num == 0) {
            System.out.println("você nao digitou nada");
        }else{
            double media = (double) soma / num;
            System.out.println("A media dos valores é de " + media);
            
        }
    }
    
}
