/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Ganar;

/**
 *
 * @author nazar
 */
public enum TipoJuego {
    LINEA("Linea"),
    CUATRO_ESQUINAS("Cuatro_Esquinas"),
    LLENO("LLeno");

    private final String TipoJuego;

    private TipoJuego(String TipoJuego) {
        this.TipoJuego = TipoJuego;
    }

    public String getTipoJuego() {
        return TipoJuego;
    }

}
