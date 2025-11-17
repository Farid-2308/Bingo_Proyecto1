/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControladorBingo;

import Cartones.Carton;
import Cartones.ServicioCarton;
import Excepciones.NumeroInvalidoException;
import Ganar.TipoJuego;
import Ganar.VerificarGanador;
import Tablero_TombolaServicio.ServicioJuego;
import java.util.HashSet;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author nazar
 */
public class controladorbingo {

    private final ServicioJuego serviciojuego;
    private final ServicioCarton serviciocarton;
    private TipoJuego tipojuegoselec;

    public controladorbingo() {
        this.serviciojuego = new ServicioJuego();
        this.serviciocarton = new ServicioCarton();
        this.tipojuegoselec = TipoJuego.LINEA;
    }

    //Parte Carton
    public TipoJuego getTipojuegoselec() {
        return tipojuegoselec;
    }

    public void setTipojuegoselec(TipoJuego tipojuegoselec) {
        this.tipojuegoselec = tipojuegoselec;
    }

    public Carton CrearCartonAutomatico(String id) throws NumeroInvalidoException {
        return serviciocarton.CrearCartonAutomatico(id);
    }

    public Carton crearCartonManual(String id, int[][] numeros) throws NumeroInvalidoException {
        return serviciocarton.crearCartonManual(id, numeros);
    }

    //Parte Tabletombola
    public void Reinicio() {
        serviciojuego.ReiniciarJuego();
        serviciocarton.ReiniciarMarcasTodos();
    }

    public List<Carton> obtenerGanadores() {
        ImageIcon icono = new ImageIcon(getClass().getResource("/IMG/CelebrarPoP.png"));
        VerificarGanador verificar = new VerificarGanador();
        HashSet<Carton> cartones = serviciocarton.ObtenerTodos();
        switch (tipojuegoselec) {
            case TipoJuego.LINEA -> {
                for (Carton c : cartones) {
                    if (verificar.verificarLineaHorizontal(c.getMarcar())) {
                        JOptionPane.showMessageDialog(null, "¡Tenemos un ganador con Linea Horizontal!", "¡BINGO!", JOptionPane.PLAIN_MESSAGE, icono);
                    } else if (verificar.verificarDiagonal(c.getMarcar())) {
                        JOptionPane.showMessageDialog(null, "¡Tenemos un ganador con Linea Diagonal!", "¡BINGO!", JOptionPane.PLAIN_MESSAGE, icono);
                    } else if (verificar.verificarLineaVertical(c.getMarcar())) {
                        JOptionPane.showMessageDialog(null, "¡Tenemos un ganador con Linea Vertical!", "¡BINGO!", JOptionPane.PLAIN_MESSAGE, icono);
                    }
                }
            }
            case TipoJuego.CUATRO_ESQUINAS -> {
                for (Carton c : cartones) {
                    if (verificar.verificarCuatroEsquinas(c.getMarcar())) {
                        JOptionPane.showMessageDialog(null, "¡¡Tenemos un ganador de Cuatro Esquinas!!", "¡BINGO!", JOptionPane.PLAIN_MESSAGE, icono);
                    }
                }
            }
            case TipoJuego.LLENO -> {
                for (Carton c : cartones) {
                    if (verificar.verificarCuatroEsquinas(c.getMarcar())) {
                        JOptionPane.showMessageDialog(null, "¡¡¡¡¡¡CARTON LLENOOO!!!!!!", "¡BINGO!", JOptionPane.PLAIN_MESSAGE, icono);
                    }
                }
            }
        }
        return null;
    }
    
    public boolean[] getNumerosSalidos() {
        return serviciojuego.getTomb().numerosSalidos;
    }

    
    
}
