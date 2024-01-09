package Metodos.Exercicio01;

public class Produto {

    public String nome;
    public double preco;
    public int quantidade;

    public double ValorTotal(){
        return preco * quantidade;
    }

    public void AddProduto(int quantidade){
         this.quantidade += quantidade;
    }

    public void RemoveProduto(int quantidade){
         this.quantidade -= quantidade;
    }

    public String toString(){
        return "Dados do produto: " 
        + nome 
        + ", $"
        + String.format("%.2f", preco)
        + ", "
        + quantidade
        + " unidades, Total: $"
        + String.format("%.2f",ValorTotal());
    }
}