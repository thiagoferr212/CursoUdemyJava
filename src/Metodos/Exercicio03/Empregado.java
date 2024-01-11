package Metodos.Exercicio03;

public class Empregado {

    public String nome;
    public double salarioBruto;
    public double imposto;

    public double SalarioLiquido(){
        return salarioBruto - imposto;
    }

    public void IncluirSal(double porcentagem){
        salarioBruto += salarioBruto * porcentagem / 100;
    }

    public String toString(){
        return nome
        + ", $"
        + String.format("%.2f",SalarioLiquido());
    }
    
}
