package timetable;


import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class AddSubjects extends javax.swing.JFrame {

    /**
     * Creates new form AddSubjects
     */
    public AddSubjects() {
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
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lAddSubject = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lOfferedSemester = new javax.swing.JLabel();
        lSubjectName = new javax.swing.JLabel();
        lSubjectCode = new javax.swing.JLabel();
        cbOfferedYear = new javax.swing.JComboBox<>();
        cbOfferedSemester = new javax.swing.JComboBox<>();
        txtSubjectName = new javax.swing.JTextField();
        txtSubjectCode = new javax.swing.JTextField();
        lLHours = new javax.swing.JLabel();
        lThours = new javax.swing.JLabel();
        lLabHours = new javax.swing.JLabel();
        lEHours = new javax.swing.JLabel();
        btnSaveSubject = new javax.swing.JButton();
        cbNumLecH = new javax.swing.JComboBox<>();
        cbNumTuteH = new javax.swing.JComboBox<>();
        cbNumLabH = new javax.swing.JComboBox<>();
        cbNumEvalH = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 153));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(559, 172));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setText("Manage Subjects");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 305, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jButton2)
                .addGap(55, 55, 55))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        lAddSubject.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lAddSubject.setText("Add Subject");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setText("Offered Year");

        lOfferedSemester.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lOfferedSemester.setText("Offered Semester");

        lSubjectName.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lSubjectName.setText("Subject Name");

        lSubjectCode.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lSubjectCode.setText("Subject Code");

        cbOfferedYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Offered Year", "1", "2", "3", "4" }));

        cbOfferedSemester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Offered Semester", "1", "2" }));

        txtSubjectCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubjectCodeActionPerformed(evt);
            }
        });

        lLHours.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lLHours.setText("Number of Lecturer Hours");

        lThours.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lThours.setText("Number of Tutorial Hours");

        lLabHours.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lLabHours.setText("Number of Lab Hours");

        lEHours.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lEHours.setText("Number of Evaluation Hours");

        btnSaveSubject.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnSaveSubject.setText("Save");
        btnSaveSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveSubjectActionPerformed(evt);
            }
        });

        cbNumLecH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Number of Lecture Hours", "0", "1", "2", "3" }));

        cbNumTuteH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Number of Tutorial Hours", "0", "1", " " }));

        cbNumLabH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Number of Lab Hours", "0", "1", "2" }));

        cbNumEvalH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Number of Evaluation Hours", "0", "1", "2" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lOfferedSemester, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lSubjectName, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lSubjectCode, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbOfferedYear, 0, 165, Short.MAX_VALUE)
                    .addComponent(cbOfferedSemester, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSubjectName)
                    .addComponent(txtSubjectCode))
                .addGap(114, 114, 114)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lLHours)
                    .addComponent(lThours, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lLabHours, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lEHours, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbNumLecH, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbNumTuteH, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbNumLabH, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbNumEvalH, 0, 193, Short.MAX_VALUE))
                .addGap(0, 58, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lAddSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(491, 491, 491))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnSaveSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(515, 515, 515))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(lAddSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbOfferedYear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lLHours, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbNumLecH, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lOfferedSemester, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbOfferedSemester, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lThours, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(cbNumTuteH, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lSubjectName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSubjectName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lLabHours, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbNumLabH, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lEHours, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSubjectCode, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lSubjectCode, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbNumEvalH, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(btnSaveSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        Timetable C = new Timetable();
       this.hide();
       C.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtSubjectCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubjectCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSubjectCodeActionPerformed

    private void btnSaveSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveSubjectActionPerformed
        // TODO add your handling code here:
        
            String offeredYear = cbOfferedYear.getSelectedItem().toString();
            String offeredSemester = cbOfferedSemester.getSelectedItem().toString();
            String subjectName = txtSubjectName.getText();
            String subjectCode = txtSubjectCode.getText();
            String lectureHours = cbNumLecH.getSelectedItem().toString();
            String tutorialHours = cbNumTuteH.getSelectedItem().toString();
            String labHours =cbNumLabH.getSelectedItem().toString();
            String evaluationHours = cbNumEvalH.getSelectedItem().toString();
             
          
            
                try{
                    
        if(offeredYear.equals("")||offeredSemester.equals("") || subjectName.equals("") || subjectCode.equals("") || lectureHours.equals("")||tutorialHours.equals("")||labHours.equals("")||evaluationHours.equals("")){  //Input field validation
        
        JOptionPane.showMessageDialog(this, "Input fields cannot be empty","Error",JOptionPane.ERROR_MESSAGE);
        }else{
              
  
         
             MY_CONNECTION.setData("Insert into subjects values('0','"+cbOfferedYear.getSelectedItem().toString()+"','"+cbOfferedSemester.getSelectedItem().toString()+"','"+txtSubjectName.getText()+"','"+txtSubjectCode.getText()+"','"+cbNumLecH.getSelectedItem().toString()+"','"+cbNumTuteH.getSelectedItem().toString()+"','"+cbNumLabH.getSelectedItem().toString()+"','"+cbNumEvalH.getSelectedItem().toString()+"')");
             //table_update();
             
             cbOfferedYear.setSelectedIndex(0);
             cbOfferedSemester.setSelectedIndex(0);
             txtSubjectName.setText("");
             txtSubjectCode.setText("");
             cbNumLecH.setSelectedIndex(0);
             cbNumTuteH.setSelectedIndex(0);
             cbNumLabH.setSelectedIndex(0);
             cbNumEvalH.setSelectedIndex(0);
                
        //success msg
        JOptionPane.showMessageDialog(this, " added succesfully","Successful",JOptionPane.INFORMATION_MESSAGE);
       
        }
        }catch(Exception e){
        
        JOptionPane.showMessageDialog(this, "Invalid Input.Re enter details.","Error",JOptionPane.ERROR_MESSAGE);
        System.out.println(e);
        }
        
        
    }//GEN-LAST:event_btnSaveSubjectActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        //ManageSubjects C = new ManageSubjects();
        //this.hide();
        //C.setVisible(true);
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(AddSubjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddSubjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddSubjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddSubjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddSubjects().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaveSubject;
    private javax.swing.JComboBox<String> cbNumEvalH;
    private javax.swing.JComboBox<String> cbNumLabH;
    private javax.swing.JComboBox<String> cbNumLecH;
    private javax.swing.JComboBox<String> cbNumTuteH;
    private javax.swing.JComboBox<String> cbOfferedSemester;
    private javax.swing.JComboBox<String> cbOfferedYear;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lAddSubject;
    private javax.swing.JLabel lEHours;
    private javax.swing.JLabel lLHours;
    private javax.swing.JLabel lLabHours;
    private javax.swing.JLabel lOfferedSemester;
    private javax.swing.JLabel lSubjectCode;
    private javax.swing.JLabel lSubjectName;
    private javax.swing.JLabel lThours;
    private javax.swing.JTextField txtSubjectCode;
    private javax.swing.JTextField txtSubjectName;
    // End of variables declaration//GEN-END:variables
}
