package Metodos.Exercicio04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno nota = new Aluno();

        System.out.print("Nome: ");
        nota.nome = sc.nextLine();
        System.out.print("Nota 1: ");
        nota.nota1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        nota.nota2 = sc.nextDouble();
        System.out.print("Nota 3: ");
        nota.nota3 = sc.nextDouble();

        if (nota.notaFinal() > 60.00) {
            System.out.printf("Nota Final = %.2f %n", nota.notaFinal());
            System.out.println("PASSOU!");
        }
        else{
            System.out.printf("Nota Final = %.2f %n", nota.notaFinal());
            System.out.println("FALHOU!");
            System.out.printf("Faltam %.2f pontos para passar %n", nota.pontosRestantes());
        }

        sc.close();
    }
    
}
