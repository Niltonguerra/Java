/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade_tpi7;

/**
 *
 * @author Nilton
 */
public class conta {
    double saldo,dep,sac;
    double taxa= 1;
    
   
     public void taxa(double taxaa){
        taxa = taxaa;
    }

       public String deposita(double deposito){
           dep = deposito;
           saldo = saldo+deposito;
         return "deposito realizado com sucesso!";
    }
        public String saca(double sacar){
            sac = sacar;
            saldo = saldo-sac;
        return "saque realizado com sucesso!";
    }
    
      public double getsaldo(){
      return saldo*taxa;
        
    }
    
}
