package br.com.vagner.estruturadados.vetor.teste;

import br.com.vagner.estruturadados.vetor.Vetor;

public class Aula06 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);
        vetor.adiciona("1");
        vetor.adiciona("2");
        vetor.adiciona("3");

        System.out.println(vetor.busca("1"));
    }
}
