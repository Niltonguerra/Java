package com.mycompany.exer_1_tpi5;
import javax.swing.*;

public class Exer_1_tpi5 {

    public static double efetuar(int valor, int quantidade) {
        double x;
        String a, b, c, produto;
        a = JOptionPane.showInputDialog(null,"Qual o nome do produto?");
        produto = a;
        b = JOptionPane.showInputDialog(null,"Qual o valor do produto?");
        valor = Integer.parseInt(b);
        c = JOptionPane.showInputDialog(null,"Qual a quantida desejada?");
        quantidade = Integer.parseInt(c);
        if(quantidade <= 10){
            x = valor * quantidade;
             JOptionPane.showMessageDialog (null,"O produto " +produto+ " não tem desconto, o valor total sera: " +x );
        }
        if(quantidade > 10 && quantidade <= 20){
            x = valor * quantidade;
            double z = x * 0.1;
             JOptionPane.showMessageDialog (null,"O produto " +produto+ " tem desconto de 10%, o valor total sera: " +(x - z) );
        }
        if(quantidade > 20 && quantidade <= 50){
            x = valor * quantidade;
            double z = x * 0.2;
             JOptionPane.showMessageDialog (null,"O produto " +produto+ " tem desconto de 20%, o valor total sera: " +(x - z) );
        }
        if(quantidade > 60){
            x = valor * quantidade;
            double z = x * 0.25;
             JOptionPane.showMessageDialog (null,"O produto " +produto+ " tem desconto de 25%, o valor total sera: " +(x - z) );
        }
        return 0;
    }
    public static void main(String[] args) {
        Exer_1_tpi5.efetuar(0, 0);
    }
    
}
