package fonts;

import javax.swing.JOptionPane;

public class exemplo_do_while {
    public static void main(String[] args) {
        int inicio = Integer.parseInt(JOptionPane.showInputDialog("Iniciar de "));
        int fim = Integer.parseInt(JOptionPane.showInputDialog("Até de "));
       
        if(inicio < fim){
            int percorre = inicio;
            do{
                System.out.println(percorre++);
            }while (percorre <= fim);
        }
        
        
    }
}
