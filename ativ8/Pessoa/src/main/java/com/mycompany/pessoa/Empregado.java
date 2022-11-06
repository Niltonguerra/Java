package com.mycompany.pessoa;

public class Empregado extends Pessoa{
    float Salario;
    double LSalario;
    
    public void SetSalario(float S)
    {
    Salario = S;
    }
    public float GetSalario()
    {
    return(Salario);
    }
    
    public double GetObterLucros()
    {
    LSalario = Salario * 1.1;
    return(LSalario);
    }
    
    Empregado()
    {
    Salario = 0;
    }
}
