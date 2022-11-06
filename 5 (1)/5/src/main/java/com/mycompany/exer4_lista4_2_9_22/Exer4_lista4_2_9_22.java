/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.exer4_lista4_2_9_22;
import javax.swing.*;





public class Exer4_lista4_2_9_22 {
    public static void efetuar()
    {
        try
        {
            String P1n,P2n;
            int p1=0;
            int p2=0;
            while(p1==0){
                    P1n = JOptionPane.showInputDialog(null,"digite um numero maximo:");
                    p1 = Integer.parseInt(P1n);
                        if(p1==0)
                            {
                               JOptionPane.showMessageDialog (null, "Digite um numero maior que zero","ERRO",1 );
                            }
            }

            while(p2==0){
                P2n = JOptionPane.showInputDialog(null,"digite o numero de incremento:");
                p2 = Integer.parseInt(P2n);
                if(p2==0)
                    {
                       JOptionPane.showMessageDialog (null, "Digite um numero maior que zero","ERRO",1 );
                    }
            }
            


            for(int i=0;i<=p1;i=i+p2)
            {
                System.out.println( i + "\t");
            }
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


