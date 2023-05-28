package exercicios;

import javax.swing.JOptionPane;

public class exercicio01 {
    public static void main(String[] args) {
//        1. Faça um programa que leia três valores inteiros A, B e C. Diga se a soma de A + B é menor que C. (Utilizar
//operador condicional) 

        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor A"));
    
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor B")); 
        
        int c = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor C"));
        
        String result = ((a + b) < c)? "A soma de a e b é menor que c":"A soma de a e b é maior ou igual a c";
        
        JOptionPane.showMessageDialog(null, result);
    }
}
