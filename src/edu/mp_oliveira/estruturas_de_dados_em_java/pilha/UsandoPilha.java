package edu.mp_oliveira.estruturas_de_dados_em_java.pilha;

public class UsandoPilha {
    public static void main(String[] args) {
        Pilha minhaPinha = new Pilha();

        minhaPinha.push(new No(1));
        minhaPinha.push(new No(2));
        minhaPinha.push(new No(3));
        minhaPinha.push(new No(4));
        minhaPinha.push(new No(5));
        minhaPinha.push(new No(6));

        System.out.println(minhaPinha);

        System.out.println(minhaPinha.pop());

        System.out.println(minhaPinha);

        minhaPinha.push(new No(45));

        System.out.println(minhaPinha);



    }
}
