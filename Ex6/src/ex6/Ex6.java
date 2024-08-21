package ex6;

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int mi = 1, sp = 0; 
      
      for(int x=1; x<=10; x++){
          System.out.print("Digite o " + x + "° numero:");
          int num = scanner.nextInt();
          
          if(num % 2 == 0){
              sp = sp + num;
          }else{
              mi = mi * num;
          }
        
      }
      System.out.println("A soma dos números ímpares é: " + mi);
          System.out.println("A soma dos números pares é: " + sp);
    }
    
}
