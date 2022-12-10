package com.flappybird.view;


import java.awt.Desktop;
import java.awt.Dimension;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class PlayHub extends javax.swing.JFrame {

    public PlayHub() {
        initComponents();
        this.setBounds(560,200,810,610);
        this.setTitle("Game World");
        this.setResizable(false);  
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        L3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("Game World");
        jPanel1.setMinimumSize(new java.awt.Dimension(810, 800));
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Ebrima", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("WELCOME TO GAME World!!");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(230, 20, 390, 57);

        L3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Flappy_Bird-01-512.png"))); // NOI18N
        L3.setToolTipText("Click to Start");
        L3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L3MouseClicked(evt);
            }
        });
        jPanel1.add(L3);
        L3.setBounds(310, 160, 210, 210);

        jLabel4.setFont(new java.awt.Font("Cambria", 3, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Click the icon to start the game");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(240, 70, 360, 30);

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Flappy Bird");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(340, 380, 149, 45);

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Reach Out:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(560, 540, 80, 21);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/github icon.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8);
        jLabel8.setBounds(630, 530, 40, 40);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/gmail icon.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9);
        jLabel9.setBounds(700, 530, 40, 40);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/linkedin icon.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10);
        jLabel10.setBounds(670, 530, 22, 40);

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jLabel11.setText("Developed by: Jukta Goyari");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(560, 510, 220, 20);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/flappybird/view/bg.jpg"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 0, 800, 600);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-10, 0, 810, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void L3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L3MouseClicked
      
        JOptionPane.showMessageDialog(this, "Press Enter to start the game. \nPress 'Space Bar' or 'Arrow UP key' to control the bird jump.");
  
            JFrame frame = new JFrame();
            Game game = new Game();
            frame.add(game);
            frame.pack();
            frame.setVisible(true);
            frame.setTitle("Flappy Bird");
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setMaximumSize(new Dimension(810, 610));
            frame.setPreferredSize(new Dimension(820, 610));
            frame.setMinimumSize(new Dimension(810, 610));
            frame.setLocationRelativeTo(null);
            frame.setResizable(false);
    }//GEN-LAST:event_L3MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        try {
            Desktop.getDesktop().browse(new URI("https://github.com/JuktaGoyari"));
        } catch (URISyntaxException ex) {
            Logger.getLogger(PlayHub.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PlayHub.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        try {
            Desktop.getDesktop().browse(new URI("mailto:juktagoyari12@gmail.com"));
        } catch (URISyntaxException ex) {
            Logger.getLogger(PlayHub.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PlayHub.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        try {
            Desktop.getDesktop().browse(new URI("https://www.linkedin.com/in/jukta-goyari-78433921b/"));
        } catch (URISyntaxException ex) {
            Logger.getLogger(PlayHub.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PlayHub.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel10MouseClicked

    public static void main(String args[]) {
       
          Game game = new Game();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlayHub().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel L3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
