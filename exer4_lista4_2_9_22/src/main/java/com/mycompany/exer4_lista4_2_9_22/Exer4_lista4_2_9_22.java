/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.exer4_lista4_2_9_22;
import javax.swing.*;





public class Exer4_lista4_2_9_22 {
    
    static float nota(float p1,float p2,float p3,float t) {
        
        if ((((p1*0.3499) >= (p2*0.3501)) & ((p3*0.3499) <= (p2*0.3501))) | (((p1*0.3499) <= (p2*0.3501)) & ((p3*0.3501) <= (p1*0.3499))))
        {
            float media = (float) (p1*0.35+p2*0.35+t*0.3);
        return media;
    }
        else if((p3*0.3499+p2*0.3501) >= (p1*0.3499+p3*0.3501)){
            float media = (float)(p3*0.35 + p2*0.35 + t*0.3);
        return media;
        }
        
        else if((p3*0.3499+p2*0.3501) <= (p1*0.3499+p3*0.3501)){
            float media = (float)(p3*0.35 + p1*0.35 + t*0.3);
        return media;
        }
   return 0;
    }
    
    
    public static void efetuar()
    {
    try
        {
           String P1n,P2n,P3n,Tn;
        P1n = JOptionPane.showInputDialog(null,"digite a nota da P1: ");
        float p1 = Float.parseFloat(P1n);
        
        P2n = JOptionPane.showInputDialog(null,"digite a nota da P2: ");
        float p2 = Float.parseFloat(P2n);
        
        P3n = JOptionPane.showInputDialog(null,"digite a nota da P3: ");
        float p3 = Float.parseFloat(P3n);
        
        Tn = JOptionPane.showInputDialog(null,"digite a nota da Tabalho: ");
        float t = Float.parseFloat(Tn);
            JOptionPane.showMessageDialog(null,"A média será:" + Exer4_lista4_2_9_22.nota(p1,p2,p3,t)); 
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog (null, "Digite apenas numeros!","ERRO",1 );
            efetuar();
        }    
    }
 

    public static void main(String[] args) {
        efetuar();
    }
 }

