package com.mycompany.exer2;
import javax.swing.JOptionPane;

public class Exer2 {
    public static void main(String [] args){
    int Valor1, Valor2, Valor3;
        
        String v1=JOptionPane.showInputDialog("Digite o valor de A: ");
        String v2=JOptionPane.showInputDialog("Digite o valor de B: ");
        String v3=JOptionPane.showInputDialog("Digite o valor de C: ");
        
        Valor1 = Integer.parseInt(v1);
        Valor2 = Integer.parseInt(v2);
        Valor3 = Integer.parseInt(v3);
        
        equacao m1 = new equacao();
        m1.SetEquacao(Valor1, Valor2, Valor3);
        
        if (m1.GetDelta() == 0){
            JOptionPane.showMessageDialog(null,"O valor da duas raizes sâo iguais por tanto é: " + m1.GetR1());
        }
        if (m1.GetDelta() < 0){
            JOptionPane.showMessageDialog(null,"Não existe raízes reais");
        }
        if (m1.GetDelta() > 0){
            JOptionPane.showMessageDialog(null,"O valor de R1 é: " + m1.GetR1() + " e o valor de R2 é: " + m1.GetR2());
        }
        
    }
    
}
