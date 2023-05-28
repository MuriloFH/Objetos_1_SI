/*
Faça um programa que leia: Nome, quantidade e preço de "n" produtos
Deve ser mostrados em um TextArea:
    -Nome e o total do item (fazer um metodo para o calculo)
Ao final solicitar um percentual de desconto(%)
Incluir no final da lista de compras o total original e o total com desconto(método para fazer o desconto)
 */
package fontes;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class exercicio04 {

    public static double totalItem(double quantidade, double preco) {
        return (quantidade * preco);
    }

    public static double valorDesconto(double total, double percentual) {
        return (total - (total * (percentual / 100)));
    }

    public static void main(String[] args) {
        double totalCompra = 0;
        JTextArea area = new JTextArea(10, 30);

        do {
            String nomeProduto = JOptionPane.showInputDialog("Produto");
            double quantidade = Double.parseDouble(JOptionPane.showInputDialog("Quantidade"));
            double preco = Double.parseDouble(JOptionPane.showInputDialog("Preço"));

            double totalDoItem = totalItem(quantidade, preco);

            totalCompra += totalDoItem;

            area.append(nomeProduto + " Total:" + totalDoItem + "\n");
        } while (JOptionPane.showConfirmDialog(null, "Outro produto?") == 0);
        
        double percentual = Double.parseDouble(JOptionPane.showInputDialog("Desconto(%)"));
        
        double totalDescontado = valorDesconto(totalCompra, percentual);
        
        area.append("------------------------------------------------------------------------------------------\n");
        area.append("Total bruto: " + totalCompra+"\n");
        area.append("Total liquido: " + totalDescontado+"\n");
       
        JOptionPane.showMessageDialog(null, area);
    }

}
