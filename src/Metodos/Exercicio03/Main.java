package Metodos.Exercicio03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Empregado empregado = new Empregado();

    System.out.print("Nome: ");
    empregado.nome = sc.nextLine();
    System.out.print("Salário Bruto: ");
    empregado.salarioBruto = sc.nextDouble();
    System.out.print("Imposto: ");
    empregado.imposto = sc.nextDouble();

    System.out.println("Empregado: " + empregado.toString());
    System.out.print("Informe o percentual de acréssimo do salário: ");
    empregado.IncluirSal(sc.nextDouble());
    System.out.println("Atualização: " + empregado.toString());

    sc.close();
    }
    
}
