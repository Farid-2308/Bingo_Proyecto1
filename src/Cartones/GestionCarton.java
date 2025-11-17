/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cartones;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 *
 * @author duvan
 */
public class GestionCarton {

    private Map<String, Carton> Cartones = new HashMap<>();
    private static GestionCarton instancia;

    public static GestionCarton getInstancia() {
        if (instancia == null) {
            instancia = new GestionCarton();
        }
        return instancia;
    }

    public void Guardar(Carton c) {
        Cartones.put(c.getId(), c);
    }

    public void Eliminar(String id) {
        Cartones.remove(id);
    }

    public void EliminarPorObjeto(Carton c) {
        Cartones.remove(c.getId(), c);
    }

    public Carton BuscarPorId(String id) {
        return Cartones.get(id);
    }

    public HashSet<Carton> ObtenerTodito() {
        HashSet<Carton> LosCartones = new HashSet<>();
        for(Carton c: Cartones.values()){
            LosCartones.add(c);
        }
        return LosCartones;
    }
}
