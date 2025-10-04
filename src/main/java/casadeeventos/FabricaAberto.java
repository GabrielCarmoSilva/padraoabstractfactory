/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casadeeventos;

/**
 *
 * @author user
 */
public class FabricaAberto implements FabricaAbstrata {

    @Override
    public Casamento createCasamento() {
        return new CasamentoAberto();
    }

    @Override
    public Show createShow() {
        return new ShowAberto();
    }
}