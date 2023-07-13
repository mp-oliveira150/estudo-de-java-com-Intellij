package edu.mp_oliveira.estruturas_de_dados_em_java.no_simples;

public class Usando_Projeto_No {
    public static void main(String[] args) {
        Projeto_No no1 = new Projeto_No("Conteúdo nó 1");
        Projeto_No no2 = new Projeto_No("Conteúdo nó 2");

        no1.setProximo_no(no2);

        Projeto_No no3 =  new Projeto_No("Conteúdo nó 3");

        no2.setProximo_no(no3);

        Projeto_No no4 =  new Projeto_No("Conteúdo nó 4");

        no3.setProximo_no(no4);

        System.out.println(no1);
        System.out.println(no1.getProximo_no());
        System.out.println(no1.getProximo_no().getProximo_no());
        System.out.println(no1.getProximo_no().getProximo_no().getProximo_no());
        System.out.println(no1.getProximo_no().getProximo_no().getProximo_no().getProximo_no());


    }
}
