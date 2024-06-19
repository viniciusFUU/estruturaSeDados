package com;

public class Aula05{
    public static void main(String[] args) {
        Vetores vetor = new Vetores(6);
        
        try {
            vetor.adiciona("Elemento 1");
            vetor.adiciona("Elemento 2");
            vetor.adiciona("Elemento 3");
            vetor.adiciona("Elemento 4");
            vetor.adiciona("Elemento 5");
            vetor.adiciona("Elemento 6");
        } catch (Exception e) {
            e.printStackTrace();
        }

        vetor.adiciona(3, "Elemento add");
    }
}