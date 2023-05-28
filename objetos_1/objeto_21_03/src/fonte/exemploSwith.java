package fonte;

import javax.swing.JOptionPane;

public class exemploSwith {

    public static void main(String[] args) {
       Boolean continuar = true;
       
        while (continuar) {

            int mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um mes em numeral"));

            switch (mes) {
                case 1:
                    JOptionPane.showMessageDialog(null, "O mes digitado é Janeiro");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "O mes digitado é Fevereiro");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "O mes digitado é Março");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "O mes digitado é Abril");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "O mes digitado é Maio");
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "O mes digitado é Junho");
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "O mes digitado é Julho");
                    break;
                case 8:
                    JOptionPane.showMessageDialog(null, "O mes digitado é Agosto");
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "O mes digitado é Setembro");
                    break;
                case 10:
                    JOptionPane.showMessageDialog(null, "O mes digitado é Outubro");
                    break;
                case 11:
                    JOptionPane.showMessageDialog(null, "O mes digitado é Novembro");
                    break;
                case 12:
                    JOptionPane.showMessageDialog(null, "O mes digitado é Dezembro");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Digite um valor válido!");
            };
            
            int resultado = JOptionPane.showConfirmDialog(null, "continuar?");
            
            if(resultado == 1){
                continuar = false;
            };
        }
    }
}
