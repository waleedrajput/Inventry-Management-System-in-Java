/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package departmentalstore;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author walee_000
 */
public class adminform extends javax.swing.JFrame {
    Connection cn;
    PreparedStatement pst;
    ResultSet rs;
    String name,contact,uid,password,path;

    /**
     * Creates new form adminform
     */
    public adminform() {
        initComponents();
         try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/departmental_store","root","");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
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
        tfname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfuid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfpassword = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfcontact = new javax.swing.JTextField();
        jbsave = new javax.swing.JButton();
        limage = new javax.swing.JLabel();
        tfimage = new javax.swing.JTextField();
        jbattach = new javax.swing.JButton();
        jbupdate = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Name:");

        jLabel2.setText("User ID:");

        tfuid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfuidKeyPressed(evt);
            }
        });

        jLabel3.setText("Password:");

        jLabel4.setText("Contact:");

        jbsave.setText("Save");
        jbsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsaveActionPerformed(evt);
            }
        });

        limage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jbattach.setText("Attach");
        jbattach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbattachActionPerformed(evt);
            }
        });

        jbupdate.setText("Update");
        jbupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbupdateActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("Enter User ID to Search");

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuItem1.setText("Close");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Main Page");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jbupdate)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jbsave))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addGap(14, 14, 14)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfuid, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                                .addComponent(tfname)
                                .addComponent(tfpassword)
                                .addComponent(tfcontact, javax.swing.GroupLayout.Alignment.TRAILING))))
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(limage, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addComponent(jbattach, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfimage))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tfname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfuid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tfpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tfcontact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(limage, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbsave)
                            .addComponent(jbupdate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfimage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbattach)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsaveActionPerformed
        // TODO add your handling code here:
        try
        {
            name=tfname.getText();
            contact=tfcontact.getText();
            uid=tfuid.getText();
            password=tfpassword.getText();
            String sql="INSERT INTO `login`(`u_id`, `password`, `Name`, `Contact#`, `a_image`) VALUES (?,?,?,?,?)";
            pst=cn.prepareStatement(sql);
            pst.setString(1, uid);
            pst.setString(2, password);
            pst.setString(3, name);
            pst.setString(4, contact);
            pst.setString(5, path);
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Saved");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jbsaveActionPerformed

    private void jbattachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbattachActionPerformed
        // TODO add your handling code here:
        try {
           
            JFileChooser obj = new JFileChooser(new File("C:\\Users\\walee_000\\Downloads"));
            obj.showOpenDialog(this);
            
             path = obj.getSelectedFile().getAbsolutePath();
            limage.setIcon(new ImageIcon(ThisIsANameOfFun(limage, path)));
            tfimage.setText(path);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jbattachActionPerformed

    private void tfuidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfuidKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()== KeyEvent.VK_ENTER)
        {
            try
            {
                String sqll="SELECT * FROM `login` WHERE u_id=?";
            pst=cn.prepareStatement(sqll);
            pst.setString(1, tfuid.getText());
            rs=pst.executeQuery();
            if(rs.next()){
                String s1=rs.getString("Name");
                tfname.setText(s1);
                String s2=rs.getString("Contact#");
                tfcontact.setText(s2);
                String s3=rs.getString("Password");
                tfpassword.setText(s3);
                String s4=rs.getString("a_image");
                limage.setIcon(new ImageIcon(ThisIsANameOfFun(limage, s4)));
                String s5=rs.getString("a_image");
                tfimage.setText(s5);
            }
            }
            
    
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_tfuidKeyPressed

    private void jbupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbupdateActionPerformed
        // TODO add your handling code here:
        try
        {
            name=tfname.getText();
            contact=tfcontact.getText();
            uid=tfuid.getText();
            password=tfpassword.getText();
            String sql="UPDATE `login` SET `password`=?,`Name`=?,`Contact#`=?,`a_image`=? WHERE u_id=?";
            pst=cn.prepareStatement(sql);
            
            pst.setString(1, password);
            pst.setString(2, name);
            pst.setString(3, contact);
            pst.setString(4, path);
            pst.setString(5, uid);
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Updated");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jbupdateActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        viewadmins va=new viewadmins();
        va.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed
private BufferedImage ThisIsANameOfFun(JLabel label, String address) throws IOException {
       
            BufferedImage buffer = new BufferedImage(label.getWidth(), label.getHeight(), BufferedImage.TYPE_INT_ARGB);
            Graphics2D g = buffer.createGraphics();          
            Image img = ImageIO.read(new File(address));           
            g.drawImage(img, 0, 0, label.getWidth(), label.getHeight(), null);           
            g.dispose();      
        return buffer;
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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(adminform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JButton jbattach;
    private javax.swing.JButton jbsave;
    private javax.swing.JButton jbupdate;
    private javax.swing.JLabel limage;
    private javax.swing.JTextField tfcontact;
    private javax.swing.JTextField tfimage;
    private javax.swing.JTextField tfname;
    private javax.swing.JTextField tfpassword;
    private javax.swing.JTextField tfuid;
    // End of variables declaration//GEN-END:variables
}
