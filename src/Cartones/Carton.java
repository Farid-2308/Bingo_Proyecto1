/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cartones;


/**
 *
 * @author duvan
 */
public class Carton {

    private String Id;
    private int[][] numeros;
    private boolean[][] marcar;

    public String getId() {
        return Id;
    }

    public int[][] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[][] numeros) {
        this.numeros = numeros;
    }

    public boolean[][] getMarcar() {
        return marcar;
    }

    public void setMarcar(boolean[][] marcar) {
        this.marcar = marcar;
    }

    public Carton(String Id) {
        this.Id = Id;
        this.numeros = new int[5][5];
        this.marcar = new boolean[5][5];
        this.marcar[2][2] = true;//Se marca automaticamente el centro como libre
    }

    public boolean LLenarManual(int Num) {
        if (Buscar(Num)) {
            return false;
        }
        for (int columnas = 0; columnas < 5; columnas++) {
            for (int filas = 0; filas < 5; filas++) {
                if (filas == 2 && columnas == 2) {
                    continue;
                }
                if (ValidarLugarNum(Num, columnas) && numeros[filas][columnas] == 0) {
                    numeros[filas][columnas] = Num;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean ValidarLugarNum(int validando, int columna) { //Boolean: True=Está bien  False=Está mal
        
        if (validando >= 1 && validando <= 15 && columna == 0) {
            return true;
        } else if (validando >= 16 && validando <= 30 && columna == 1) {
            return true;
        } else if (validando >= 31 && validando <= 45 && columna == 2) {
            return true;
        } else if (validando >= 46 && validando <= 60 && columna == 3) {
            return true;
        } else if (validando >= 61 && validando <= 75 && columna == 4) {
            return true;
        }else{
            return false;
        }
    }

    public void LlenarAuto() {
        int numero = 0;
        for (int columnas = 0; columnas < 5; columnas++) {
            for (int filas = 0; filas < 5; filas++) {
                switch (columnas) {
                    case 0 -> {
                        if (filas == 2 && columnas == 2) {
                            continue;
                        }
                        numero = (int) (Math.random() * 15) + 1;
                        if (!Buscar(numero)) {
                            numeros[filas][columnas] = numero;
                        } else {
                            filas--;
                        }

                    }
                    case 1 -> {
                        if (filas == 2 && columnas == 2) {
                            continue;
                        }
                        numero = (int) (Math.random() * 15) + 16;
                        if (!Buscar(numero)) {
                            numeros[filas][columnas] = numero;
                        } else {
                            filas--;
                        }
                    }
                    case 2 -> {
                        if (filas == 2 && columnas == 2) {
                            continue;
                        }
                        numero = (int) (Math.random() * 15) + 31;
                        if (!Buscar(numero)) {
                            numeros[filas][columnas] = numero;
                        } else {
                            filas--;
                        }
                    }
                    case 3 -> {
                        if (filas == 2 && columnas == 2) {
                            continue;
                        }
                        numero = (int) (Math.random() * 15) + 46;
                        if (!Buscar(numero)) {
                            numeros[filas][columnas] = numero;
                        } else {
                            filas--;
                        }
                    }
                    case 4 -> {
                        if (filas == 2 && columnas == 2) {
                            continue;
                        }
                        numero = (int) (Math.random() * 15) + 61;
                        if (!Buscar(numero)) {
                            numeros[filas][columnas] = numero;
                        } else {
                            filas--;
                        }
                    }
                    default -> {
                    }
                }
            }
        }
    }

    public boolean Buscar(int NumBuscar) {
        for (int columnas = 0; columnas < 5; columnas++) {
            for (int filas = 0; filas < 5; filas++) {
                if (NumBuscar == numeros[filas][columnas]) {
                    return true;
                }
            }
        }
        return false;
    }

    public void MarcarNum(int filas, int columnas) {
        this.marcar[filas][columnas] = true;
    }

}
