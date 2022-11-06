package com.mycompany.exer1;
import javax.swing.JOptionPane;

public class Exer1 {
    public static void main(String [] args){
    float Base, Altura;
        
        String v1=JOptionPane.showInputDialog("Dgiite a base do triângulo: ");
        String v2=JOptionPane.showInputDialog("Digite a altura do triângulo: ");
        
        Base = Float.parseFloat(v1);
        Altura = Float.parseFloat(v2);
        
        triangulo m1 = new triangulo();
        m1.SetTriangulo(Base, Altura);
        
        JOptionPane.showMessageDialog(null,"A área do trângulo é: " + m1.GetTriangulo());
    }
}
