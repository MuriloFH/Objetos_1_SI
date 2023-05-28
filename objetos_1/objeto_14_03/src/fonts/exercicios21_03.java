package fonts;

import javax.swing.JOptionPane;

public class exercicios21_03 {

    public static void main(String[] args) {
        System.out.println("------Atividade 1------");
        //1° utilizando a estrutura while, mostre todos os numeros pares de 0 a 50
        int num = 0;
        while (num <= 50) {
            if ((num % 2) == 0) {
                System.out.println(num);
            }
            num++;
        };
        System.out.println("------Atividade 2------");
        //2° utilizando a estrutura do...while, solicite ao usuário 10 numeros double e mostre ao final a soma de todos
        int repete = 0;
        int resultado = 0;
        do {
            int numeroUsuario = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
            resultado += numeroUsuario;
            repete++;
        } while (repete < 10);
        System.out.println(resultado);

        System.out.println("------Atividade 3------");
        //3° utilizando a estrutura for, solicite ao usuário x numeros inteiros e mostre ao final o maior valor digitado
        int quantRepeticoes = Integer.parseInt(JOptionPane.showInputDialog("Quantos numeros voce quer inserir?"));
        int maiorNumero = 0;

        for (int i = 0; i <= quantRepeticoes; i++) {
            int numeroUsuario = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
            
            if(i==0){
                maiorNumero = numeroUsuario;
            }
            if (numeroUsuario > maiorNumero) {
                maiorNumero = numeroUsuario;
            }
        }
        
        System.out.println("O maior numero é: "+maiorNumero);
    }
}
