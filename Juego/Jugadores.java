/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Juego;

import javax.swing.*;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author niecabda
 */
public class Jugadores {

    Object[] opcione = {"lancha", "submarino", "buque", "portaviones"};
    Object[] as={"Vertical","Horizontal"};
    static String[] opciones = {"IZQUIERDA", "DERECHA"};
    static int barcoElegido;
    static String portaviones="Portaviones";
    static String buque="Buque";
    static String submarino="Submarino";
    static String lancha="Lancha";
    Object[] opciones2 = {"lancha\n", "submarino", "buque", "portaviones"};
    
        
        
        
        


    public void ColocarLancha() {
        barcoElegido = JOptionPane.showOptionDialog(null,"elige (lancha)","hundir la flota",1,-1,null,as,null);
        // Crear el JTextField para el ingreso de texto
        JTextField textField = new JTextField();
        textField.setColumns(10);  // Establecer el tamaño del JTextField
        
        // Crear el JComboBox para las opciones
       
        JComboBox<String> comboBox = new JComboBox<>(opciones);
        
        // Crear un JPanel y agregar ambos componentes
        JPanel panel = new JPanel();
        panel.add(textField);
        panel.add(comboBox);
        
        // Mostrar el JOptionPane
        int result = JOptionPane.showConfirmDialog(null, panel, "Ingrese texto y seleccione una opción",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        String coordsLancha = textField.getText();
        if (result == JOptionPane.OK_OPTION) {
            System.out.println("Texto ingresado: " + textField.getText());
            System.out.println("Opción seleccionada: " + comboBox.getSelectedItem());
        } else {
            System.out.println("Operación cancelada");
        }
    }

    public void ColocarSubmarino() {
        barcoElegido = JOptionPane.showOptionDialog(null,"elige(submarino)","hundir la flota",1,-1,null,as,null);
         // Crear el JTextField para el ingreso de texto
        JTextField textField = new JTextField();
        textField.setColumns(10);  // Establecer el tamaño del JTextField
        
        // Crear el JComboBox para las opciones
       
        JComboBox<String> comboBox = new JComboBox<>(opciones);
        
        // Crear un JPanel y agregar ambos componentes
        JPanel panel = new JPanel();
        panel.add(textField);
        panel.add(comboBox);
        
        // Mostrar el JOptionPane
        int result = JOptionPane.showConfirmDialog(null, panel, "Ingrese texto y seleccione una opción",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        String coordsSubmarino = textField.getText();
        if (result == JOptionPane.OK_OPTION) {
            System.out.println("Texto ingresado: " + textField.getText());
            System.out.println("Opción seleccionada: " + comboBox.getSelectedItem());
        } else {
            System.out.println("Operación cancelada");
        }
    }

    public void ColocarBuque() {
        barcoElegido = JOptionPane.showOptionDialog(null,"elige(buque)","hundir la flota",1,-1,null,as,null);
         // Crear el JTextField para el ingreso de texto
        JTextField textField = new JTextField();
        textField.setColumns(10);  // Establecer el tamaño del JTextField
        
        // Crear el JComboBox para las opciones
       
        JComboBox<String> comboBox = new JComboBox<>(opciones);
        
        // Crear un JPanel y agregar ambos componentes
        JPanel panel = new JPanel();
        panel.add(textField);
        panel.add(comboBox);
        
        // Mostrar el JOptionPane
        int result = JOptionPane.showConfirmDialog(null, panel, "Ingrese texto y seleccione una opción",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        String coordsBuque = textField.getText();
        if (result == JOptionPane.OK_OPTION) {
            System.out.println("Texto ingresado: " + textField.getText());
            System.out.println("Opción seleccionada: " + comboBox.getSelectedItem());
        } else {
            System.out.println("Operación cancelada");
        }
    }

    public void ColocarPortaviones() {
        barcoElegido = JOptionPane.showOptionDialog(null,"elige(portaviones)","hundir la flota",1,-1,null,as,null);
         // Crear el JTextField para el ingreso de texto
        JTextField textField = new JTextField();
        textField.setColumns(10);  // Establecer el tamaño del JTextField
        
        // Crear el JComboBox para las opciones
       
        JComboBox<String> comboBox = new JComboBox<>(opciones);
        
        // Crear un JPanel y agregar ambos componentes
        JPanel panel = new JPanel();
        panel.add(textField);
        panel.add(comboBox);
        
        // Mostrar el JOptionPane
        int result = JOptionPane.showConfirmDialog(null, panel, "Ingrese texto y seleccione una opción",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        String coordsPortaviones = textField.getText();
        if (result == JOptionPane.OK_OPTION) {
            System.out.println("Texto ingresado: " + textField.getText());
            System.out.println("Opción seleccionada: " + comboBox.getSelectedItem());
        } else {
            System.out.println("Operación cancelada");
        }
    }
    

    public static void main(String[] args) {
        Jugadores jugadores = new Jugadores();
        
        jugadores.ColocarLancha();
        jugadores.ColocarSubmarino();
        jugadores.ColocarBuque();
        jugadores.ColocarPortaviones();
        
    }
}

    

