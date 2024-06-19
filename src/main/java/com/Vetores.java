package com;

public class Vetores {
    private String[] elementos;
    private int contador = 0;

    public Vetores(int capacidade){
        this.elementos = new String[capacidade];
    }

    public void adiciona(String elemento) throws Exception{
        aumentaCapacidade()
        
        if(elementos.length > contador){
            if (elementos[contador] == null){
                elementos[contador] = elemento;
                contador++;
            }
        } else {
            throw new Exception("Limite do vetor ultrapassado.");
        }
    }

    public int getContador() {
        return contador;
    }

    public String busca(int posicao) throws Exception{
        if (!(posicao >= 0 && posicao < this.contador)){
            throw new IllegalArgumentException("Posição inválida.");
        }
        return elementos[posicao];     
    }

    public int busca(String elemento) throws Exception{
        for (int i = 0; i < this.contador; i++){
            if (elementos[i].equals(elemento)){
                return i;
            }
        }

        return -1;
    }

    public void adiciona(int posicao, String elemento){
        aumentaCapacidade();

        if (!(posicao >= 0 && posicao < this.contador)){
            throw new IllegalArgumentException("Posição inválida.");
        }

        for (int i = contador-1; i >= posicao; i--){
                elementos[i+1] = elementos[i];
            }
    
        elementos[posicao] = elemento;
    }

    public void aumentaCapacidade(){
        if (elementos.length == contador-1){
            String[] elementosNovos = new String[elementos.length * 2];

            for (int i = 0; i < elementos.length){
                elementosNovos[i] = elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public void removeElemento(String elemento){
        for (int i = 0; i < contador; i++){
            if (elemento.equals(elementos[i])){
                for (int j = i; j < contador-1; j++){
                    elementos[j] = elementos[j+1];
                }
                elementos[contador -1] = null;
                contador-=1;
                break;
            }
        }
    }
}
