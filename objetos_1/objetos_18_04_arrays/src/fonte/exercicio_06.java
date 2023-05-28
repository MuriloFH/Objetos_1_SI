package fonte;

import javax.swing.JOptionPane;

public class exercicio_06 {
    
    //escreva um metodo que recebe como parametro um numero inteiro N e retorne o resultado da sequencia a seguir:
    //x = (1+1)+ ... + (1+2)+ ... + (1+N) + 
    
    public static int retornaSequancia(int numero){
        int resultado = 0;
        
        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= numero; j++) {
                System.out.println(resultado +" += " + i +"+"+j);
                resultado += i+j;
            }
            
        }
        return resultado;
    }
    public static void main(String[] args) {
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Numero"));
        
        System.out.println("O resultado é: "+ retornaSequancia(numero));
    }
}
