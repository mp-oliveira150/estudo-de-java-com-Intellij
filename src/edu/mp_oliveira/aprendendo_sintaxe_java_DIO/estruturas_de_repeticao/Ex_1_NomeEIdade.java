package edu.mp_oliveira.aprendendo_sintaxe_java_DIO.estruturas_de_repeticao;

import java.util.Scanner;

public class Ex_1_NomeEIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome = "";
        int idade;
        while (true){
            System.out.println("Digite seu nome.");
            nome = scanner.next();
            if (nome.equals("0")) break;
            System.out.println("Digite sua idade.");
            idade = scanner.nextInt();

            System.out.println("Nome: " + nome + " Idade: " + idade);
        }
        System.out.println("Continua aqui...");
    }
}
