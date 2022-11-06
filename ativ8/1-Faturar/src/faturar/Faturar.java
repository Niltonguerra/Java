package faturar;

public class Faturar {
    String Descricao;
    float Preco;
    int NItem, QItem;
    double Total;
     
    public void SetDescricao (String d)
    {
        Descricao = d;
    }
    public String GetDescricao()
    {
        return (Descricao);
    }
    
    public void SetPreco (float p)
    {
        Preco = p;
    }
    public float GetPreco()
    {
        if (Preco < 0)
        {
            Preco = 0;
        }
        return (Preco);
    }
    
    public void SetNItem (int n)
    {
        NItem = n;
    }
    public int GetNItem()
    {
        return (NItem);
    }
    
    public void SetQItem (int q)
    {
        QItem = q;
    }
    public int GetQItem()
    {
        if (QItem < 0)
        {
            QItem = 0;    
        } 
        return (QItem);
    }
    
    public double GetFaturarTotal()
    {
        Total = QItem * Preco;
        return (Total); 
    }
                
    Faturar()
    {
        Descricao = "";
        Preco = 0;
        NItem = 0;
        QItem = 0; 
    }
}
