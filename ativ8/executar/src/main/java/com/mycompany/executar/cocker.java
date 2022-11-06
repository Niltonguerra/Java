/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.executar;

/**
 *
 * @author labs
 */

    public class cocker extends cachorro {
boolean tosa;
    
   
     public void setTosa(boolean tosa_){
        tosa = tosa_;
    }

    public String getTosa(){
        if(tosa==true){
            return "precisa de tosa";
        }
        else{
            return "não precisa de tosa";
        }
    
    }
}



