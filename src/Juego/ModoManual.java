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
public class ModoManual  {
    private Tombola tombola;

    public ModoManual(Tombola tombola) {
        this.tombola = tombola;
    }
    
    public int obtenerNumero(int num) {
        boolean valido = tombola.registrarNumero(num);
        if (!valido) {
            return -1;
        }
        return num;
    } 
    
    
    
}
