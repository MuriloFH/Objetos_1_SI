package exercicios;

import javax.swing.JOptionPane;

public class exercicio07 {
    public static void main(String[] args) {
//        7. Faça um programa que leia 2 números reais, e solicite a operação a ser realizada com eles: 1-Soma, 2-
//Subtração, 3- Multiplicação, 4- Divisão (utilizar “switch”). Mostrar o resultado ao final. O programa deve permitir
//vários cálculos. 
        
        boolean continua = true;
        while(continua){
            
            int resultado = 0;
            int numeroA = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor A "));
            int numeroB = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor B "));
            
            String operacao = JOptionPane.showInputDialog("Digite a operação matematica: ");
            
            switch (operacao) {
                case "+":
                    resultado = numeroA + numeroB;
                    break;
                case "-":
                    resultado = numeroA - numeroB;
                    break;
                case "/":
                    resultado = numeroA / numeroB;
                    break;
                case "*":
                    resultado = numeroA * numeroB;
                    break;
                default:
                    System.out.println("Digite uma operação válida!");
            }
            
            JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
            
            int cont = JOptionPane.showConfirmDialog(null, "continuar?");
            
            if(cont == 1){
                continua = false;
            }
            
            
        }
    }
}
