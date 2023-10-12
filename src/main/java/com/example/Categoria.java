package com.example;

import java.util.ArrayList;
import java.util.List;

public class Categoria extends Inventario {

    private List <Inventario> inventarios;

    public Categoria (String descricao){
        super(descricao);
        this.inventarios = new ArrayList<Inventario>();
    }

    public void addInventario (Inventario inventario){
        this.inventarios.add(inventario);
    }

    public String getConteudo(){
        String saida = "";
        saida = "Categoria: " + this.getDescricao() + "\n";
        for (Inventario inventario : inventarios){
            saida += inventario.getConteudo();
        }
        return saida;
    }
    
}
