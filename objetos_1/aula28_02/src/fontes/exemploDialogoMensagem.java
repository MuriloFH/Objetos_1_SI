package fontes;

import javax.swing.JOptionPane;

public class exemploDialogoMensagem {
    public static void main(String[] args) {
        //dialog aspiradin!
        JOptionPane.showMessageDialog(null, "Oláaaaa");
        
        //dialog turbo!
        JOptionPane.showMessageDialog(null, "Hello world", "Olá meu consagrado", JOptionPane.ERROR_MESSAGE);
        
        //imput dialog
        String nome = JOptionPane.showInputDialog("Nome");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade"));
        String result = (idade <18)?"menor de idade":"maior de idade";
                
        JOptionPane.showMessageDialog(null, "Nome: " + nome + " Idade: " + idade + " " + result);
    }
    
}
