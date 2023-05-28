
package fontes;

import static fontes.exercicio01.isPar;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class exercicio02 {
    
    public static boolean isPar(int numero){
        boolean resultado = false;
        
        if(numero % 2 == 0){
            resultado = true;
        }
        return resultado;
    }
    public static void main(String[] args) {
        /*
        criar um metodo que retorna se um numero é par e crie uma lista que mostre quantos e quais foram numero pares
        */
        JTextArea area = new JTextArea(10, 20);
        Random numero = new Random();
        int contPar = 0;
        boolean dado = false;
        for(int i=1; i<=10; i++){
            
            int n1 = numero.nextInt(0, 100);
            
            if(isPar(n1)){
                contPar ++;
//                area.append(String.valueOf(n1));
                area.append(n1+" ");
            }
        }
        
        area.append("\nTotal de numero pares gerados: " + contPar);
        
        JOptionPane.showMessageDialog(null, area);
    }
}
