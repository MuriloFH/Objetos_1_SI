package fonte;

import javax.swing.JOptionPane;

public class par_impar_switch {

    public static void main(String[] args) {

        Boolean continuar = true;

        while (continuar) {

            int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero para saber se é par ou impar"));

            int resultado = numero % 2;

            switch (resultado) {
                case 0:
                    JOptionPane.showMessageDialog(null, "O numero é par!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "O numero é impar!");
                    break;
            };
            
            int kakaMyFriend = JOptionPane.showConfirmDialog(null, "continuar?");
            
            if(kakaMyFriend == 1){
                continuar = false;
            };
        }
    }
}
