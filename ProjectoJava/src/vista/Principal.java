package vista;

import conexiones.*;

public class Principal extends javax.swing.JFrame {

    int cont1 = 0, cont2 = 0, cont3 = 0;

    public Principal() {
        initComponents();
        Conexion.getConexion();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        btnProveedor = new javax.swing.JButton();
        btnProducto = new javax.swing.JButton();
        btnVenta = new javax.swing.JButton();
        tabbed = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        btnProveedor.setText("Proveedores");
        btnProveedor.setFocusable(false);
        btnProveedor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProveedor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedorActionPerformed(evt);
            }
        });
        jToolBar1.add(btnProveedor);

        btnProducto.setText("Productos");
        btnProducto.setFocusable(false);
        btnProducto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProducto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductoActionPerformed(evt);
            }
        });
        jToolBar1.add(btnProducto);

        btnVenta.setText("Ventas");
        btnVenta.setFocusable(false);
        btnVenta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVenta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentaActionPerformed(evt);
            }
        });
        jToolBar1.add(btnVenta);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 916, Short.MAX_VALUE)
            .addComponent(tabbed)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabbed, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentaActionPerformed
        Venta vent = new Venta();
        if (tabbed.getTabCount() == 0) {
            tabbed.addTab("Ventas", vent);

        } else {
            for (int i = 0; i < tabbed.getTabCount(); i++) {
                if (tabbed.getTitleAt(i).equals("Ventas")) {
                    cont3++;
                }
            }
            if (cont3 == 0) {
                tabbed.addTab("Ventas", vent);
                tabbed.setSelectedIndex(tabbed.getTabCount() - 1);
            }
        }
    }//GEN-LAST:event_btnVentaActionPerformed

    private void btnProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedorActionPerformed
        Proveedor prov = new Proveedor();
        if (tabbed.getTabCount() == 0) {
            tabbed.addTab("Proveedores", prov);

        } else {
            for (int i = 0; i < tabbed.getTabCount(); i++) {
                if (tabbed.getTitleAt(i).equals("Proveedores")) {
                    cont1++;
                }
            }
            if (cont1 == 0) {
                tabbed.addTab("Proveedores", prov);
                tabbed.setSelectedIndex(tabbed.getTabCount() - 1);
            } else {
                //tabbed.setSelectedComponent(prov);
            }
        }


    }//GEN-LAST:event_btnProveedorActionPerformed

    private void btnProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductoActionPerformed
        Producto prod = new Producto();
        if (tabbed.getTabCount() == 0) {
            tabbed.addTab("Productos", prod);

        } else {
            for (int i = 0; i < tabbed.getTabCount(); i++) {
                if (tabbed.getTitleAt(i).equals("Productos")) {
                    cont2++;
                }

            }
            if (cont2 == 0) {
                tabbed.addTab("Productos", prod);
                tabbed.setSelectedIndex(tabbed.getTabCount() - 1);
            } else {
                //tabbed.setSelectedComponent(prod);
            }
        }
    }//GEN-LAST:event_btnProductoActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProducto;
    private javax.swing.JButton btnProveedor;
    private javax.swing.JButton btnVenta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTabbedPane tabbed;
    // End of variables declaration//GEN-END:variables
}
