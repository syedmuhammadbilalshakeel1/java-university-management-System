/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school;
import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


public class addStudent extends javax.swing.JFrame {

    /**
     * Creates new form page1
     */
    public addStudent() {
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

        jPanel1 = new javax.swing.JPanel();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        addStudent = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        add = new javax.swing.JButton();
        Sname = new javax.swing.JFormattedTextField();
        Sfathername = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        label7 = new javax.swing.JLabel();
        label6 = new javax.swing.JLabel();
        label5 = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        Sid = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        label1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Saddress = new javax.swing.JTextArea();
        SphoneNO = new javax.swing.JFormattedTextField();
        sCombox = new javax.swing.JComboBox<>();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        daate1 = new com.toedter.calendar.JDateChooser();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 985, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 556, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 51));
        setMinimumSize(new java.awt.Dimension(200, 300));
        setPreferredSize(new java.awt.Dimension(1550, 900));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 182, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1070, 100));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("_____________________________________________________");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, 520, -1));

        addStudent.setFont(new java.awt.Font("Stencil", 1, 48)); // NOI18N
        addStudent.setText("  Add Students");
        jPanel2.add(addStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, 440, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1580, 150));

        jPanel3.setBackground(java.awt.Color.white);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add.setBackground(java.awt.Color.black);
        add.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        add.setForeground(java.awt.Color.white);
        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel3.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 650, 170, 50));

        Sname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Sname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SnameActionPerformed(evt);
            }
        });
        jPanel3.add(Sname, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, 700, 40));

        Sfathername.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel3.add(Sfathername, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, 700, 40));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setText("Genter");
        jLabel1.setPreferredSize(new java.awt.Dimension(38, 24));
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 560, 120, 32));
        jLabel1.getAccessibleContext().setAccessibleName("label8");
        jLabel1.getAccessibleContext().setAccessibleDescription("");

        label7.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        label7.setText("Date");
        jPanel3.add(label7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 500, 120, 32));

        label6.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        label6.setText("Address");
        jPanel3.add(label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, 120, 32));

        label5.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        label5.setText("Phone.No");
        jPanel3.add(label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 120, 32));

        label4.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        label4.setText("Class");
        jPanel3.add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 120, 32));

        label3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        label3.setText("I.D");
        jPanel3.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 120, 32));

        label2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        label2.setText("Father Name");
        jPanel3.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 130, 32));

        Sid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel3.add(Sid, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 250, 700, 40));

        jButton1.setBackground(new java.awt.Color(44, 165, 182));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 50, 110, 40));

        label1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        label1.setText("Name");
        jPanel3.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 120, 32));

        jScrollPane1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        Saddress.setColumns(20);
        Saddress.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Saddress.setRows(5);
        jScrollPane1.setViewportView(Saddress);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 420, 700, 60));

        SphoneNO.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SphoneNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SphoneNOActionPerformed(evt);
            }
        });
        jPanel3.add(SphoneNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, 700, 40));

        sCombox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sCombox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Matric", "9th", "8th", "7th", "6th", "5th", "4th", "3rd", "2nd", "1st", "kg2", "kg1", "kg", " " }));
        sCombox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sComboxActionPerformed(evt);
            }
        });
        jPanel3.add(sCombox, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 310, 700, 40));

        buttonGroup1.add(male);
        male.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        male.setText("Male");
        jPanel3.add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 559, 140, 40));

        buttonGroup1.add(female);
        female.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        female.setText("Female");
        jPanel3.add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 559, 130, 40));
        jPanel3.add(daate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 500, 690, 50));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1590, 770));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        
      SimpleDateFormat sdff = new SimpleDateFormat();   // object is created for date jar 
        String daate = sdff.format(daate1.getDate());       // daate stores date 
    
    String getClass= sCombox.getSelectedItem().toString();  // String getClass stored Class
        // below 10 line is for to store gender in the gender variable
        String gender = "";
        if (male.isSelected()) {
            gender = "Male";
        }
        else if(female.isSelected()){
          gender = "Female";
        }
        else {
            gender = "";
        }
//        String [] cheak = {Sname.getText(),Sfathername.getText(),Sid.getText(),SphoneNO.getText(),Saddress.getText()};
//        boolean status = true;
//        for(int i= 0; i<cheak.length; i++){
//        if(cheak[i].equals("")){
//        status = false;
//        }
//        }
//        if(status == false){
//         JOptionPane.showMessageDialog(this, "hi");
//        }
//        String[] cheak = {Sname.getText(),Sfathername.getText(),Sid.getText(),getClass,SphoneNO.getText(),Saddress.getText(),daate,gender};
//        boolean status = true;
//        for(int i = 0; i < cheak.length; i++) {
//            if(cheak[i].equals("")) {
//                status = false;
//                break;
//            }
//        }
//        if (status == false) {
//            JOptionPane.showMessageDialog(this, "All Field Should Be Filled");
        
         if (Sname.getText().equals("") || Sfathername.getText().equals("") || Sid.getText().equals("") || SphoneNO.getText().equals("")|| Saddress.getText().equals("")|| gender.equals("") ) {
         JOptionPane.showMessageDialog(this, "Please, Fill All Field");
              
         }else {
        
        try {
        Sacred s = new Sacred();
        s.insert(Sname.getText(), Sfathername.getText(), Sid.getText(), getClass  , SphoneNO.getText(), Saddress.getText(), daate, gender);
        JOptionPane.showMessageDialog(this, "Data Inserted Successfully");
        Sname.setText("");
        Sfathername.setText("");
        Sid.setText("");
        SphoneNO.setText("");
        Saddress.setText("");
       // sCombox.setSelectedItem(0);
        
        
        } catch (Exception e) {
            System.out.println("Error in AddStudent botton"+e);
        }
    }
    }//GEN-LAST:event_addActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         dashBoard db = new dashBoard();
        db.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void SnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SnameActionPerformed

    private void SphoneNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SphoneNOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SphoneNOActionPerformed

    private void sComboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sComboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sComboxActionPerformed

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
            java.util.logging.Logger.getLogger(addStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addStudent().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Saddress;
    private javax.swing.JFormattedTextField Sfathername;
    private javax.swing.JFormattedTextField Sid;
    private javax.swing.JFormattedTextField Sname;
    private javax.swing.JFormattedTextField SphoneNO;
    private javax.swing.JButton add;
    private javax.swing.JLabel addStudent;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private com.toedter.calendar.JDateChooser daate1;
    private javax.swing.JRadioButton female;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JLabel label7;
    private javax.swing.JRadioButton male;
    private javax.swing.JComboBox<String> sCombox;
    // End of variables declaration//GEN-END:variables
}
