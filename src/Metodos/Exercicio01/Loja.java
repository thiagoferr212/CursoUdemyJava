package Metodos.Exercicio01;

import java.util.Scanner;

public class Loja{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto prod = new Produto();

        System.out.println("Insisra os dados abaixo:");
        System.out.print("Nome:");
        prod.nome = sc.nextLine();
        System.out.print("Preço:");
        prod.preco = sc.nextDouble();
        System.out.print("Quantidade:");
        prod.quantidade = sc.nextInt();

        System.out.printf("%nDados do produto: %nnome: %s %nvalor: $%.2f %nquantidade: %d %nTotal: $%.2f%n%n", prod.nome, prod.preco, prod.quantidade, prod.ValorTotal());
        System.out.print("Informe a quantidade para adicionar em estoque: ");
        prod.AddProduto(sc.nextInt());
        System.out.printf("%nDados do produto: %nnome: %s %nvalor: $%.2f %nquantidade: %d %nTotal: $%.2f%n%n", prod.nome, prod.preco, prod.quantidade, prod.ValorTotal());
        System.out.print("Informe a quantidade para retirar do estoque: ");
        prod.RemoveProduto(sc.nextInt());
        System.out.printf("%nDados do produto: %nnome: %s %nvalor: $%.2f %nquantidade: %d %nTotal: $%.2f%n%n", prod.nome, prod.preco, prod.quantidade, prod.ValorTotal());

        sc.close();
    }

}