import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
public class Grades extends javax.swing.JFrame {
Statement st=null;
ResultSet rs=null;
    /**
     * Creates new form Grades
     */
    public Grades() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        T1 = new javax.swing.JTextField();
        T2 = new javax.swing.JTextField();
        T3 = new javax.swing.JTextField();
        T4 = new javax.swing.JTextField();
        T5 = new javax.swing.JTextField();
        T6 = new javax.swing.JTextField();
        T7 = new javax.swing.JTextField();
        CalcBtn = new javax.swing.JButton();
        ClrBtn = new javax.swing.JButton();
        L1 = new javax.swing.JLabel();
        L2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rb1 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        rb3 = new javax.swing.JRadioButton();
        rb4 = new javax.swing.JRadioButton();
        ActBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        T8 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Grades");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Roll No. :");

        jLabel2.setText("Student Name :");

        jLabel3.setText("S1 ;");

        jLabel4.setText("S3 :");

        jLabel5.setText("S2 :");

        jLabel6.setText("S4 :");

        jLabel7.setText("S5 :");

        jLabel9.setText("Grade :");

        jLabel10.setText("Aggregate :");

        T1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                T1KeyReleased(evt);
            }
        });

        T3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                T3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                T3KeyTyped(evt);
            }
        });

        T4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                T4KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                T4KeyTyped(evt);
            }
        });

        T5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                T5KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                T5KeyTyped(evt);
            }
        });

        T6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                T6KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                T6KeyTyped(evt);
            }
        });

        T7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                T7KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                T7KeyTyped(evt);
            }
        });

        CalcBtn.setText("Calculate Grade and Aggregate");
        CalcBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcBtnActionPerformed(evt);
            }
        });

        ClrBtn.setText("Clear All");
        ClrBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClrBtnActionPerformed(evt);
            }
        });

        L1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        L2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 204), 1, true), "Choose an action :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monotype Corsiva", 3, 14), new java.awt.Color(255, 0, 0))); // NOI18N

        buttonGroup1.add(rb1);
        rb1.setText("Add");
        rb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rb2);
        rb2.setText("Delete");
        rb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rb3);
        rb3.setText("Update");
        rb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rb4);
        rb4.setText("Fetch Record");
        rb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb4ActionPerformed(evt);
            }
        });

        ActBtn.setText("Perform the action");
        ActBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rb1)
                    .addComponent(rb2)
                    .addComponent(rb3)
                    .addComponent(rb4)
                    .addComponent(ActBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rb1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rb2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rb3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rb4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ActBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Show Complete Record");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("jButton3");

        jLabel8.setText("Email :");

        T8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                T8KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                T8KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8))
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(T5, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(T6, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(T7, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(T4, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(T2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(T3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(T1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(L1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(L2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(T8, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2)
                            .addComponent(jButton3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(CalcBtn)
                        .addGap(65, 65, 65)
                        .addComponent(ClrBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(T2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(T3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(T4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(T5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(T6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(T7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(L1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jButton3)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(L2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(T8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CalcBtn)
                    .addComponent(ClrBtn)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
T1.setEnabled(false);
T2.setEnabled(false);
T3.setEnabled(false);
T4.setEnabled(false);
T5.setEnabled(false);
T6.setEnabled(false);
T7.setEnabled(false);
ActBtn.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void CalcBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcBtnActionPerformed
double a=Double.parseDouble(T3.getText());
double b=Double.parseDouble(T4.getText());
double c=Double.parseDouble(T5.getText());
double d=Double.parseDouble(T6.getText());
double e=Double.parseDouble(T7.getText());
double f=((a+b+c+d+e)/5);
if(f>=91)
{
    L1.setText("A1");
}
else if(f>=82)
{
    L1.setText("A2");
}
else if(f>=73)
{
    L1.setText("B1");
}
else if(f>=64)
{
    L1.setText("B2");
}
else if(f>=53)
{
    L1.setText("C1");
}
else if(f>=44)
{
    L1.setText("C2");
}
else if(f<44)
{
    L1.setText("Fail");
}
L2.setText(" "+f);
ActBtn.setEnabled(true);
    }//GEN-LAST:event_CalcBtnActionPerformed

    private void ClrBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClrBtnActionPerformed
T1.setText("");
T2.setText("");
T3.setText("");
T4.setText("");
T5.setText("");
T6.setText("");
T7.setText("");
L1.setText("");
L2.setText("");
buttonGroup1.clearSelection();
    }//GEN-LAST:event_ClrBtnActionPerformed

    private void rb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb1ActionPerformed
T2.setEditable(true);
T3.setEditable(true);
T4.setEditable(true);
T5.setEditable(true);
T6.setEditable(true);
T7.setEditable(true);
T1.setEnabled(true);
T2.setEnabled(true);
T3.setEnabled(true);
T4.setEnabled(true);
T5.setEnabled(true);
T6.setEnabled(true);
T7.setEnabled(true);
ActBtn.setEnabled(true);
    }//GEN-LAST:event_rb1ActionPerformed

    private void rb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb2ActionPerformed
T1.setText(" ");
T2.setText(" ");
T3.setText(" ");
T4.setText(" ");
T5.setText(" ");
T6.setText(" ");
T7.setText(" ");
L1.setText(" ");
L2.setText(" ");
T2.setEditable(false);
T3.setEditable(false);
T4.setEditable(false);
T5.setEditable(false);
T6.setEditable(false);
T7.setEditable(false);
T1.setEnabled(true);
T2.setEnabled(true);
T3.setEnabled(true);
T4.setEnabled(true);
T5.setEnabled(true);
T6.setEnabled(true);
T7.setEnabled(true);
ActBtn.setEnabled(true);
    }//GEN-LAST:event_rb2ActionPerformed

    private void ActBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActBtnActionPerformed
if(rb1.isSelected())
{
    try
    {
        Class.forName("java.sql.DriverManager");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ayush","root","tiger");
        String a,b,c,d,e,f,g,h,i,j,sql;
        a=T1.getText();
        b=T2.getText();
        c=T3.getText();
        d=T4.getText();
        e=T5.getText();
        f=T6.getText();
        g=T7.getText();
        h=L1.getText();
        i=L2.getText();
        j=T8.getText();
        sql="insert into grades values("+a+",'"+b+"',"+c+","+d+","+e+","+f+","+g+",'"+h+"','"+i+"','"+j+"')";
        st=con.createStatement();
        st.executeUpdate(sql);
        JOptionPane.showMessageDialog(null,"Record Saved.");        
    }
    catch(ClassNotFoundException | SQLException | HeadlessException e)
    {
        JOptionPane.showMessageDialog(null,"Error !!! "+e.getMessage());
    }
}
if(rb2.isSelected())
{
    try
            {
                Class.forName("java.sql.DriverManager");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ayush","root","tiger");
                String a,sql;
                a=T1.getText();
                sql="delete from grades where Roll_No="+a;
                st=con.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Record Deleted");
            }
            catch(ClassNotFoundException | SQLException | HeadlessException e){JOptionPane.showMessageDialog(null," Error ! "+e.getMessage());}
}
if(rb3.isSelected())
{
    try
            {
                Class.forName("java.sql.DriverManager");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ayush","root","tiger");
                String a,b,c,d,e,f,g,h,i,sql;
                a=T1.getText();
                b=T2.getText();
                c=T3.getText();
                d=T4.getText();
                e=T5.getText();
                f=T6.getText();
                g=T7.getText();
                h=L1.getText();
                i=L2.getText();
                sql="update grades set Name='"+b+"',Eng="+c+",Phy="+d+",Chem="+e+",Mat="+f+",Ip="+g+",Grade='"+h+"',Agg='"+i+"' where Roll_No="+a;
                st=con.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Record Updated");
            }
            catch(ClassNotFoundException | SQLException | HeadlessException e){JOptionPane.showMessageDialog(null," Error ! "+e.getMessage());}
}
if(rb4.isSelected())
{
    try
            {
                Class.forName("java.sql.DriverManager");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ayush","root","tiger");
                String a,sql;
                a=T1.getText();
                sql="select *  from grades where Roll_No="+a+";";
                st=con.createStatement();
                rs=st.executeQuery(sql);
                if(!rs.next())
                JOptionPane.showMessageDialog(null,"No such record.");
                else
                {
                    T2.setText(rs.getString("Name"));
                    T3.setText(rs.getString("Eng"));
                    T4.setText(rs.getString("Phy"));
                    T5.setText(rs.getString("Chem"));
                    T6.setText(rs.getString("Mat"));
                    T7.setText(rs.getString("Ip"));
                    L1.setText(rs.getString("Grade"));
                    L2.setText(rs.getString("Agg"));
                    
                }
            }
            catch(ClassNotFoundException | SQLException | HeadlessException e){JOptionPane.showMessageDialog(null," Error ! "+e.getMessage());}
}
    }//GEN-LAST:event_ActBtnActionPerformed

    private void rb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb3ActionPerformed
T1.setText("");
T2.setText("");
T3.setText("");
T4.setText("");
T5.setText("");
T6.setText("");
T7.setText("");
L1.setText("");
L2.setText("");
T2.setEditable(true);
T3.setEditable(true);
T4.setEditable(true);
T5.setEditable(true);
T6.setEditable(true);
T7.setEditable(true);
T1.setEnabled(true);
T2.setEnabled(true);
T3.setEnabled(true);
T4.setEnabled(true);
T5.setEnabled(true);
T6.setEnabled(true);
T7.setEnabled(true);
ActBtn.setEnabled(false);
    }//GEN-LAST:event_rb3ActionPerformed

    private void rb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb4ActionPerformed
T1.setText("");
T2.setText("");
T3.setText("");
T4.setText("");
T5.setText("");
T6.setText("");
T7.setText("");
L1.setText("");
L2.setText("");
T2.setEditable(false);
T3.setEditable(false);
T4.setEditable(false);
T5.setEditable(false);
T6.setEditable(false);
T7.setEditable(false);
T1.setEnabled(true);
T2.setEnabled(true);
T3.setEnabled(true);
T4.setEnabled(true);
T5.setEnabled(true);
T6.setEnabled(true);
T7.setEnabled(true);
ActBtn.setEnabled(true);
    }//GEN-LAST:event_rb4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
Grades_Table a=new Grades_Table(); 
a.setVisible(true);
this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void T3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_T3KeyTyped
char ch=evt.getKeyChar();
if
        (!((ch>='0' && ch<='9') || ch==evt.VK_BACK_SPACE || ch==evt.VK_DELETE))
{
    evt.consume();
    JOptionPane.showMessageDialog(null,"Enter only numeric value.");
}        
    }//GEN-LAST:event_T3KeyTyped

    private void T4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_T4KeyTyped
char ch=evt.getKeyChar();
if
        (!((ch>='0' && ch<='9') || ch==evt.VK_BACK_SPACE || ch==evt.VK_DELETE))
{
    evt.consume();
    JOptionPane.showMessageDialog(null,"Enter only numeric value.");
}
    }//GEN-LAST:event_T4KeyTyped

    private void T5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_T5KeyTyped
char ch=evt.getKeyChar();
if
        (!((ch>='0' && ch<='9') || ch==evt.VK_BACK_SPACE || ch==evt.VK_DELETE))
{
    evt.consume();
    JOptionPane.showMessageDialog(null,"Enter only numeric value.");
}
    }//GEN-LAST:event_T5KeyTyped

    private void T6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_T6KeyTyped
char ch=evt.getKeyChar();
if
        (!((ch>='0' && ch<='9') || ch==evt.VK_BACK_SPACE || ch==evt.VK_DELETE))
{
    evt.consume();
    JOptionPane.showMessageDialog(null,"Enter only numeric value.");
}
    }//GEN-LAST:event_T6KeyTyped

    private void T7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_T7KeyTyped
char ch=evt.getKeyChar();
if
        (!((ch>='0' && ch<='9') || ch==evt.VK_BACK_SPACE || ch==evt.VK_DELETE))
{
    evt.consume();
    JOptionPane.showMessageDialog(null,"Enter only numeric value.");
}
    }//GEN-LAST:event_T7KeyTyped

    private void T3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_T3KeyReleased
int a=Integer.parseInt(T3.getText());
if(a>100)
{
    JOptionPane.showMessageDialog(null,"Enter marks out of 100 only.");
}
    }//GEN-LAST:event_T3KeyReleased

    private void T4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_T4KeyReleased
int a=Integer.parseInt(T4.getText());
if(a>100)
{
    JOptionPane.showMessageDialog(null,"Enter marks out of 100 only.");
}        // TODO add your handling code here:
    }//GEN-LAST:event_T4KeyReleased

    private void T5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_T5KeyReleased
int a=Integer.parseInt(T5.getText());
if(a>100)
{
    JOptionPane.showMessageDialog(null,"Enter marks out of 100 only.");
}        // TODO add your handling code here:
    }//GEN-LAST:event_T5KeyReleased

    private void T6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_T6KeyReleased
int a=Integer.parseInt(T6.getText());
if(a>100)
{
    JOptionPane.showMessageDialog(null,"Enter marks out of 100 only.");
}        // TODO add your handling code here:
    }//GEN-LAST:event_T6KeyReleased

    private void T7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_T7KeyReleased
int a=Integer.parseInt(T7.getText());
if(a>100)
{
    JOptionPane.showMessageDialog(null,"Enter marks out of 100 only.");
}        // TODO add your handling code here:
    }//GEN-LAST:event_T7KeyReleased

    private void T1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_T1KeyReleased
if(rb4.isSelected())
{
    try
            {
                Class.forName("java.sql.DriverManager");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ayush","root","tiger");
                String a,sql;
                a=T1.getText();
                sql="select *  from grades where Roll_No=" +a+";";
                st=con.createStatement();
                rs=st.executeQuery(sql);
                if(!rs.next())
                {
                    T2.setText("");
                    T3.setText("");
                    T4.setText("");
                    T5.setText("");
                    T6.setText("");
                    T7.setText("");
                    L1.setText("");
                    L2.setText("");
                }//JOptionPane.showMessageDialog(null,"No such record.");
                else
                {
                    T2.setText(rs.getString("Name"));
                    T3.setText(rs.getString("Eng"));
                    T4.setText(rs.getString("Phy"));
                    T5.setText(rs.getString("Chem"));
                    T6.setText(rs.getString("Mat"));
                    T7.setText(rs.getString("Ip"));
                    L1.setText(rs.getString("Grade"));
                    L2.setText(rs.getString("Agg"));
                    
                }
            }
            catch(ClassNotFoundException | SQLException | HeadlessException e){JOptionPane.showMessageDialog(null," Error ! "+e.getMessage());}
}
    }//GEN-LAST:event_T1KeyReleased

    private void T8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_T8KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_T8KeyReleased

    private void T8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_T8KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_T8KeyTyped

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
            java.util.logging.Logger.getLogger(Grades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Grades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Grades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Grades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActBtn;
    private javax.swing.JButton CalcBtn;
    private javax.swing.JButton ClrBtn;
    private javax.swing.JLabel L1;
    private javax.swing.JLabel L2;
    private javax.swing.JTextField T1;
    private javax.swing.JTextField T2;
    private javax.swing.JTextField T3;
    private javax.swing.JTextField T4;
    private javax.swing.JTextField T5;
    private javax.swing.JTextField T6;
    private javax.swing.JTextField T7;
    private javax.swing.JTextField T8;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JRadioButton rb3;
    private javax.swing.JRadioButton rb4;
    // End of variables declaration//GEN-END:variables
}
