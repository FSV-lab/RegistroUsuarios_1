
package vista;

import modelo.Usuario;


public class Programa extends javax.swing.JFrame {
     Usuario usuario;
   
    public Programa() {
        initComponents();
    }
public Programa (Usuario usuario){
    initComponents();
    setLocationRelativeTo(null);
    this.usuario = usuario; //privilegios de usuario
    
    etiquetaNombre.setText(usuario.getNombre());
    etiquetaRol.setText(usuario.getNombreRol());
    
    //condicional para asignar privilegios a administrador y usuario
    if(usuario.getIdTipo_usuario()== 1){//permiso de usuario 1 administrador se deja vacio para todos
        
    }
    else if(usuario.getIdTipo_usuario()== 2){
        menuProveedores.setVisible(false);//desabilitamos menu para el usuario
        subMenuAgregarProducto.setVisible(false);//desabilitamos submenu para agregar un producto
    }
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        etiquetaNombre = new javax.swing.JLabel();
        etiquetaRol = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        submenuModificarProducto = new javax.swing.JMenu();
        subMenuAgregarProducto = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        subMenuCatalogoProductos = new javax.swing.JMenuItem();
        menuProveedores = new javax.swing.JMenu();
        submenuAgregarProveedor = new javax.swing.JMenuItem();
        subMenuCatalogoProveedores = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("SISTEMA DE GESTION ");

        etiquetaNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        etiquetaRol.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(etiquetaRol, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(etiquetaNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(281, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(etiquetaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etiquetaRol, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(315, Short.MAX_VALUE))
        );

        submenuModificarProducto.setText("Productos");

        subMenuAgregarProducto.setText("Agregar Producto");
        submenuModificarProducto.add(subMenuAgregarProducto);

        jMenuItem1.setText("Modificar Producto");
        submenuModificarProducto.add(jMenuItem1);

        subMenuCatalogoProductos.setText("Catalogos de Productos");
        submenuModificarProducto.add(subMenuCatalogoProductos);

        jMenuBar1.add(submenuModificarProducto);

        menuProveedores.setText("Proveedores");

        submenuAgregarProveedor.setText("Agregar Proveedor");
        menuProveedores.add(submenuAgregarProveedor);

        subMenuCatalogoProveedores.setText("Catalogo de Proveedores");
        menuProveedores.add(subMenuCatalogoProveedores);

        jMenuBar1.add(menuProveedores);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Programa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel etiquetaRol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu menuProveedores;
    private javax.swing.JMenuItem subMenuAgregarProducto;
    private javax.swing.JMenuItem subMenuCatalogoProductos;
    private javax.swing.JMenuItem subMenuCatalogoProveedores;
    private javax.swing.JMenuItem submenuAgregarProveedor;
    private javax.swing.JMenu submenuModificarProducto;
    // End of variables declaration//GEN-END:variables
}
