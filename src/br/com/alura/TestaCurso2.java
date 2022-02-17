package br.com.alura;

import java.util.List;

public class TestaCurso2 {
    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as colecoes Java", "Paulo Silveira");
        List<Aula> aulas = javaColecoes.getAulas();

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 15));

        List<Aula> aulasImutaveis = javaColecoes.getAulas();
        System.out.println(javaColecoes.getTempoTotal());

    }
}
