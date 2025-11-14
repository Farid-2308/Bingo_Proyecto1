/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tombola;

/**
 *
 * @author Farid
 */
public class Tombola {
    private static Tombola instancia;  //única instancia
    private boolean[] numerosSalidos;
    private int ultimoNumero;

    private Tombola() {
        this.numerosSalidos = new boolean[76];
    }
    
    public static Tombola getInstancia() {
        if (instancia == null) {
            instancia = new Tombola();
        }
             return instancia;   
    }
    
    private boolean todosLosNumerosSalieron() {
        for (int i = 1; i <= 75; i++) {
            if (!numerosSalidos[i]) 
            return false;
        }
        return true;
    }
    
     public int generarNumero() {
        if (todosLosNumerosSalieron()) return -1;
        int numero;
        do {
            numero = (int)(Math.random() * 75) + 1; //1 a 75
        } while (numerosSalidos[numero]);
        numerosSalidos[numero] = true;
        ultimoNumero = numero;
        return numero;
    }
    
     public boolean registrarNumero(int numero) {
         if (numero < 0 || numero > 75 || numerosSalidos[numero]) {
             return false;
         }
         numerosSalidos[numero] = true;
         ultimoNumero = numero;
         return true;
     }
    
     public int reinciar(int numero) {
         for (int i = 1; i < 75; i++) {
             numerosSalidos[i] = false;
         }
         return ultimoNumero = 0;
     }

    public int getUltimoNumero() {
        return ultimoNumero;
    }
    
}
