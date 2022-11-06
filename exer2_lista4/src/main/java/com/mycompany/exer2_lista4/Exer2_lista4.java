package com.mycompany.exer2_lista4;
import javax.swing.*;
        
public class Exer2_lista4 {

    public static void main(String[] args) {
        String num;
        int a, z = 1, y = 0, x = 1;
        try{
        num = JOptionPane.showInputDialog(null,"ate qual numero você quer ver da seguencia de Fibonacci? ");
        int numero = Integer.parseInt(num);
        System.out.print( + z + " ");
        while(x <= numero){
	System.out.print((z + y) + " ");
	a = y;
	y = z;
	z+= a;
	x++;
        }
        }
        catch (NumberFormatException e){
           JOptionPane.showMessageDialog(null,"Digite apenas números!","ERRO",1);
       }
       System.exit(0);
     
    }
        
}


