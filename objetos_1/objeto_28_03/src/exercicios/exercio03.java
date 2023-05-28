package exercicios;

import javax.swing.JOptionPane;

public class exercio03 {
//    3. Faça um programa que leia dois valores inteiros A e B. Se os valores forem iguais some os dois, caso contrário
//multiplique A por B. Ao final do cálculo atribuir o valor para uma variável C. (utilizar operador condicional) 
    
    public static void main(String[] args) {
        
    int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor A"));
    
    int b = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor B")); 
    
    int c = (a == b)? (a + b): (a*b);
    
    JOptionPane.showMessageDialog(null, "O numero é: " + c);
    
    }
            
}
