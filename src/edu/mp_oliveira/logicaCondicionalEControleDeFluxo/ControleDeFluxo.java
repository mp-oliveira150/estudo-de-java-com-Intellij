package edu.mp_oliveira.logicaCondicionalEControleDeFluxo;

import java.util.Scanner;

//são estruturas que direcionam código de acordo com as condições impostas
public class ControleDeFluxo {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ditite um número de 1 a 12.");
        int mes;
        mes = scanner.nextInt();

        if (mes == 1){
            System.out.println("Janeiro");
        } else if (mes == 2) {
            System.out.println("Fevereiro");
        } else if (mes == 3) {
            System.out.println("Março");
        } else if (mes == 4) {
            System.out.println("Abril");
        } else if (mes == 5) {
            System.out.println("Maio");
        } else if (mes == 6) {
            System.out.println("Junho");
        } else if (mes == 7) {
            System.out.println("Julho");
        } else if (mes == 8) {
            System.out.println("Agosto");
        } else if (mes == 9) {
            System.out.println("Setembro");
        } else if (mes == 10) {
            System.out.println("Outubro");
        } else if (mes == 11) {
            System.out.println("Novembro");
        } else if (mes == 12) {
            System.out.println("Dezembro");
        }else System.out.println("Mês inesistente");

        switch (mes) {
            case 1, 2, 3 -> System.out.println("É férias");
        }

        String semana;
        System.out.println("Digite o dia da semana.");
        semana = scanner.next();
        int semana2 = switch (semana) {
            case "segunda" -> 1;
            case "terca" -> 2;
            case "quarta" -> 3;
            case "quinta" -> 4;
            case "sexta" -> 5;
            case "sabado" -> 6;
            case "domingo" -> 7;
            default -> 0;
        };
        if (semana2 != 0) {
                System.out.println((semana) + " É o " + (semana2) + "º dia da semana.");
            }else System.out.println("Dia da semana inválido");


        int numero;
        System.out.println("Digite um número de 1 a 5.");
        numero = scanner.nextInt();
        String resposta = switch (numero) {
            case 1, 2, 3 -> "Certo";
            case 4 -> "Errado";
            case 5 -> "Talvez";
            default -> "Valor indefinido";
        };

        System.out.print(resposta);

    }
}
