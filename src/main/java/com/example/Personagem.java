package com.example;

public class Personagem {
    
    private Inventario inventario;

    public void setInventario (Inventario inventario){
        this.inventario = inventario;
    }

    public String getInventario(){
        if(this.inventario == null){
            throw new NullPointerException("Inventário vazio");
        }
        return this.inventario.getConteudo();
    }
}