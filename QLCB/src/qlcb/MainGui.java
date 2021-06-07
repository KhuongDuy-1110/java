package qlcb;

import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import java.awt.event.*;
import java.awt.*;

public class MainGui extends javax.swing.JFrame {

    /**
     * Creates new form MainGui
     */
    private JPopupMenu popup;
    String type;

    public MainGui(String type) {
        initComponents();
        setTitle("Main");
        this.type = type;

        Boolean state = ("ADMIN".equals(type));
        tabNhapDuLieu.setEnabled(state);

        Container contentPane = getContentPane();
        popup = new JPopupMenu();
        // add menu items to popup
        popup.add(new JMenuItem("Hệ thống"));
        popup.add(new JMenuItem("Nhập dữ liệu"));
        popup.add(new JMenuItem("Tìm kiếm"));
        contentPane.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent me) {
                showPopup(me);
            }
        });
        //setSize(375, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public MainGui() {
    }

    void showPopup(MouseEvent me) {
        if (me.isPopupTrigger()) {
            popup.show(me.getComponent(), me.getX(), me.getY());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jToolBar2 = new javax.swing.JToolBar();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        tabHeThong = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        tabNhapDuLieu = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        tabDanhSach = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        tabTroGiup = new javax.swing.JMenu();

        jLabel1.setText("jLabel1");

        jPopupMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPopupMenu1MouseReleased(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("maingui"); // NOI18N

        jToolBar2.setBorder(null);
        jToolBar2.setRollover(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlcb/icon/vcsconflicting_93497.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 40));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlcb/icon/filter_filters_funnel_list_navigation_sort_sorting_icon_123212.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 90, 40));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlcb/icon/adduser_añadir_3553.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 100, 40));

        jButton5.setForeground(new java.awt.Color(240, 240, 240));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlcb/icon/searchmagnifierinterfacesymbol1_79893.png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setFocusPainted(false);
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 80, 40));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlcb/icon/circle_customer_help_info_information_service_support_icon_123208.png"))); // NOI18N
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 80, 40));

        jToolBar2.add(jPanel1);

        jToolBar1.setRollover(true);

        jPanel2.setForeground(new java.awt.Color(240, 240, 240));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Status: ...");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 90, 40));

        jToolBar1.add(jPanel2);

        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuBar1.setInheritsPopupMenu(true);
        jMenuBar1.setPreferredSize(new java.awt.Dimension(338, 40));

        tabHeThong.setMnemonic('H');
        tabHeThong.setText(" Hệ Thống |");
        tabHeThong.setToolTipText("");
        tabHeThong.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMenuItem1.setText("Thoát");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        tabHeThong.add(jMenuItem1);

        jMenuBar1.add(tabHeThong);

        tabNhapDuLieu.setMnemonic('N');
        tabNhapDuLieu.setText("Nhập Dữ Liệu |");
        tabNhapDuLieu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMenuItem2.setText("Thêm cán bộ");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        tabNhapDuLieu.add(jMenuItem2);

        jMenuBar1.add(tabNhapDuLieu);

        tabDanhSach.setMnemonic('D');
        tabDanhSach.setText("Danh sách |");
        tabDanhSach.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMenuItem4.setText("Cán bộ");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        tabDanhSach.add(jMenuItem4);

        jMenuBar1.add(tabDanhSach);

        tabTroGiup.setMnemonic('p');
        tabTroGiup.setText("Trợ giúp");
        tabTroGiup.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuBar1.add(tabTroGiup);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, 891, Short.MAX_VALUE)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 425, Short.MAX_VALUE)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPopupMenu1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPopupMenu1MouseReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_jPopupMenu1MouseReleased

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        setVisible(false);
        dispose();
        new LoginGui().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new GenInforGui().setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        new ShowInfoGui().setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
        dispose();
        new LoginGui().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
//            new MainGui();
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
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGui().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JMenu tabDanhSach;
    private javax.swing.JMenu tabHeThong;
    private javax.swing.JMenu tabNhapDuLieu;
    private javax.swing.JMenu tabTroGiup;
    // End of variables declaration//GEN-END:variables
}
