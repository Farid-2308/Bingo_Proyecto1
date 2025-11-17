/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Juego;

/**
 *
 * @author Farid
 */
public enum ModoJuego {
    MODO_AUTOMATICO("Modo_Automatico"),
    MODO_MANUAL("Modo_Manual");
    
    private final String ModoJuego;

    private ModoJuego(String ModoJuego) {
        this.ModoJuego = ModoJuego;
    }

    public String getModoJuego() {
        return ModoJuego;
    }
    
}
