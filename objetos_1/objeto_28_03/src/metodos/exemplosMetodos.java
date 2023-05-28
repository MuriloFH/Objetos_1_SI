package metodos;

import javax.swing.JOptionPane;

public class exemplosMetodos {
    public static void escreveMensagem(String mensagem){
        JOptionPane.showMessageDialog(null, mensagem);
    }
    public static void main(String[] args) {
        escreveMensagem("Oláaaaaaaa meu jovem");
    }
}
