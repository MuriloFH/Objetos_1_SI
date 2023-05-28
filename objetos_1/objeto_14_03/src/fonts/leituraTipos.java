package fonts;

import javax.swing.JOptionPane;

public class leituraTipos {
    public static void main(String[] args) {
        //leitura de string
        String nome = JOptionPane.showInputDialog("Insira seu nome -> ");
        
        //Leitura de integer
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Insira sua idade -> "));
        
        //Leitura de double
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salario -> "));
        
        double quantidadeSalario = Math.round(salario/1320);
        
        JOptionPane.showMessageDialog(null, nome +"\ncom salario "+ salario +"\nrecebe "+ quantidadeSalario + "salarios" +
                ((quantidadeSalario >= 5)?"\nA Pessoa recebe mais que 5 salarios":"\na pessoa recebe menos que 5 salarios"));
    }
}
