package edu.mp_oliveira.estrutura_de_repeticao_e_arrays_em_java.estruturas_de_repeticao;

import java.util.Scanner;

public class Ex4_Par_e_Impar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numMax = 0, numEntrada, count = 0;
        int pares = 0, impares = 0;

        System.out.println("Digite a quantidade máxima de números a serem digitados: ");
        numMax = scan.nextInt();
        do {
            System.out.println("Digite um número: ");
            numEntrada = scan.nextInt();
            if (numEntrada %2 == 0) pares++; else impares++;

            count++;
        }while (count < numMax);
        System.out.printf("Números Ímpares: %d  \nNúmeros Pares: %d \n", impares , pares);
        System.out.println("\n ---------------Quantidade de números impares e pares até um número qualquer--------------\n");

        int numero = 0;
        int numeroEntrada;
        int numPares, numImpares;

        System.out.println("Digite o número: ");
        numeroEntrada = scan.nextInt();
        numero = numeroEntrada %2;
        if (numero == 0){
        numPares = numeroEntrada/2;
        numImpares = numPares;
        }else numImpares = (numeroEntrada/2) + (1); numPares = numeroEntrada/2;

        System.out.println("Números ímpares: " + numImpares +"\n" +
                "Números pares: " + numPares);
    }
}
