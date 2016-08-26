/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package departmentalstore;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

/**
 *
 * @author walee_000
 */
public class EmployeePanel extends javax.swing.JFrame {

    Connection cn;
    PreparedStatement pst;
    ResultSet rs;
    /**
     * Creates new form EmployeePanel
     */
    public EmployeePanel() {
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
    private DefaultTableModel rtt(ResultSet rs){
    try{
            DefaultTableModel dtm = new DefaultTableModel();
            ResultSetMetaData meta = rs.getMetaData();
            int col = meta.getColumnCount();
 
            rs.last();
            int row = rs.getRow();
            rs.beforeFirst();
 
            Object[] rowData = new Object[col];
            Object[] colData = new Object[col];
 
            for (int i=0;i<col;i++){
                colData[i] = meta.getColumnLabel(i+1);
            }
 
            dtm.setColumnIdentifiers(colData);
 
            for (int i=0;i<row;i++){
                rs.next();
                for (int j=0;j<col;j++){
                    rowData[j] = rs.getString(j+1);
                }
                dtm.addRow(rowData);
            }
 
            return dtm;
    } catch (Exception ex){
        JOptionPane.showMessageDialog(null, "ResultSet to TableModel Converter : "+ex.getMessage());
        return null;
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jbdelete = new javax.swing.JButton();
        jbupdate = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tfsearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tshow = new javax.swing.JTable();
        jbsearch = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        stable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        limage = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lname = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Make Bill");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 139, 147, 41));

        jButton2.setText("Add Items");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 92, 147, 41));

        jbdelete.setText("Delete Items");
        jbdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbdeleteActionPerformed(evt);
            }
        });
        getContentPane().add(jbdelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 233, 147, 41));

        jbupdate.setText("Update");
        jbupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbupdateActionPerformed(evt);
            }
        });
        getContentPane().add(jbupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 186, 147, 41));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Employee Panel");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 21, -1, -1));

        tfsearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        tfsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfsearchKeyPressed(evt);
            }
        });
        getContentPane().add(tfsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(468, 292, 150, 33));

        tshow.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Name", "Price"
            }
        ));
        tshow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tshowMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tshow);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 368, -1, 132));

        jbsearch.setText("Search");
        jbsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsearchActionPerformed(evt);
            }
        });
        jbsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbsearchKeyPressed(evt);
            }
        });
        getContentPane().add(jbsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 292, -1, -1));

        stable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Name"
            }
        ));
        stable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(stable);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(468, 368, 212, 132));

        jLabel3.setFont(new java.awt.Font("Levenim MT", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 51));
        jLabel3.setText("Available Stock:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(468, 336, -1, -1));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 0, 239, -1));
        getContentPane().add(limage, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 57, 120, 86));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 0));
        jLabel5.setText("Current User:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 31, -1, -1));

        lname.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        lname.setForeground(new java.awt.Color(0, 0, 153));
        getContentPane().add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 149, 120, 31));

        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 710, 540));

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

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_EQUALS, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem3.setText("Add Items");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem4.setText("Make Bill");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0));
        jMenuItem5.setText("Delete");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ItemForm itf=new ItemForm();
        itf.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jbupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbupdateActionPerformed
        // TODO add your handling code here:
        
        ItemForm itf=new ItemForm();
        itf.setVisible(true);
    }//GEN-LAST:event_jbupdateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        MakeBill mb=new MakeBill();
        mb.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tfsearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfsearchKeyPressed
        // TODO add your handling code here:
    
    }//GEN-LAST:event_tfsearchKeyPressed

    private void jbsearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbsearchKeyPressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jbsearchKeyPressed

    private void jbsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsearchActionPerformed
        // TODO add your handling code here:
            String srch= tfsearch.getText();
        int srch_int = Integer.parseInt(srch);
        try
        {
                Statement st=cn.createStatement();
              rs=st.executeQuery("SELECT * FROM `productdetails` WHERE P_id= '"+srch_int+"'  ");
              
             
              DefaultTableModel dt=rtt(rs);
              tshow.setModel(dt);
              
             
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    
    }//GEN-LAST:event_jbsearchActionPerformed

    private void tshowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tshowMouseClicked
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_tshowMouseClicked

    private void jbdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbdeleteActionPerformed
        // TODO add your handling code here:
        
        try
        {
           String sql="DELETE FROM `productdetails` WHERE P_id=?";
           pst=cn.prepareStatement(sql);
           pst.setString(1, tfsearch.getText());
           pst.execute();
           
           JOptionPane.showMessageDialog(null, "Deleted");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jbdeleteActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        Login l=new Login();
        l.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        // TODO add your handling code here:
         try
        {
            
        Statement st=cn.createStatement();
        rs=st.executeQuery("SELECT `P_id`, `P_Name` FROM `productdetails`");
        DefaultTableModel dt=rtt(rs);
        
        stable.setModel(dt);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_formMouseMoved

    private void stableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stableMouseClicked
        // TODO add your handling code here:
        try
        {
            int row=stable.getSelectedRow();
        String tclick=(stable.getModel().getValueAt(row, 0).toString());
        String sql="SELECT * FROM `productdetails` WHERE P_id='"+tclick+"' ";
        pst=cn.prepareStatement(sql);
        rs=pst.executeQuery();
        
        Statement st=cn.createStatement();
              rs=st.executeQuery("SELECT * FROM `productdetails` WHERE P_id='"+tclick+"' ");
        if(rs.next())
        {
            String id=rs.getString("P_id");
            tfsearch.setText(id);
            
            
        }
        
              
             
              DefaultTableModel dt=rtt(rs);
              tshow.setModel(dt);
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_stableMouseClicked

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        ItemForm itf=new ItemForm();
        itf.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        MakeBill mb=new MakeBill();
        mb.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
         try
        {
           String sql="DELETE FROM `productdetails` WHERE P_id=?";
           pst=cn.prepareStatement(sql);
           pst.setString(1, tfsearch.getText());
           pst.execute();
           
           JOptionPane.showMessageDialog(null, "Deleted");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeePanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbdelete;
    private javax.swing.JButton jbsearch;
    private javax.swing.JButton jbupdate;
    public static javax.swing.JLabel limage;
    public static javax.swing.JLabel lname;
    private javax.swing.JTable stable;
    private javax.swing.JTextField tfsearch;
    private javax.swing.JTable tshow;
    // End of variables declaration//GEN-END:variables
}
