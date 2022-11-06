/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.executar;
import javax.swing.JOptionPane;
/**
 *
 * @author labs
 */
public class Executar {

@SuppressWarnings("empty-statement")
public static void main(String[] args) {
String escolh;
 

        cocker pet = new cocker();
        
        escolh=JOptionPane.showInputDialog("digite o tipo do seu cachorro?");    
        pet.set_tipo(escolh);
        escolh=JOptionPane.showInputDialog("digite a cor do seu cachorro?");  
        pet.set_cor(escolh);
        escolh=JOptionPane.showInputDialog("digite o nome do seu cachorro?");  
        pet.set_nome(escolh);
        escolh=JOptionPane.showInputDialog("digite a raça do seu cachorro?");  
        pet.set_raça(escolh);
        escolh=JOptionPane.showInputDialog("seu cachorro precisa de tosa? \n sim \n não"); 
        
        while(("sim".equals(escolh) || "não".equals(escolh))==false){
        JOptionPane.showMessageDialog(null,"Digite apenas 'sim' ou 'não'!");
        escolh=JOptionPane.showInputDialog("seu cachorro precisa de tosa? \n sim \n não"); 
}
        boolean escolha = "sim".equals(escolh);
        pet.setTosa(escolha);

        
        JOptionPane.showMessageDialog(null,pet.toString_animal()+" e \n"+ pet.toString_cachorro()+" e \n"+pet.getTosa());
 
        
                

    
}}



