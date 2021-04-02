/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menus;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Menus extends javax.swing.JFrame {

    /**
     * Creates new form Menus
     */
    public Menus() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mmNuevo = new javax.swing.JMenuItem();
        mmAbrir = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mmSalir = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mmAcercade = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Archivo");

        mmNuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        mmNuevo.setText("Nuevo");
        mmNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmNuevoActionPerformed(evt);
            }
        });
        jMenu1.add(mmNuevo);

        mmAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        mmAbrir.setText("Abrir");
        mmAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmAbrirActionPerformed(evt);
            }
        });
        jMenu1.add(mmAbrir);
        jMenu1.add(jSeparator1);

        mmSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        mmSalir.setText("Salir");
        mmSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmSalirActionPerformed(evt);
            }
        });
        jMenu1.add(mmSalir);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Ayuda");

        mmAcercade.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        mmAcercade.setText("Acerca de...");
        mmAcercade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmAcercadeActionPerformed(evt);
            }
        });
        jMenu3.add(mmAcercade);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 531, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 226, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mmNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmNuevoActionPerformed
        JOptionPane.showMessageDialog(this, "Vas a crear un nuevo archivo", "Nuevo", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_mmNuevoActionPerformed

    private void mmSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mmSalirActionPerformed

    private void mmAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmAbrirActionPerformed
        JOptionPane.showMessageDialog(this, "Vas abrir un archivo", "Abrir", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_mmAbrirActionPerformed

    private void mmAcercadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmAcercadeActionPerformed
        JOptionPane.showMessageDialog(this, "Recibes información acerca de la aplicacion", "Acerca de ...", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_mmAcercadeActionPerformed

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem mmAbrir;
    private javax.swing.JMenuItem mmAcercade;
    private javax.swing.JMenuItem mmNuevo;
    private javax.swing.JMenuItem mmSalir;
    // End of variables declaration//GEN-END:variables
}