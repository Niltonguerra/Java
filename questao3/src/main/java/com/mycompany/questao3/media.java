/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.questao3;
/**
 *
 * @author labs
 */
public class media {
    
// Atributos da Classe Media
float n1,n2, notafinal;


public void SetNotas(float Nota1, float Nota2)
{
n1 = Nota1;
n2 = Nota2;
}

// Metodo para Calculo da Media
public float GetMedia()
{
notafinal = (n1 + n2)/2;
return notafinal;
}


// Construtor da Media
media() {
n1 = 0;
n2 = 0;
notafinal = 0;
}

 



}
