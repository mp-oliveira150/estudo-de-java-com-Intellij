package edu.mp_oliveira.desafios_de_codigo;

import java.util.Scanner;
public class Soma_de_H_com_N_Termos {
    public static void main(String[] args) {
        double h = 0d;
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();

        for (double i = n; i >= 1; i--) {
            //TODO: Calcule o valor de H de forma que resulte na soma dos termos:
            h += 1d/i;

        }
        //TODO: Imprima a soma dos termos, considerando um resultado com duas casas decimais:
        System.out.println(Math.round(h));

    }
}
