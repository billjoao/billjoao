/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javamediadenotas;

import javax.swing.JOptionPane;

/**
 *
 * @author Joaoe
 */
public class JavaMediaDeNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double NOTA1, NOTA2, NOTA3, NOTA4, MEDIA;
String n1, n2, n3, n4;

n1 = JOptionPane.showInputDialog("DIGITE A PRIMEIRA NOTA");
NOTA1 = Double.parseDouble(n1);

n2 = JOptionPane.showInputDialog("DIGITE A SEGUNDA NOTA");
NOTA2 = Double.parseDouble(n2);

n3 = JOptionPane.showInputDialog("DIGITE A TERCEIRA NOTA");
NOTA3 = Double.parseDouble(n3);

n4 = JOptionPane.showInputDialog("DIGITE A QUARTA NOTA");
NOTA4 = Double.parseDouble(n4);

MEDIA = (NOTA1 + NOTA2 + NOTA3 + NOTA4) / 4.0;
System.out.println("Média = " + MEDIA);
System.exit(0);
    }
    
}
