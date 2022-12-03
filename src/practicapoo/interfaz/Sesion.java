package practicapoo.interfaz;

import javax.swing.*;
import practicapoo.jugador.Jugador;

/**
 *
 * @author z3rc0
 */
public class Sesion extends javax.swing.JPanel {
    
    private Jugador jugador;
    private Base frame;
    /**
     * Creates new form Sesion
     * @param frame
     * @param jugador
     */
    public Sesion(Base frame, Jugador jugador) {
        initComponents();
        this.frame = frame;
        this.jugador = jugador;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jugar = new javax.swing.JButton();
        estadisticas = new javax.swing.JButton();
        partidasOtro = new javax.swing.JButton();
        cerrarSesion = new javax.swing.JButton();

        jugar.setText("Jugar!");

        estadisticas.setText("Ver estadísticas");
        estadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadisticasActionPerformed(evt);
            }
        });

        partidasOtro.setText("Ver partidas contra otro");
        partidasOtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                partidasOtroActionPerformed(evt);
            }
        });

        cerrarSesion.setText("Cerrar sesion");
        cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(estadisticas)
                            .addComponent(jugar)
                            .addComponent(cerrarSesion)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(318, 318, 318)
                        .addComponent(partidasOtro)))
                .addContainerGap(326, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jugar)
                .addGap(64, 64, 64)
                .addComponent(estadisticas)
                .addGap(59, 59, 59)
                .addComponent(partidasOtro)
                .addGap(41, 41, 41)
                .addComponent(cerrarSesion)
                .addContainerGap(158, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void estadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadisticasActionPerformed
        JOptionPane.showMessageDialog(frame,jugador.getEstadisticas().toString(),"Estadísticas",0,new ImageIcon("src/practicapoo/imagenes/Stats.png"));
    }//GEN-LAST:event_estadisticasActionPerformed

    private void partidasOtroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_partidasOtroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_partidasOtroActionPerformed

    private void cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionActionPerformed
        frame.pintar(new Menu(frame));
    }//GEN-LAST:event_cerrarSesionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cerrarSesion;
    private javax.swing.JButton estadisticas;
    private javax.swing.JButton jugar;
    private javax.swing.JButton partidasOtro;
    // End of variables declaration//GEN-END:variables

    public void setJugador(Jugador j){
        this.jugador = j;
        //TODO hacer interfaz de inicio de sesión que llame a este método
    }
}
