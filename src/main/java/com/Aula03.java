package com;

public class Aula03 {
    public static void main(String[] args) {
        Vetores vetores = new Vetores(3);
        
        try {
            vetores.adiciona("Elemento 1");
            vetores.adiciona("Elemento 2");
            vetores.adiciona("Elemento 3");

            System.out.println(vetores.busca("Elemento 1"));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
