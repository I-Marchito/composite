package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class PersonagemTest {

    @Test
    void deveRetornarInventarioBrendan() {
        Categoria categoria1 = new Categoria("Itens Chave");

        Categoria categoria2 = new Categoria("Pokebolas");
        Item item21 = new Item("Pokeball", 200.0f);
        categoria2.addInventario(item21);

        Categoria categoria3 = new Categoria("Itens de Batalha");
        Item item31 = new Item("Poção", 300.0f);
        Item item32 = new Item("XSpeed", 4000.f);
        categoria3.addInventario(item31);
        categoria3.addInventario(item32);

        Categoria inventario = new Categoria("Inventário Brendan:");
        inventario.addInventario(categoria1);
        inventario.addInventario(categoria2);
        inventario.addInventario(categoria3);

        Personagem brendan = new Personagem();
        brendan.setInventario(inventario);

        assertEquals("Categoria: Inventário Brendan:\n" +
                "Categoria: Itens Chave\n" +
                "Categoria: Pokebolas\n" +
                "Item: Pokeball - Valor: 200.0\n" +
                "Categoria: Itens de Batalha\n" +
                "Item: Poção - Valor: 300.0\n" +
                "Item: XSpeed - Valor: 4000.0\n", brendan.getInventario());
    }

    @Test
    void deveRetornarExcecaoInventarioVazio(){
        try {
            Personagem brendan = new Personagem();
            brendan.getInventario();
            fail();
        }
        catch (NullPointerException e){
            assertEquals("Inventário vazio", e.getMessage());
        }
    }
}
