package edu.mp_oliveira.desafios_de_codigo;

import java.util.*;
public class Fabrica_de_Carros{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        float custoFabrica = scan.nextFloat();
        float porcentagemDistribuidor = scan.nextFloat();
        float PercentualImpostos = scan.nextFloat();

        float custoConsumidor;
        float Distribuidor;
        float ValorImpostos;

        // TODO: Implemente uma condição que calcule a porcentagem do distribuidor e dos impostos:

        ValorImpostos = custoFabrica * PercentualImpostos / 100;
        Distribuidor = custoFabrica * porcentagemDistribuidor / 100;
        custoConsumidor = custoFabrica + ValorImpostos + Distribuidor;


        System.out.println(custoConsumidor);
    }
}
