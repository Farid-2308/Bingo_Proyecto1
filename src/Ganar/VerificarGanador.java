/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ganar;

/**
 *
 * @author Farid
 */
public class VerificarGanador {
     public boolean verificarLineaHorizontal(boolean[][] marcados) {
         for (int fila = 0; fila < 5; fila++) {
            boolean lineaCompleta = true;
            for (int col = 0; col < 5; col++) {
                if (!marcados[fila][col]) {
                    lineaCompleta = false;
                    break;
                }
            }
            if (lineaCompleta) return true;
        }
        return false;
    }

    public boolean verificarLineaVertical(boolean[][] marcados) {
        for (int col = 0; col < 5; col++) {
            boolean lineaCompleta = true;
            for (int fila = 0; fila < 5; fila++) {
                if (!marcados[fila][col]) {
                    lineaCompleta = false;
                    break;
                }
            }
            if (lineaCompleta) return true;
        }
        return false;
    }

    public boolean verificarDiagonal(boolean[][] marcados) {
          boolean diagonal1 = true;
        boolean diagonal2 = true;

        for (int i = 0; i < 5; i++) {
            if (!marcados[i][i]) diagonal1 = false;
            if (!marcados[i][4 - i]) diagonal2 = false;
        }

        return diagonal1 || diagonal2;
    }

    public boolean verificarCuatroEsquinas(boolean[][] marcados) {
        return marcados[0][0] && marcados[0][4] && marcados[4][0] && marcados[4][4];
    }

    public boolean verificarCartonLleno(boolean[][] marcados) {
        for (int fila = 0; fila < 5; fila++) {
            for (int col = 0; col < 5; col++) {
                if (!marcados[fila][col]) return false;
            }
        }
        return true;
    }
    
    
}
