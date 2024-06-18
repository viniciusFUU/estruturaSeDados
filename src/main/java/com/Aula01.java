package com;

public class Aula01 {
    public static void main(String[] args) {
        Vetores vetores = new Vetores(2);

        try {
            vetores.adiciona("Vinicius");
            vetores.adiciona("Bianca");
            vetores.adiciona("Lorena");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}