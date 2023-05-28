package fonts;

import javax.swing.JOptionPane;

public class faixaSalarialINSS {

    public static void main(String[] args) {
        double percentual = 0.0;
        double valorINSS = 0.0;
        String nome = JOptionPane.showInputDialog("Nome");
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Salario"));


        if (salario <= 1500.0) {
            percentual = 0.08;
            valorINSS = salario * percentual;
        } else if (salario >= 1501.0 && salario <= 2500.0) {
            percentual = 0.11;
            valorINSS = salario * percentual;
        } else if(salario >= 2501.00){
            percentual = 0.12;
            valorINSS = salario * percentual;
        }

        JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nPercentual INSS: " + percentual + "\nValor do INSS: " + valorINSS);
    }
}
