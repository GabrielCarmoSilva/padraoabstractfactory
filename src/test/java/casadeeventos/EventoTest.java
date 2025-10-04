/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casadeeventos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EventoTest {

    @Test
    void deveAgendarCasamentoAberto() {
        FabricaAbstrata fabrica = new FabricaAberto();
        Evento evento = new Evento(fabrica);
        assertEquals("Casamento aberto", evento.agendarCasamento());
    }

    @Test
    void deveAgendarCasamentoFechado() {
        FabricaAbstrata fabrica = new FabricaFechado();
        Evento evento = new Evento(fabrica);
        assertEquals("Casamento fechado", evento.agendarCasamento());
    }

    @Test
    void deveAgendarShowAberto() {
        FabricaAbstrata fabrica = new FabricaAberto();
        Evento evento = new Evento(fabrica);
        assertEquals("Show aberto", evento.agendarShow());
    }

    @Test
    void deveAgendarShowFechado() {
        FabricaAbstrata fabrica = new FabricaFechado();
        Evento evento = new Evento(fabrica);
        assertEquals("Show fechado", evento.agendarShow());
    }

}