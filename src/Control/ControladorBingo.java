/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Juego.ModoJuego;
import Tablero.Tablero;

/**
 *
 * @author Farid
 */
public class ControladorBingo {
    private ModoJuego modo;
    private Tablero  tablero;

    public ControladorBingo(ModoJuego modo) {
        this.modo = modo;
        tablero = new Tablero();
    }
    
  public int siguienteNumero() {
        int numero = modo.obtenerNumero();
        if (numero != -1) {
            tablero.marcarNumeros(numero);
        }
        return numero;
    }

    public Tablero getTablero() {
        return tablero;
    }
        
    }
    
    
    

