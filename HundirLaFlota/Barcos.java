/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HundirLaFlota;

/**
 *
 * @author cabdelda
 */
public abstract class Barcos 
{
  protected String Nombre;
  protected char id;
  protected int longitud;
  protected boolean hundido;

    public Barcos(String Nombre, char id, int longitud, boolean hundido) {
        this.Nombre = Nombre;
        this.id = id;
        this.longitud = longitud;
        this.hundido = hundido;
    }

    public boolean isHundido() {
        return hundido;
    }

    public void setHundido(boolean hundido) {
        this.hundido = hundido;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public char getId() {
        return id;
    }

    public void setId(char id) {
        this.id = id;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
 
}
