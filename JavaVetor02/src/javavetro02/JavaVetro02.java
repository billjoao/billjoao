/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javavetro02;

/**
 *
 * @author Joaoe
 */
public class JavaVetro02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago",
         "Set", "Out", "Nov", "Dez"};
     String tot[]= {"31", "28", "31", "30", "31", "30", "31", "31", "30", "31",
         "30", "31"}; 
     for (int i=0; i<mes.length; i++) {
         System.out.println(mes[i] + " tem " + tot[i] + " dias.");
     }
    }
    
}
