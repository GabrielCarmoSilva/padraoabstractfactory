/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casadeeventos;

/**
 *
 * @author user
 */
public class Evento {

    private Casamento casamento;
    private Show show;

    public Evento (FabricaAbstrata fabrica) {
        this.casamento = fabrica.createCasamento();
        this.show = fabrica.createShow();
    }

    public String agendarCasamento() {
        return this.casamento.agendar();
    }

    public String agendarShow() {
        return this.show.agendar();
    }
}
