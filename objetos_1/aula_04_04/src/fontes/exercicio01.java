package fontes;

import java.util.Random;

public class exercicio01 {
    
    public static boolean isPar(int numero){
        boolean resultado = false;
        
        if(numero % 2 == 0){
            resultado = true;
        }
        return resultado;
    }
    
    public static void main(String[] args) {
        /*
        Faça um programa que contenha um método que receba um numero inteiro por parametro e retorne um boolean informando
        se o numero é par
        */
        boolean dado = false;
        for(int i=1; i<=100; i++){
            Random numero = new Random();
            int n1 = numero.nextInt(0, 100);
            dado = isPar(n1);
            System.out.println(n1+" e par? "+dado);
        }
        
        
        
        
    }
}
