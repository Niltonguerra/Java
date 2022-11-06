/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.executar;

/**
 *
 * @author labs
 */
public class animal {
String tipo,cor,resultado;
    
   
     public void set_tipo(String tipo_){
        tipo = tipo_;
    }

    public String get_tipo(){
         return tipo;
    }
    
    public void set_cor(String cor_){
        cor = cor_;
    }

    public String get_cor(){
         return cor;
    }
    
    
    public String toString_animal(){
        resultado = "o tipo do animal é: "+tipo+" e a cor do animal é: "+cor;
        return resultado;
    }
    

}