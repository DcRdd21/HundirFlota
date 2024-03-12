/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Juego;
/**
 *
 * @author niecabda
 */
public class Tablero {
    public static void rellenarTablero(char[][] tablero) {
    for (int i = 0; i < tablero.length; i++) {
        for (int j = 0; j < tablero[i].length; j++) {
            // Rellenar cada fila con su valor
            tablero[i][j] = 'X';
            System.out.print(tablero[i][j] + " "); // construccion del tablero
        }
        System.out.println(); // imprimir tras cada iteracion
    }
}
}
