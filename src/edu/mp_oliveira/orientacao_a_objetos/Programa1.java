package edu.mp_oliveira.orientacao_a_objetos;

public class Programa1 {

    public static void main(String[] args) {
        Gato gato = new Gato();

        System.out.println(gato);

        Livro livro = new Livro("O pequeno Principe", 96);
        System.out.println(livro);
    }
}
class Livro{
    private String nome;
    private Integer npaginas;

    public Livro(String nome, Integer npaginas){
        this.nome = nome;
        this.npaginas = npaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNpaginas() {
        return npaginas;
    }

    public void setNpaginas(Integer npaginas) {
        this.npaginas = npaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", npaginas=" + npaginas +
                '}';
    }
}
