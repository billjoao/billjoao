/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaprogramaidade;
import java.util.Scanner;

/**
 *
 * @author Joaoe
 */
public class JavaProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner t = new Scanner(System.in);
        System.out.print("Digite o seu ano de nascimento: ");
      int nasc = t.nextInt();
      int i = 2023-nasc;
      if (i>=18){
          System.out.println("Maior");
      } else {
          System.out.println("Menor");
      }
      }
    }
    

