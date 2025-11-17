/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cartones;

import Excepciones.NumeroInvalidoException;

/**
 *
 * @author duvan
 */
public class ServicioCarton {

    private GestionCarton gestion;

    public ServicioCarton() {
        this.gestion = GestionCarton.getInstancia();
    }

    public Carton CrearCartonAutomatico(String id) {
        Carton c = new Carton(id);
        c.LlenarAuto();
        gestion.Guardar(c);
        return c;
    }

    public Carton crearCartonManual(String id, int[][] numeros) throws NumeroInvalidoException {
        Carton c = new Carton(id);

        for (int fila = 0; fila < 5; fila++) {
            for (int col = 0; col < 5; col++) {
                
                if (fila == 2 && col == 2) {
                    continue;
                }
                
                int num = numeros[fila][col];

                boolean ok = c.LLenarManual(num);
                if (!ok) {
                    throw new NumeroInvalidoException("El número: " + num + " que ha ingresado es invalido(Fuera de rango o Repetido)");
                }
            }
        }

        gestion.Guardar(c);
        return c;
    }

    public Carton ObtenerCartonEnHashMap(String id) {
        return gestion.BuscarPorId(id);
    }

    public void EliminarCartonEnHashMap(String id) {
        Carton c = gestion.BuscarPorId(id);
        if (c != null) {
            gestion.Eliminar(c);
        }
    }
}
