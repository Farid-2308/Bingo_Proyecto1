/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Juego;

import Tombola.Tombola;
import java.util.Scanner;

/**
 *
 * @author Farid
 */
public class ModoManual implements ModoJuego {
    private Tombola tombola;

    public ModoManual(Tombola tombola) {
        this.tombola = tombola;
    }
    
    @Override
    public int obtenerNumero() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero cantado:");
        int numero = sc.nextInt();
        boolean valido = tombola.registrarNumero(numero);
        if (!valido) {
            System.out.println("Numero Invalido o Repetido");
            return -1;
        }
        return numero;
    } 
    
}
