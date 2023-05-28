package fonts;

import javax.swing.JOptionPane;

public class exemploSelecao {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("numero"));
        int multiplica = 0;
        double divide = 0.0;
        if(numero%2 == 0){
            multiplica = numero * 5;
        }else{
            divide = numero / 5;
        }
        
    }
}
