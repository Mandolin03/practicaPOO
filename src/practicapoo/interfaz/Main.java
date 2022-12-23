/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package practicapoo.interfaz;

import practicapoo.jugador.AlmacenDeJugadores;
import practicapoo.palabra.AlmacenDePalabras;
import practicapoo.partida.AlmacenDePartidas;

import javax.imageio.ImageReader;
import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageProducer;

/**
 * Clase que genera el JFrame Base sobre el que se asientan el resto de paneles
 * Contiene la información de almacenes necesaria para que el programa funcione
 * Contiene el método main, punto de inicio de ejecución del programa
 */
public class Main extends JFrame {

    private AlmacenDeJugadores jugadores;
    private AlmacenDePalabras palabras;
    private AlmacenDePartidas partidas;
    public Main() {

        jugadores = new AlmacenDeJugadores();
        palabras = new AlmacenDePalabras();
        partidas = new AlmacenDePartidas();

        initComponents();
        //TODO Pasar icono a initComponents
        setIconImage(new ImageIcon("resources/Logo.png").getImage());

        pintar(new Menu(this));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lienzo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lingo");
        //setIconImage(new ImageIcon(getClass().getResource("src/practicapoo/archivos/w.png")).getImage());
        setResizable(false);

        javax.swing.GroupLayout lienzoLayout = new javax.swing.GroupLayout(lienzo);
        lienzo.setLayout(lienzoLayout);
        lienzoLayout.setHorizontalGroup(
            lienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        lienzoLayout.setVerticalGroup(
            lienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lienzo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lienzo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Main de la Clase
     * Inicio de funcionamiento del programa
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel lienzo;
    // End of variables declaration//GEN-END:variables


    /**
     * Método para Cambiar el contenido del panel lienzo
     * @param panel Panel para poner sobre el lienzo
     */
    //TODO Cambiar nombre a cambiarContenido
    public void pintar(JPanel panel){
          panel.setSize(800,500);
          panel.setLocation(0,0);
          lienzo.removeAll();
          lienzo.add(panel);
          lienzo.revalidate();
          lienzo.repaint();
          panel.setFocusable(true);
          panel.grabFocus();
      }

    /**
     * Devuelve la lista de jugadores
     * @return Atributo jugadores
     */
    public AlmacenDeJugadores getJugadores() {
        return jugadores;
    }

    /**
     * Devuelve la lista de Palabras
     * @return Atributo palabras
     */
    public AlmacenDePalabras getPalabras() {
        return palabras;
    }

    /**
     * Devuelve la lista de Partidas
     * @return Atributo partidas
     */
    public AlmacenDePartidas getPartidas() {
        return partidas;
    }


}
