/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Juego;

import Tombola.Tombola;

/**
 *
 * @author Farid
 */
public class ModoAutomatico {
    private Tombola tombola;

    public ModoAutomatico() {
        tombola = Tombola.getInstancia();
    }

    public int obtenerNumero() {
        int numero = tombola.generarNumero();
        return numero;
    }
    
    
    
}
