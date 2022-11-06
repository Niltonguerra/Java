/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.executar;

/**
 *
 * @author labs
 */
public class cachorro extends animal {
String nome,raça,resultad;
    
   
     public void set_raça(String raça_){
        raça = raça_;
    }

    public String get_raça(){
         return raça;
    }
    
    public void set_nome(String nome_){
        nome = nome_;
    }

    public String get_nome(){
         return nome;
    }
    
    
    public String toString_cachorro(){
        resultad = "o nome do animal é: "+nome+" e a raça do animal é: "+raça;
        return resultad;
    }
    

}
