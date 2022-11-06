package faturar;

import javax.swing.JOptionPane;

public class Executar {
    public static void main(String[] args)
    {
        int N1, N2; 
        float N4;
        String v1 = JOptionPane.showInputDialog("Digite o número do item faturado: ");
        while(!v1.matches("[0-9]*")){
            JOptionPane.showMessageDialog(null,"Digite apenas numero! ");
             v1 = JOptionPane.showInputDialog("Digite o número do item faturado: ");
        }
        
        String v2 = JOptionPane.showInputDialog("Descreva o item: ");
        
        
        String v3 = JOptionPane.showInputDialog("Digite a quantidade desejada do item ");
        while(!v3.matches("[0-9]*")){
            JOptionPane.showMessageDialog(null,"Digite apenas numero! ");
             v3 = JOptionPane.showInputDialog("Digite a quantidade desejada do item: ");
        }
        
        String v4 = JOptionPane.showInputDialog("Digite o preço unitário do item: ");
        while(!v4.matches("[0-9]*")){
            JOptionPane.showMessageDialog(null,"Digite apenas numero! ");
             v4 = JOptionPane.showInputDialog("Digite o preço unitário do item: ");
        }
        
        
        
        
        N1 = Integer.parseInt(v1);
        N2 = Integer.parseInt(v3);
        N4 = Float.parseFloat(v4);
        
        Faturar a1 = new Faturar();
        a1.SetNItem(N1);
        a1.SetQItem(N2);
        a1.SetDescricao(v2);
        a1.SetPreco(N4);
                
        JOptionPane.showMessageDialog(null,"Número do Item: " + a1.GetNItem() + "\n" + "Descrição do Item: " + a1.GetDescricao() + "\n" + "Quantidade: " +a1.GetQItem() + "\n" + "Preço unitário: " + a1.GetPreco() + "\n" + "O valor total da fatura é: " + a1.GetFaturarTotal());
    }
}
