import java.sql.*;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vki
 */
public class Cccpp extends javax.swing.JFrame {
Statement st=null;
ResultSet rs=null;
    /**
     * Creates new form Cccpp
     */
    public Cccpp() {
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

        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        P3 = new javax.swing.JPasswordField();
        L2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        T1 = new javax.swing.JTextField();
        P1 = new javax.swing.JPasswordField();
        P2 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setText("Re-enter your new password :");

        L2.setForeground(new java.awt.Color(255, 0, 0));
        L2.setText("Passwords not matched");

        jLabel1.setText("Enter your present password :");

        jLabel5.setText("Enter your Login Id :");

        jLabel2.setText("Enter your new password :");

        P1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                P1FocusLost(evt);
            }
        });
        P1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P1ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Change Password");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(64, 64, 64)
                        .addComponent(jButton1)
                        .addGap(64, 64, 64)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(P3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(L2))
                            .addComponent(P2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(T1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(P1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(P1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(P2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(P3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void P1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_P1FocusLost
        try
        {
            Class.forName("java.sql.DriverManager");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ayush","root","tiger");
            String lid=T1.getText();
            String pwd=new String(P1.getPassword());
            String sql="Select Password from login where Login_Id= '"+lid+"';";
            st=con.createStatement();
            rs=st.executeQuery(sql);
            if(!rs.next())
            {
                JOptionPane.showMessageDialog(null, " Please check that username or password is entered correctly.");
            }
            if(pwd.equals(rs.getString("Password")))
            {
                P2.setEditable(true);
                P3.setEditable(true);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,  "  " + e.getMessage());
        }  
    }//GEN-LAST:event_P1FocusLost

    private void P1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P1ActionPerformed
        //try
        //{
            //    Class.forName("java.sql.DriverManager");
            //    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management","root","tiger");
            //    lid2=T1.getText();
            //    pwd2=new String(P1.getPassword());
            //    String sql="Select Password from login where Login_Id= '"+lid2;
            //    st=con.createStatement();
            //    rs=st.executeQuery(sql);
            //    if(!rs.next())
            //    {
                //    JOptionPane.showMessageDialog(null, " Please check that username or password is entered correctly.");
                //    }
            //    else if(lid2.equals(lid1) && pwd2.equals(rs.getString("Password")))
            //    {
                //        L1.setVisible(true);
                //    }
            //}
        //    catch(Exception e)
        //        {
            //           JOptionPane.showMessageDialog(null,  "  " + e.getMessage());
            //        }  // TODO add your handling code here:
    }//GEN-LAST:event_P1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String npwd1,npwd2;
        npwd1=new String(P2.getPassword());
        npwd2=new String(P3.getPassword());
        if(npwd1.equals(npwd2))
        {
        try
        {
            Class.forName("java.sql.DriverManager");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ayush","root","tiger");
            String lid,pwd,sql;
            lid=T1.getText();
            pwd=new String(P2.getPassword());
            sql="update login set Password='"+pwd+"' where Login_Id='"+lid+"';";
            st=con.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Password Changed Successfully.");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null," Error ! "+e.getMessage());
        }
    }
    else
        {
            L2.setVisible(true);
            //JOptionPane.showMessageDialog(null,"Passwords not matched.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed
  
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
Login a=new Login();
a.setVisible(true);
this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
L2.setVisible(false);
P2.setEditable(false);
P3.setEditable(false);
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Cccpp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cccpp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cccpp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cccpp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cccpp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel L2;
    private javax.swing.JPasswordField P1;
    private javax.swing.JPasswordField P2;
    private javax.swing.JPasswordField P3;
    private javax.swing.JTextField T1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
