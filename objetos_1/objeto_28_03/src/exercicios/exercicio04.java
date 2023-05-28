package exercicios;

import javax.swing.JOptionPane;

public class exercicio04 {
    public static void main(String[] args) {
//        4. Faça um programa que solicite ao usuário a digitação de um número inteiro e mostre a tabuada deste número. 
      
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor "));
        
        for(int i=1; i<=10;i++){
            System.out.println("Multiplicacao de " + numero + "*" + i +" e: " + (numero * i));
        }
    }
}
