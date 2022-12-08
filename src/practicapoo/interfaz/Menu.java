package practicapoo.interfaz;

import practicapoo.jugador.Jugador;
import javax.swing.*;

/**
 *
 * @author z3rc0
 */
public class Menu extends JPanel {

    private Base frame;
    /**
     * Crea un nuevo menú
     * @param frame Frame sobre el que dibujar el menú
     */
    public Menu(Base frame) {
        initComponents();
        this.frame = frame;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iniciarSesion = new javax.swing.JButton();
        practicar = new javax.swing.JButton();
        salir = new javax.swing.JButton();

        iniciarSesion.setText("Iniciar Sesión");
        iniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarSesionActionPerformed(evt);
            }
        });

        practicar.setText("Practicar");
        practicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                practicarActionPerformed(evt);
            }
        });

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                    .addComponent(practicar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(317, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(iniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(practicar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void practicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_practicarActionPerformed
        // TODO Empezar partida de práctica
    }//GEN-LAST:event_practicarActionPerformed

    private void iniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarSesionActionPerformed
        pintarInicioSesion();

    }//GEN-LAST:event_iniciarSesionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton iniciarSesion;
    private javax.swing.JButton practicar;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables

    private void pintarInicioSesion(){
        JPanel popup = new JPanel();
        JTextField user = new JTextField(20);
        JPasswordField pass = new JPasswordField(20);

        popup.setLayout(new BoxLayout(popup, BoxLayout.Y_AXIS));
        popup.add(new JLabel("Usuario"));
        popup.add(user);
        popup.add(new JLabel("Contraseña"));
        popup.add(pass);

        int i = JOptionPane.showConfirmDialog(
                frame,
                popup,
                "Iniciar sesión",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                new ImageIcon("src/practicapoo/imagenes/w.png")
        );

        //si le has dado a OK y has puesto texto en los TextFields
        if(i == JOptionPane.OK_OPTION && !user.getText().equals("") &&  !(new String(pass.getPassword())).equals("")){

            Jugador j = new Jugador(user.getText(),new String( pass.getPassword()));
            if(frame.getJugadores().autenticar(j)){
                frame.pintar(new Sesion(frame,j));
            }
        }
    }
}
