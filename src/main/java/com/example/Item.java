package com.example;

public class Item extends Inventario{

    private float valor;

    public Item(String descricao, float valor){
        super(descricao);
        this.valor = valor;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getConteudo(){
        return "Item: " + this.getDescricao() + " - Valor: " + this.getValor() + "\n";
    }

}
