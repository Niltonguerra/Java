/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.questao3;
/**
 *
 * @author labs
 */
public class pessoa {
    int idade,dia,mes,ano;
    int nano,nmes,ndia;
    
public void ajustaDataDeNascimento(int diaa,int mess,int anoo){
   nano = anoo;
   nmes = mess;
   ndia =diaa;
        
    }
    
    
  
    
public void calculaIdade(int di,int me,int an)
{
dia = di;
mes = me;
ano = an; 
        
idade = ano-nano;
if (mes<=nmes & dia<=ndia){
    idade = idade-1;
}
} 


public int informaIdade(){
      return idade;
}


public String informaNome(){
      return "Isaac Newton e Albert Einstein";
    } 
}

    
    

