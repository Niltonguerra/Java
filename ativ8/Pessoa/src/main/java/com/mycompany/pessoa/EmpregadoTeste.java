package com.mycompany.pessoa;

import javax.swing.JOptionPane;

public class EmpregadoTeste {
     public static void main(String[] args)
    {
        int N1;
        float N2, N3;
        
        String v1 = JOptionPane.showInputDialog("Digite seu Nome: ");
        
        String v2 = JOptionPane.showInputDialog("Digite a sua Idade: ");
        while(!v2.matches("[0-9]*")){
            JOptionPane.showMessageDialog(null,"Digite apenas numero! ");
             v2 = JOptionPane.showInputDialog("Digite a sua Idade: ");
        }
        
        
        
        String v3 = JOptionPane.showInputDialog("Digite a sua Altura: ");
        while(!v3.matches("[0-9]*")){
            JOptionPane.showMessageDialog(null,"Digite apenas numero! ");
             v3 = JOptionPane.showInputDialog("Digite a sua Altura: ");
        }
        
        
        
        
        
        
        String v4 = JOptionPane.showInputDialog("Digite o seu Sexo: ");
        
        
        
        
        String v5 = JOptionPane.showInputDialog("Digite o seu Salario: ");
        while(!v5.matches("[0-9]*")){
            JOptionPane.showMessageDialog(null,"Digite apenas numero! ");
             v5 = JOptionPane.showInputDialog("Digite o seu Salario: ");
        }
        
        
        N1 = Integer.parseInt(v2);
        N2 = Float.parseFloat(v3);
        N3 = Float.parseFloat(v5);
        
        Pessoa a1 = new Pessoa();
        a1.SetNome(v1);
        a1.SetIdade(N1);
        a1.SetAltura(N2);
        a1.SetSexo(v4);
        
        Empregado r1 = new Empregado();      
        r1.SetSalario(N3);
        
        JOptionPane.showMessageDialog(null,"Nome: " + a1.GetNome()+ "\n" + "Idade: " + a1.GetIdade() + 
        "\n" + "Altura: " + a1.GetAltura() + "\n" + "Sexo: " + a1.GetSexo() + "\n" + "Salário: " + r1.GetSalario() + 
        "\n" + "Lucro Salário: " + "\n" + r1.GetObterLucros());
    }
}
