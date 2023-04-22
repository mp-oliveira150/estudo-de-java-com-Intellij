package edu.mp_oliveira.funcoes;

import java.util.Scanner;

public class Cauculadora {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x, y;
        System.out.println("Digite o primeiro valor: ");
        x = scanner.nextInt();
        System.out.println("Digite o segundo valor: ");
        y = scanner.nextInt();

        int somar = somar(x, y);
        int subtrair = subtrair(x, y);
        int multiplicar = multiplicar(x, y);
        float dividir = dividir(x, y);

        System.out.println("Soma = " + somar);
        System.out.println("Subtração = " + subtrair);
        System.out.println("Multiplicação = " + multiplicar);
        System.out.println("Divisão = " + dividir);
    }

    public static int somar(int x, int y) {
        return x + y;
    }

    public static int subtrair(int x, int y) {
        return x - y;
    }

    public static int multiplicar(int x, int y) {
        return x * y;
    }

    public static float dividir(int x, int y) {
        return x / y;
    }
}
