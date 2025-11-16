/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cartones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author duvan
 */
public class GestionCarton {
    private Map<String,Carton> Cartones= new HashMap<>();
    
    // AGREGUE ESTO:
    public Carton generarCarton() {
        int[][] matriz = new int[5][5];

        for (int col = 0; col < 5; col++) {
            matriz[col] = generarColumna(col);
        }
        return new Carton(matriz);
    }
    
    private int[] generarColumna(int columna) {
        int inicio = columna * 15 + 1;
        int fin = inicio + 14;

        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = inicio; i <= fin; i++) {
            lista.add(i);
        }
// REVIDE ESTO
        Collections.shuffle(lista);

        int[] numeros = new int[5];
        for (int i = 0; i < 5; i++) {
            numeros[i] = lista.get(i);
        }

        return numeros;
    }
    
    //HASTA AQUI;
    
    public void Guardar(Carton c){
        Cartones.put(c.getId(), c);
    }
    
    public void Eliminar(Carton c){
        Cartones.remove(c.getId());
    }
    
    public Carton BuscarPorId(String id){
        return Cartones.get(id);
    }
    
    public Carton BuscarConCarton(Carton c){
        return Cartones.get(c.getId());
    }
}
