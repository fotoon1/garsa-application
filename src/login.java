
import java.awt.Color;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



/**
 *
 * @author ftoon
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
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
        garsaLabel = new javax.swing.JLabel();
        textArea1 = new javax.swing.JTextArea();
        panel1 = new javax.swing.JPanel();
        loginLabel = new javax.swing.JLabel();
        textField1 = new javax.swing.JTextField();
        button1 = new javax.swing.JButton();
        textField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        femaleRadioButton = new javax.swing.JRadioButton();
        maleRadioButton = new javax.swing.JRadioButton();
        backgroundLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("تطبيق غرسة ");
        setLocationByPlatform(true);
        setSize(new java.awt.Dimension(552, 530));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        garsaLabel.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        garsaLabel.setForeground(new java.awt.Color(14, 104, 29));
        garsaLabel.setText("غرسة");
        getContentPane().add(garsaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 100, 90));

        textArea1.setBackground(new java.awt.Color(242, 245, 230));
        textArea1.setColumns(20);
        textArea1.setFont(new java.awt.Font("Arabic Typesetting", 0, 24)); // NOI18N
        textArea1.setForeground(new java.awt.Color(50, 129, 63));
        textArea1.setLineWrap(true);
        textArea1.setRows(5);
        textArea1.setText("قال رسول الله صلى الله عليه وسلم  \n  ما من مسلم يغرس غرساً أو يزرع -:\nزرعاً فيأكل منه طير أو حيوان أو بهيمة \n        . إلا كان له به صدقة  ");
        textArea1.setWrapStyleWord(true);
        getContentPane().add(textArea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 210, 130));

        panel1.setBackground(new java.awt.Color(217, 236, 217));
        panel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(23, 77, 9)));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginLabel.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        loginLabel.setForeground(new java.awt.Color(36, 118, 57));
        loginLabel.setText("صفحة تسجيل الدخول ");
        panel1.add(loginLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 260, 50));

        textField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textField1.setForeground(new java.awt.Color(102, 102, 102));
        textField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField1ActionPerformed(evt);
            }
        });
        panel1.add(textField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 160, 40));

        button1.setBackground(new java.awt.Color(114, 185, 128));
        button1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        button1.setForeground(new java.awt.Color(21, 119, 60));
        button1.setText("تسجيل الدخول كزائر ");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        panel1.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 190, 50));

        textField2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textField2.setForeground(new java.awt.Color(102, 102, 102));
        textField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField2ActionPerformed(evt);
            }
        });
        panel1.add(textField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 160, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 0));
        jLabel1.setText("اسم الزائر:");
        panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 0));
        jLabel2.setText("رقم الجوال:");
        panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 0));
        jLabel3.setText("الجنس:");
        panel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, -1, -1));

        buttonGroup1.add(femaleRadioButton);
        femaleRadioButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        femaleRadioButton.setText("انثى");
        femaleRadioButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        panel1.add(femaleRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, -1, -1));

        buttonGroup1.add(maleRadioButton);
        maleRadioButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        maleRadioButton.setText("ذكر");
        maleRadioButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        maleRadioButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        maleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleRadioButtonActionPerformed(evt);
            }
        });
        panel1.add(maleRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 340, 460));

        backgroundLabel.setFont(new java.awt.Font("Arabic Typesetting", 0, 16)); // NOI18N
        backgroundLabel.setForeground(new java.awt.Color(12, 120, 28));
        backgroundLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\ftoon\\OneDrive\\الصور\\خلفية.jpg")); // NOI18N
        backgroundLabel.setText("fotofotoon");
        getContentPane().add(backgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -8, 1310, 550));

        jMenu1.setText("File");

        jMenuItem2.setMnemonic('E');
        jMenuItem2.setText("Exit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit Color");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jRadioButtonMenuItem1.setText("change background color to off-white color");
        jRadioButtonMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jRadioButtonMenuItem1);

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("change background color to light green color");
        jRadioButtonMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jRadioButtonMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(774, 586));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField1ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        
        try{
            if( isRigth()) { 
            //insert guest data into the file
            FileWriter writer = new FileWriter("login.txt", true);
                    writer.write(textField2.getText());
                    writer.write(System.getProperty("line.separator"));
                    writer.write(textField1.getText());
                    writer.write(System.getProperty("line.separator"));
                    writer.write("___________________________________");
                    writer.write(System.getProperty("line.separator"));
                    writer.close();
             //open  JFrame 2
            choose frame2 = new choose();
            frame2.show();//display frame 2 here
            dispose();//close current frame 1(login)after open frame 2
            }
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, e.getMessage());  
        }
    }//GEN-LAST:event_button1ActionPerformed

 public boolean isRigth() throws Exception {
            boolean flag=true;

            if( (textField2.getText().equals(""))){
                flag=false;
                throw new Exception("ادخل اسم المستخدم من فضلك"); 
            }
            if(textField1.getText().equals("")){
                flag=false;
                throw new Exception("ادخل رقم الجوال من فضلك"); 
            }
            if(!((femaleRadioButton.isSelected())||(maleRadioButton.isSelected()))){
                flag=false;
                throw new Exception("اختر جنسك من فضلك"); 
            }

return flag;
      
 }     
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void textField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField2ActionPerformed
       
        
    }//GEN-LAST:event_textField2ActionPerformed

    private void maleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleRadioButtonActionPerformed

    private void jRadioButtonMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem1ActionPerformed
          panel1.setBackground(new Color(253, 251, 237));
    }//GEN-LAST:event_jRadioButtonMenuItem1ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jRadioButtonMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem2ActionPerformed
        // TODO add your handling code here:
        panel1.setBackground(new Color(204, 239, 208));
    }//GEN-LAST:event_jRadioButtonMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JButton button1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton femaleRadioButton;
    private javax.swing.JLabel garsaLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JRadioButton maleRadioButton;
    private javax.swing.JPanel panel1;
    private javax.swing.JTextArea textArea1;
    private javax.swing.JTextField textField1;
    private javax.swing.JTextField textField2;
    // End of variables declaration//GEN-END:variables
}
