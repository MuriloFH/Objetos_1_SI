/*
Faça um programa com método que receba um numero e escreva a sequencia desse numero até o 1
EX: 5 - 4 - 3 - 2 - 1
*/
package fontes;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class exercicio03 {
    
    public static void SequenciaInversa(int numero){
        List<String> lista = new ArrayList();
        JTextArea area = new JTextArea(10, 10);
        for(int i = numero; i>=1; i--){
            lista.add(i+" ");
        }
        area.append(lista + "");
        JOptionPane.showMessageDialog(null, area);
    }
    public static void main(String[] args) {
        SequenciaInversa(10);
    }
}
