/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lista_5_java_exer3;
import javax.swing.*;
/**
 *
 * @author labs
 */
public class Lista_5_java_exer3 {

    public static String efetuar(int p1,int p2,int p3)
    {


            
            if(p1==p2 & p2==p3){
                return "É um triângulo equilatero";
            }
            
            if((p1==p2 & p2!=p3) | (p3==p2 & p2!=p1) | (p1==p3 & p2!=p1)){
                return "É um triângulo isoceles";
            }

            if((p1+p2)<p3 | (p1+p3)<p2 | (p2+p3)<p1){
                return "Não É um triângulo";
            }
            
            if(p1!=p2 & p2!=p3 & (p1+p2)>p3 | (p1+p3)>p2 | (p2+p3)>p1 ){
                return  "É um triângulo escaleno";
            }
            

        return "Erro";
    }


    public static void main(String[] args) {
        try{
        String P1n,P2n,P3n;
            int p1=0;
            int p2=0;
            int p3=0;
            
            while(p1==0){
            P1n = JOptionPane.showInputDialog(null,"Digite um numero maior que zero");
            p1 = Integer.parseInt(P1n);
                if(p1==0)
                    {
                       JOptionPane.showMessageDialog (null, "Digite um numero maior que zero","ERRO",1 );
                    }
            }
            
            
            
            while(p2==0){
                P2n = JOptionPane.showInputDialog(null,"digite um numero para o lado no triangulo:");
                p2 = Integer.parseInt(P2n);
                if(p2==0)
                    {
                       JOptionPane.showMessageDialog(null, "Digite um numero maior que zero","ERRO",1 );
                    }
            }
            
            
            while(p3==0){
                P3n = JOptionPane.showInputDialog(null,"digite um outro numero para o lado no triangulo:");
                p3 = Integer.parseInt(P3n);
                if(p3==0)
                    {
                       JOptionPane.showMessageDialog (null, "Digite um numero maior que zero","ERRO",1 );
                    }
            }
            String triangulo = Lista_5_java_exer3.efetuar(p1,p2,p3);
            
            
            JOptionPane.showMessageDialog (null, triangulo,"respostta",1 );
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog (null, "Digite apenas numeros!","ERRO",1 );
        }
        
        
        
        
    }
}

