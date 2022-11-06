package empregado;

import javax.swing.JOptionPane;

public class Executar {
    public static void main(String[] args)
    {
        float N1, N2;
        

        
        
        String v1 = JOptionPane.showInputDialog("Escreva o seu primeiro Nome: ");
        String v2 = JOptionPane.showInputDialog("Escreva o seu Sobrenome: ");
        

        String v3 = JOptionPane.showInputDialog("Digite o seu sálario mensal: ");         
        while(!v3.matches("[0-9]*")){
            JOptionPane.showMessageDialog(null,"Digite apenas numero! ");
             v3 = JOptionPane.showInputDialog("Digite o preço unitário do item: ");
        }
        
        
        N1 = Float.parseFloat(v3);
        
        Empregado a1 = new Empregado();
        a1.SetPNome(v1);
        a1.SetSobrenome(v2);
        a1.SetSalario(N1);
        
        String v4 = JOptionPane.showInputDialog("Escreva o seu primeiro Nome: ");
        String v5 = JOptionPane.showInputDialog("Escreva o seu Sobrenome: ");
        String v6 = JOptionPane.showInputDialog("Digite o seu sálario mensal: ");         
        while(!v6.matches("[0-9]*")){
            JOptionPane.showMessageDialog(null,"Digite apenas numero! ");
             v6 = JOptionPane.showInputDialog("Digite o preço unitário do item: ");
        }
        
         N2 = Float.parseFloat(v6);
        
        Empregado a2 = new Empregado();
        a2.SetPNome(v4);
        a2.SetSobrenome(v5);
        a2.SetSalario(N2);
                
        JOptionPane.showMessageDialog(null,"Primeiro Nome: " + a1.GetPNome() + "\n" + "Sobrenome: " + a1.GetSobrenome() + "\n" + "Salário Mensal: " +a1.GetSalario() + "\n" + "Salário Anual: " + a1.GetSalarioAnual());
        JOptionPane.showMessageDialog(null,"Primeiro Nome: " + a2.GetPNome() + "\n" + "Sobrenome: " + a2.GetSobrenome() + "\n" + "Salário Mensal: " +a2.GetSalario() + "\n" + "Salário Anual: " + a2.GetSalarioAnual());
        
        JOptionPane.showMessageDialog(null,"O Salario com aumento de 10% do " + a1.GetPNome() + " " + a1.GetSobrenome() + " é " + a1.GetSalarioAumento());
        JOptionPane.showMessageDialog(null,"O Salario com aumento de 10% do " + a2.GetPNome() + " " + a2.GetSobrenome() + " é " + a2.GetSalarioAumento());
    }
}
