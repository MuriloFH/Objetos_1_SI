package fonte;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class exercicio_01 {
    public static double calculaMedia(double nota1, double nota2){
        return ((nota1 + nota2)/ 2);
    }
    
    public static String situacaoMatricula(double media){
        return (media >= 7.0)?"Aprovado":"Reprovado";
    }
    
    public static void main(String[] args) {
        JTextArea area = new JTextArea(10,10);
        double mediaGeral = 0;
        
        int numeroAlunos = 0;
        
        do{
            String nomeAluno = JOptionPane.showInputDialog("nome aluno");
            double nota1 = Double.parseDouble(JOptionPane.showInputDialog("nota_1"));
            double nota2 = Double.parseDouble(JOptionPane.showInputDialog("nota_2"));
            
            double media = calculaMedia(nota1, nota2);
            
            //acumula a média para calcular a média da turma
            mediaGeral += media;
            
            //incrementar o numero de alunos
            numeroAlunos ++;
            
            //mostrar no textArea as informações do aluno
            area.append(nomeAluno + " obteve média: "+ media + " e sua situacao é: " + situacaoMatricula(media)+"\n");
            
        }while(JOptionPane.showConfirmDialog(null,"continuar?") == 0);
        
        mediaGeral = mediaGeral / numeroAlunos;
        
        area.append("Média geral da turma: "+mediaGeral);
        
        //mostrar o textArea
        JOptionPane.showMessageDialog(null, area);
    }
}
