package com.mycompany.exer_2_tpi5;
import javax.swing.*;

public class Exer_2_tpi5 {

    public static double efetuar(double saldo, double debito, double credito) {
        double saldo_atual;
        String a, b, c, d;
        a = JOptionPane.showInputDialog(null,"Qual o número da sua conta?");
        b = JOptionPane.showInputDialog(null,"Qual o saldo?");
        saldo = Double.parseDouble(b);
        c = JOptionPane.showInputDialog(null,"Qual o débito?");
        debito = Double.parseDouble(c);
        d = JOptionPane.showInputDialog(null,"Qual o crédito?");
        credito = Double.parseDouble(d);
        saldo_atual = saldo - debito + credito;
        JOptionPane.showMessageDialog (null,"O valor do saldo é: " +saldo_atual );
        if (saldo_atual >= 0){
            JOptionPane.showMessageDialog (null,"Saldo Positivo" +saldo_atual );
        }
        else if (saldo_atual < 0){
            JOptionPane.showMessageDialog (null,"Saldo Negativo");
        }
    return 0;
    }
    public static void main(String[] args) {
        Exer_2_tpi5.efetuar(0, 0, 0);
    }
}
