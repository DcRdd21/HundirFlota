/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HundirLaFlota;

/**
 *
 * @author cabdelda
 */
public class Tablero {
    char[][] tablero = new char[10][10];
    
    // Inicializa el tablero
    public void rellenarTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                // Rellenar cada fila con su valor
                tablero[i][j] = 'X';
                System.out.print(tablero[i][j] + " "); // construccion del tablero
            }
            System.out.println(); // imprimir tras cada iteracion
        }
    }
public String tableroAString(){
    String tbmostrar="";
    for (int i = 0; i < tablero.length; i++) {
        for (int j = 0; j < tablero[i].length; j++) {
            tbmostrar += tablero[i][j]+"       ";
        }
        tbmostrar += '\n' ;
        
    }
    System.out.println(tbmostrar);
    return tbmostrar;
}

public void actualizarMovimiento(int x, int y) {
    
    tablero[x][y] = 'A';
}

}
