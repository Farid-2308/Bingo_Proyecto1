/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Cartones.Carton;
import Cartones.GestionCarton;
import Juego.ModoJuego;
import Tablero.Tablero;

/**
 *
 * @author Farid
 */
public class ControladorBingo {
    private ModoJuego modo;
    private Tablero  tablero;
    private GestionCarton gestionCarton;
    

    public ControladorBingo(ModoJuego modo) {
        this.modo = modo;
        tablero = new Tablero();
        gestionCarton = new GestionCarton();
    }
    
  public int siguienteNumero() {
        int numero = modo.obtenerNumero();
        if (numero != -1) {
            tablero.marcarNumeros(numero);
        }
        return numero;
    }
  
  public Carton crearCarton() {
    return gestionCarton.generarCarton();
    }

    public Tablero getTablero() {
        return tablero;
    }
        
    }
    
    
    

