/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tablero_TombolaServicio;

import Tablero.Tablero;
import Tombola.Tombola;



/**
 *
 * @author nazar
 */
public class ServicioJuego {
    private Tablero tabl;
    private Tombola tomb;

    public ServicioJuego() {
        this.tabl = Tablero.getInstancia();
        this.tomb = Tombola.getInstancia();
    }

    public Tablero getTabl() {
        return tabl;
    }
    
    public int SiguienteAutomatico() {
        int num=tomb.generarNumero();
        if(num!=-1){
            tabl.marcarNumeros(num);
        }
        return num;
    }
    
    public int RegistrarSiguienteNum(int num){
        if(tomb.registrarNumero(num)){
            tabl.marcarNumeros(num);
            return num;
        }
        return -1;
    }
    
    public void ReiniciarJuego(){
        tomb.reinciar();
        tabl.reiniciar();
        
    }
}
