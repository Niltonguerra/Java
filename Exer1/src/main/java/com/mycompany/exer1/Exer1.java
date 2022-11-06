package com.mycompany.exer1;
import javax.swing.JOptionPane;

public class Exer1 {

public static void main (String args[]) {
    
       int i;
       try{
       String intervalo = JOptionPane.showInputDialog(null, "Digite um número de intervalo: "); 
       int a = Integer.parseInt(intervalo);
       
       for(i=0; i<=a; i++){
        if (i % 2 == 0){
        System.out.println(""+i);
        }
       }
       
       }
       catch (NumberFormatException e){
           JOptionPane.showMessageDialog(null,"Digite apenas números!","ERRO",1);
       }
       System.exit(0);
    }
}