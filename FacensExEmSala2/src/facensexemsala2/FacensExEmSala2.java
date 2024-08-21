/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package facensexemsala2;

import java.util.Scanner;


public class FacensExEmSala2 {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Este é nosso cardápio: \n100--Cachorro Quente--R$1,70 \n101--Bauru Simples--R$2,30 \n102--Bauru com Ovo--R$2,60 \n103--Hambútger--R$2,40 \n104--Cheeseburger--R$2,50 \n105--Refrigerante--R$1,00");
        System.out.print("digite o código do pedido: ");
        int cod = scanner.nextInt();
        System.out.print("digite a quantidade que quer: ");
        int quan = scanner.nextInt();
        float valor = 0;
        
        switch (cod) {
            case 100: 
                 valor = 1.7f * quan;
                System.out.println("o valor do seu pedido é de: " + valor);
                break;
                case 101:
                     valor = 2.3f * quan;
                    System.out.println("o valor do seu pedido é de: " + valor);
                break;
                case 102:
                     valor = 2.6f * quan;
                    System.out.println("o valor do seu pedido é de: " + valor);
                    break;
                case 103:
                  valor = 2.4f * quan;
                 System.out.println("o valor do seu pedido é de: " + valor);
                 break;
                case 104:
                  valor = 2.5f * quan;   
                 System.out.println("o valor do seu pedido é de: " + valor);
                 break;
                case 105:
                 valor = 1 * quan; 
                 System.out.println("o valor do seu pedido é de: " + valor);
        }
    }
    
}
