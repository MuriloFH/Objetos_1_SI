package exercicios;

import javax.swing.JOptionPane;

public class exercicio02 {
    public static void main(String[] args) {
//        2. Dado o preço de uma mercadoria, dê um desconto de 10% se este preço for superior a R$10,00, caso contrário o
//desconto deve ser de 7,5% (Utilizar operador condicional) 

        double valorMercadoria = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da mercadoria")); 
        
        double desconto = (valorMercadoria > 10.00)? (valorMercadoria - (valorMercadoria * 0.10)): (valorMercadoria - (valorMercadoria * 0.07));
        
        System.out.println(desconto);
    }
}
