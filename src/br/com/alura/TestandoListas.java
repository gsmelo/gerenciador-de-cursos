package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

    public static void main(String[] args) {
        String aula1 = "Conhecendo mais de listas";
        String aula2 = "Modelando a classe Aula";
        String aula3 = "Trabalhando com Cursos e Sets";

        //Criação da ArrayList de Strings

        ArrayList<String> aulas = new ArrayList<>();

        //Adição de Strings à ela

        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);

        // Remoção de Strings

        aulas.remove(0);

        System.out.println(aulas);

        // Percorrer a lista

        for (String aula : aulas) {
            System.out.println("Aula: " + aula);
        }

        // Pegar uma string pelo indíce

        String aulaEspecifica = aulas.get(0);
        System.out.println("A primeira aula é: " + aulaEspecifica);

        // Percorrer a lista com forEach

        aulas.forEach(aula -> {System.out.println("Percorrendo: " + aula);});

        // Utilizando métodos da classe Collections

        aulas.add("Aumentando nosso conhecimento");
        aulas.add("Organizando o que já aprendemos");

        System.out.println("Antes da ordenação: " + aulas);

        Collections.sort(aulas);
        System.out.println("Depois da ordenação: " + aulas);


    }
}
