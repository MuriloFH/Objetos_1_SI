package exercicios;

import javax.swing.JOptionPane;

public class exercicio05 {
    public static void main(String[] args) {
//        5. Faça um programa que leia o nome e as três notas de um aluno e ao final escreva o nome do aluno, sua média e
//se ele foi aprovado com média 7. (utilizar operador condicional) 

        String nomeAluno = JOptionPane.showInputDialog("Nome aluno");
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Nota 1"));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Nota 2"));
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Nota 3"));
        
        Double media = (nota1 + nota2 + nota3)/ 3;
        
        String resultado = (media >= 7.0)?"Aprovado":"Reprovado!!";
        
        System.out.println("O aluno: " + nomeAluno + " está " + resultado + " e a média é: " + media);
        
        
    }
}
