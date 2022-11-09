
package vista;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class Inicio extends javax.swing.JFrame {
  public static Registro registro ;
  public static IniciarSesión iniciarSesion;
    
    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonRegistrar = new javax.swing.JButton();
        botonIniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonRegistrar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonRegistrar.setText("Registrar");
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
            }
        });

        botonIniciar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonIniciar.setText("Iniciar Sesión");
        botonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(botonRegistrar)
                .addGap(40, 40, 40)
                .addComponent(botonIniciar)
                .addContainerGap(122, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(148, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonRegistrar)
                    .addComponent(botonIniciar))
                .addGap(146, 146, 146))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
        if(registro == null){//comprueba que si no hay ventanas de registro la abre
            registro = new Registro();
            registro.setVisible(true);
        }
    }//GEN-LAST:event_botonRegistrarActionPerformed

    private void botonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniciarActionPerformed
        if(iniciarSesion== null){
            iniciarSesion = new IniciarSesión();
            iniciarSesion.setVisible(true);
        }
    }//GEN-LAST:event_botonIniciarActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
      try {//capturar todo con el try cachtlas exceptiones
          // Look and Feel para cambiar la interfaz grafica
          UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");// nombre paquete y nombre la clase look and feel  
      } catch (ClassNotFoundException ex) {
          //Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
          //Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
          //Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
      } catch (UnsupportedLookAndFeelException ex) {
          //Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonIniciar;
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
