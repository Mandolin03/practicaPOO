/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package practicapoo.interfaz;

import practicapoo.jugador.AlmacenDeJugadores;
import practicapoo.palabra.AlmacenDePalabras;
import practicapoo.partida.AlmacenDePartidas;

import javax.swing.*;
/**
 *
 * @author z3rc0
 */
public class Base extends JFrame {

    /**
     * Creates new form Base
     */
    public Base() {
        initComponents();
        pintar(new Sesion(this,null));
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
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        //TODO leer archivos de config y datos

        //TODO instanciar almacen de partidas
        AlmacenDePartidas partidas = new AlmacenDePartidas();

        //TODO instanciar almacen de jugadores
        AlmacenDeJugadores jugadores = new AlmacenDeJugadores();

        //TODO instanciar almacen de palabras
        //AlmacenDePalabras = new AlmacenDePalabras();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Base().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel lienzo;
    // End of variables declaration//GEN-END:variables
    
    
    //Método para actualizar el contenido del JPanel lienzo
    public void pintar(JPanel panel){
          panel.setSize(800,500);
          panel.setLocation(0,0);
          lienzo.removeAll();
          lienzo.add(panel);
          lienzo.revalidate();
          lienzo.repaint(); 
      }

}
