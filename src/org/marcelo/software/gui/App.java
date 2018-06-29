package org.marcelo.software.gui;

import com.jtattoo.plaf.luna.LunaLookAndFeel;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import excepciones.UsuarioInvalidoException;

/**
 *
 * @author Marce
 */
public class App extends javax.swing.JFrame {

    /**
     * Creates new form App
     */
    private String nombreDeLogin;
    private String claveDeLogin;

    public App() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        jfrSesion.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jfrSesion = new javax.swing.JFrame();
        lblNombreLogin = new javax.swing.JLabel();
        lblClaveLogin = new javax.swing.JLabel();
        txtNombreLogin = new javax.swing.JTextField();
        txtClaveLogin = new javax.swing.JTextField();
        btnOk = new javax.swing.JButton();

        javax.swing.GroupLayout jfrSesionLayout = new javax.swing.GroupLayout(jfrSesion.getContentPane());
        jfrSesion.getContentPane().setLayout(jfrSesionLayout);
        jfrSesionLayout.setHorizontalGroup(
            jfrSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jfrSesionLayout.setVerticalGroup(
            jfrSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNombreLogin.setText("Nombre:");

        lblClaveLogin.setText("Clave");

        btnOk.setText("Ok");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNombreLogin)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombreLogin))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblClaveLogin)
                        .addGap(32, 32, 32)
                        .addComponent(txtClaveLogin)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreLogin)
                    .addComponent(txtNombreLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblClaveLogin)
                    .addComponent(txtClaveLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnOk)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed

        try {
            verificarDatos();
        } catch (UsuarioInvalidoException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnOkActionPerformed

    public void verificarDatos() throws UsuarioInvalidoException, IOException {

        String nombreIngresado = txtNombreLogin.getText();
        String claveIngresada = txtClaveLogin.getText();

        leerArchivoDeLogin();

        try {

            if (nombreIngresado.equals(nombreDeLogin) && claveIngresada.equals(claveIngresada)) {
                jfrSesion.setBounds(WIDTH, WIDTH, 260, 230);
                jfrSesion.setLocationRelativeTo(null);
                jfrSesion.setVisible(true);
                this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
                JOptionPane.showMessageDialog(null, "Bienvenido");

            } else if (!nombreIngresado.equals(nombreDeLogin) || !claveIngresada.equals(claveIngresada)) {
                throw new UsuarioInvalidoException("Datos invalidos");
            }

        } catch (UsuarioInvalidoException ui) {
            JOptionPane.showMessageDialog(null, ui.getMessage());

        } finally {
            txtNombreLogin.setText("");
            txtClaveLogin.setText("");

        }

    }

    public void crearArchivoDeLogin() {
        Properties p = new Properties();
        p.put("Nombre", "admin");
        p.put("Clave", "admin");

        try {
            File archivo = new File("config.properties");
            FileWriter fw = new FileWriter(archivo);
            p.store(fw, "Datos admin");
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void leerArchivoDeLogin() throws FileNotFoundException, IOException {
        File config = new File("config.Properties");
        Properties p = new Properties();

        if (config.exists()) {
            FileReader fr = new FileReader(config);
            p.load(fr);
            nombreDeLogin = p.getProperty("Nombre");
            claveDeLogin = p.getProperty("Clave");
        }else if(!config.exists()){
            crearArchivoDeLogin();
            
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            UIManager.setLookAndFeel(new LunaLookAndFeel());
        } catch (Exception e) {
            e.printStackTrace();
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOk;
    private javax.swing.JFrame jfrSesion;
    private javax.swing.JLabel lblClaveLogin;
    private javax.swing.JLabel lblNombreLogin;
    private javax.swing.JTextField txtClaveLogin;
    private javax.swing.JTextField txtNombreLogin;
    // End of variables declaration//GEN-END:variables
}
