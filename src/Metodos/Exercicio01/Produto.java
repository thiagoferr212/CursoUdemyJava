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
}