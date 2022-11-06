package com.mycompany.pessoa;

public class Pessoa {
    String Nome, Sexo;
    int Idade;
    float Altura;
    
    public void SetNome(String N)
    {
    Nome = N;
    }
    public String GetNome()
    {
    return(Nome);     
    }
    
    public void SetSexo(String S) 
    {
    Sexo = S;
    }
    public String GetSexo()
    {
    return(Sexo);
    }
    
    public void SetIdade(int I)
    {
    Idade = I;
    }
    public int GetIdade()
    {
    return(Idade);  
    }
    
    public void SetAltura(float A)   
    {
    Altura = A;      
    }
    public float GetAltura()
    {
    return(Altura);
    }
    
    Pessoa()
    {
    Nome = "";
    Sexo = "";
    Idade = 0;
    Altura = 0;
    }
}
