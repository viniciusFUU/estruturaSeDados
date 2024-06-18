package com;

public class Vetores {
    private String[] elementos;
    private int contador = 0;

    public Vetores(int capacidade){
        this.elementos = new String[capacidade];
    }

    public void adiciona(String elemento) throws Exception{
        if(elementos.length > contador){
            if (elementos[contador] == null){
                elementos[contador] = elemento;
                contador++;
            }
        } else {
            throw new Exception("Limite do vetor ultrapassado.");
        }
    }
}
