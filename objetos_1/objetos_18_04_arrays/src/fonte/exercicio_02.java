package fonte;

import javax.swing.JOptionPane;

public class exercicio_02 {
    //se está inserindo dados no vetor é void
    public static void inserirDados(String[] nome, double[] salarios) {
        for(int i = 0; i< nome.length; i++){
            nome[i] = JOptionPane.showInputDialog("nome");
            salarios[i] = Double.parseDouble(JOptionPane.showInputDialog("salario"));
        }
    }
    
    public static void resjustaSalario(double[] salarios, double percentual){
        for (int i = 0; i < salarios.length; i++) {
            salarios[i] = (salarios[i] *(percentual/100))+salarios[i];
        }
    }
    public static void mostraValores(String[] nome, double[] salarios) {
        for (int i = 0; i < nome.length; i++) {
            System.out.println("Nome: "+nome[i] +" | Salario reajustado: " + Math.round(salarios[i]));
        }
    }
    public static void main(String[] args) {
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de funcionários"));
        
        String[] nome = new String[tamanho];
        double[] salarios = new double[tamanho];
        
        //método para inserir dados nos dois arrays
        inserirDados(nome, salarios);
        
        //perguntar o percentual de acrecimo
        double percentual = Double.parseDouble(JOptionPane.showInputDialog("Insira o percentual de reajuste"));
        
        //fazendo o calculo do reajuste
        resjustaSalario(salarios, percentual);
        
        //imprimindo os valores na tela
        mostraValores(nome, salarios);
    }
}
