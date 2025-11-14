/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tablero;

/**
 *
 * @author Farid
 */
public class Tablero {
    private boolean[] numCantado;
    
    public Tablero() {
        numCantado = new boolean[76];
    }
    
    public void marcarNumeros(int numero) {
        if (numero >=1 && numero <= 75){
            numCantado[numero] = true;
        }
    }
    
    public boolean estaCantado(int numero) {
        if (numero >= 1 && numero <= 75) {
            return numCantado[numero];
        }
        return false;
    }
    
    public void reiniciar() {
        for (int i = 1; i <= 75; i++) {
            numCantado[i] = false;
        }
    }
    
}
