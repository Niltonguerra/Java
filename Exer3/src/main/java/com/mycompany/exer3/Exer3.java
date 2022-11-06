package com.mycompany.exer3;
import javax.swing.*;

public class Exer3 {
        
        public static void main(String[] args){
        String num, num1;
        try{
        num = JOptionPane.showInputDialog(null,"Qual numero voce quer que comece?");
        int numero = Integer.parseInt(num);
        num1 = JOptionPane.showInputDialog(null,"Qual numero voce quer que termine?");
        int numero1 = Integer.parseInt(num1); 
        for(int i = numero; i <= numero1; i++) {
            boolean primo = true;        
            for(int j = 2; j < i; j++) {            
                if(i % j == 0){  
                    
                    primo = false;
                }
            }
            if(primo) {
                System.out.println(i);
            }          
        }
        }
        catch (NumberFormatException e){
           JOptionPane.showMessageDialog(null,"Digite apenas números!","ERRO",1);
        }
       System.exit(0);

    }
}
