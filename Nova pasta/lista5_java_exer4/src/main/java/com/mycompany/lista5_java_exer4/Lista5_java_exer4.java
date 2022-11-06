/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lista5_java_exer4;
import javax.swing.*;
/**
 *
 * @author labs
 */
public class Lista5_java_exer4 {


    public static double efetuar(String p1,double p2)
    {
        String sexo = "f";
        String sex = "m";

            if(p1.equals(sexo) ){
                return  ((62.1 * p2)-44.7);
            }
            if(p1.equals(sex))
                   {
                return ((72.7 * p2)-58);
            }
            


      return 0;
    }


    public static void main(String[] args) {
        try{
        String P1n,P2n;
        double p2=0;

            
            P1n = JOptionPane.showInputDialog(null,"digite o sexo da pessoa, 'f'para feminino e 'm' para masculino");

            while(p2==0){
                P2n = JOptionPane.showInputDialog(null,"digite a altura da pessoa em metros:");
                p2 = Double.parseDouble(P2n);
                if(p2==0)
                    {
                       JOptionPane.showMessageDialog(null, "Digite um numero maior que zero","ERRO",1 );
                    }
            }
            
            
            double triangulo = Lista5_java_exer4.efetuar(P1n,p2);
            JOptionPane.showMessageDialog (null, "o peso ideal para dessa pessoa é: "+triangulo+" kilos","resposta",1 );
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog (null, "digite conforme as informações solicitadas","ERRO",1 );
        }
        
        
        
        
    }
}


    

