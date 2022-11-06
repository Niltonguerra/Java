package com.mycompany.exer_6_tpi5;
import javax.swing.*;

public class Exer_6_tpi5 {

     public static double efetuar(int tabuada) {
        String a;
        int soma = 0;
        a = JOptionPane.showInputDialog(null,"Qual um número da tabuada de 1 até 10:");
        tabuada = Integer.parseInt(a);
        for(int i = 1; i <= 10; i++){
            int x =(tabuada * i);
            soma = soma + x;
        }
        
        JOptionPane.showMessageDialog (null,"Soma da tabuada = " +soma );
    return 0;
    }
    public static void main(String[] args) {
        Exer_6_tpi5.efetuar(0);
    }
}
