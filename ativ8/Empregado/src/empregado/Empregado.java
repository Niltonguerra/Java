package empregado;

public class Empregado {
    String PNome, Sobrenome;
    float Salario, SalarioAnual; 
    double SalarioAumento;
           
    public void SetPNome (String p)
    {
        PNome = p;
    }
    public String GetPNome()
    {
        return (PNome);
    }
    
    public void SetSobrenome (String s)
    {
        Sobrenome = s;
    }
    public String GetSobrenome()
    {
        return (Sobrenome);
    }
    
    public void SetSalario (float sa)
    {
        Salario = sa;
    }
    public float GetSalario()
    {
        if (Salario < 0)
        {
            Salario = 0;
        }
        return (Salario);
    }
    
    public float GetSalarioAnual()
    {
        SalarioAnual = Salario * 12;
        return (SalarioAnual);
    }
    
    public double GetSalarioAumento()
    {
        SalarioAumento = SalarioAnual * 1.1;
        return (SalarioAumento);
    }
                    
    Empregado()
    {
        PNome = "";
        Sobrenome = "";
        Salario = 0;
    }
   
}
