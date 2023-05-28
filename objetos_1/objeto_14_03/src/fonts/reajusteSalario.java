
package fonts;

import javax.swing.JOptionPane;

public class reajusteSalario {
    public static void main(String[] args) {
        //solicite o nome, salario atual e percentual de reajuste a ser aplicado no salario
        //mostrando na tela, nome, salario anteior e salario reajustado
        
        String nome = JOptionPane.showInputDialog("Digite seu nome");
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Salario"));
        double percentualReajuste = Double.parseDouble(JOptionPane.showInputDialog("percentual de ajuste ex: 75"));
        double salarioReajustado = ((salario * (percentualReajuste/100))) + salario;
        
        JOptionPane.showMessageDialog(null, nome + "\nsalario anterior " + salario + "\nsalario reajustado " + salarioReajustado);
        
        
        
    }
}
