package timetable;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class AddLecturer extends javax.swing.JFrame {

    /**
     * Creates new form AddLecturer
     */
    public AddLecturer() {
      initComponents();
        
       //getConnection();
    }
    
   /* public Connection getConnection(){
        
        Connection con = null;
        
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/member2","root","MySQL#123");
            JOptionPane.showMessageDialog(null,"Connected");
            return con;
        } catch (SQLException ex) {
            Logger.getLogger(AddLecturer.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Not Connected");
            return null;
        }
        
    
    }*/

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
        lLecturerName = new javax.swing.JLabel();
        lEmployeeID = new javax.swing.JLabel();
        lFaculty = new javax.swing.JLabel();
        lDepartment = new javax.swing.JLabel();
        lActiveHours = new javax.swing.JLabel();
        lCenter = new javax.swing.JLabel();
        lBuilding = new javax.swing.JLabel();
        lLevel = new javax.swing.JLabel();
        lRank = new javax.swing.JLabel();
        lAddLecturer = new javax.swing.JLabel();
        txtLecturerName = new javax.swing.JTextField();
        txtEmployeeID = new javax.swing.JTextField();
        txtLevel = new javax.swing.JTextField();
        txtRank = new javax.swing.JTextField();
        cbDepartment = new javax.swing.JComboBox<>();
        cbActiveHours = new javax.swing.JComboBox<>();
        cbFaculty = new javax.swing.JComboBox<>();
        cbCenter = new javax.swing.JComboBox<>();
        cbBuilding = new javax.swing.JComboBox<>();
        btnGenerateRank = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        btnManageLecturers = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 153));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lLecturerName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lLecturerName.setText("Lecturer Name");

        lEmployeeID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lEmployeeID.setText("Employee ID");

        lFaculty.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lFaculty.setText("Faculty");

        lDepartment.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lDepartment.setText("Department");

        lActiveHours.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lActiveHours.setText("Active hours");

        lCenter.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lCenter.setText("Center");

        lBuilding.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lBuilding.setText("Building");

        lLevel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lLevel.setText("Level");

        lRank.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lRank.setText("Rank");

        lAddLecturer.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lAddLecturer.setText("Add Lecturer");

        txtLecturerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLecturerNameActionPerformed(evt);
            }
        });

        cbDepartment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Department", "IT", "SE", "ISE", "IM", "DS", "CS", "CSNE", "QS" }));
        cbDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDepartmentActionPerformed(evt);
            }
        });

        cbActiveHours.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active Hours", "1", "2", "3", " " }));
        cbActiveHours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbActiveHoursActionPerformed(evt);
            }
        });

        cbFaculty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Faculty", "Computing", "Business", "Engineering", "Architechture", "Humanities and Science" }));

        cbCenter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Center", "Malabe", "Matara", "Jaffna", "Metro", "Kurunagala", "Kandy" }));

        cbBuilding.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Building", "Block A", "Block B", "Block E", "Block F" }));

        btnGenerateRank.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnGenerateRank.setText("Generate Rank");
        btnGenerateRank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateRankActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lLecturerName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lEmployeeID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lDepartment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lActiveHours, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtLecturerName)
                            .addComponent(txtEmployeeID)
                            .addComponent(cbDepartment, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbActiveHours, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(133, 133, 133)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lLevel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lRank, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lCenter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lBuilding, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtLevel)
                            .addComponent(txtRank)
                            .addComponent(cbCenter, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbBuilding, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(428, 428, 428)
                        .addComponent(lAddLecturer, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(138, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnGenerateRank, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(233, 233, 233))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(lAddLecturer, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lLecturerName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lCenter, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLecturerName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbCenter, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lBuilding, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbBuilding, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lLevel)
                                    .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lActiveHours, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbActiveHours, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lRank, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRank, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGenerateRank, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btnHome.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnManageLecturers.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnManageLecturers.setText("Manage Lecturers");
        btnManageLecturers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageLecturersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnManageLecturers)
                .addGap(42, 42, 42))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnManageLecturers, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        
       // Timetable C = new Timetable();
      //this.hide();
       //C.setVisible(true);
        
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnManageLecturersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageLecturersActionPerformed
        // TODO add your handling code here:
        
        
        ManageLecturer C = new ManageLecturer();
        this.hide();
        C.setVisible(true);
        
    }//GEN-LAST:event_btnManageLecturersActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String lname = txtLecturerName.getText();
        String employeeid = txtEmployeeID.getText();
        String department = cbDepartment.getSelectedItem().toString();
        String activeHours = cbActiveHours.getSelectedItem().toString();
        String faculty = cbFaculty.getSelectedItem().toString();
        String center =cbCenter.getSelectedItem().toString();
        String building =cbBuilding.getSelectedItem().toString();
        String level =txtLevel.getText();
        String rank = txtRank.getText();

        try{

            if(lname.equals("")||employeeid.equals("") || department.equals("") || activeHours.equals("") || faculty.equals("")||center.equals("")||building.equals("")||level.equals("")||rank.equals("") ){  //Input field validation

                JOptionPane.showMessageDialog(this, "Input fields cannot be empty","Error",JOptionPane.ERROR_MESSAGE);
            }else{

                MY_CONNECTION.setData("Insert into add_lecturer values('"+txtLecturerName.getText()+"','"+txtEmployeeID.getText()+"','"+cbDepartment.getSelectedItem().toString()+"','"+cbActiveHours.getSelectedItem().toString()+"','"+cbFaculty.getSelectedItem().toString()+"','"+cbCenter.getSelectedItem().toString()+"','"+cbBuilding.getSelectedItem().toString()+"','"+txtLevel.getText()+"','"+txtRank.getText()+"')");
                //table_update();
                txtLecturerName.setText("");
                txtEmployeeID.setText("");
                cbDepartment.setSelectedIndex(0);
                cbActiveHours.setSelectedIndex(0);
                cbFaculty.setSelectedIndex(0);
                cbCenter.setSelectedIndex(0);
                cbBuilding.setSelectedIndex(0);
                txtLevel.setText("");
                txtRank.setText("");
                //success msg
                JOptionPane.showMessageDialog(this, " added succesfully","Successful",JOptionPane.INFORMATION_MESSAGE);

            }
        }catch(Exception e){

            JOptionPane.showMessageDialog(this, "Invalid Input.Re enter details.","Error",JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
        }

        /*if(TimeTable.addLecturer (lname,employeeid,department,activeHours,faculty,center,building,level,rank))
        {
            JOptionPane.showMessageDialog(rootPane, "New Customer Added Succsessfully", "Add Customer", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Customer Not Added", "Add Customer Error", JOptionPane.ERROR_MESSAGE);
        }*/

    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        
                txtLecturerName.setText("");
                txtEmployeeID.setText("");
                cbDepartment.setSelectedIndex(0);
                cbActiveHours.setSelectedIndex(0);
                cbFaculty.setSelectedIndex(0);
                cbCenter.setSelectedIndex(0);
                cbBuilding.setSelectedIndex(0);
                txtLevel.setText("");
                txtRank.setText("");
        
        
        
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnGenerateRankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateRankActionPerformed
        // TODO add your handling code here:

        try{
            String empid = txtEmployeeID.getText();

            String leve= (String) txtLevel.getText();

            {

                String dis=leve+"."+empid;
                txtRank.setText(dis);

            }

        }catch(Exception e){
            System.out.println("inside");
            /*Error ob123=new Error();
            ob123.setVisible(true);*/
            JOptionPane.showMessageDialog(null,"Incorrect input for level or employeeID");

        }

    }//GEN-LAST:event_btnGenerateRankActionPerformed

    private void cbActiveHoursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbActiveHoursActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbActiveHoursActionPerformed

    private void cbDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDepartmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbDepartmentActionPerformed

    private void txtLecturerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLecturerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLecturerNameActionPerformed

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
            java.util.logging.Logger.getLogger(AddLecturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddLecturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddLecturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddLecturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddLecturer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnGenerateRank;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnManageLecturers;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cbActiveHours;
    private javax.swing.JComboBox<String> cbBuilding;
    private javax.swing.JComboBox<String> cbCenter;
    private javax.swing.JComboBox<String> cbDepartment;
    private javax.swing.JComboBox<String> cbFaculty;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lActiveHours;
    private javax.swing.JLabel lAddLecturer;
    private javax.swing.JLabel lBuilding;
    private javax.swing.JLabel lCenter;
    private javax.swing.JLabel lDepartment;
    private javax.swing.JLabel lEmployeeID;
    private javax.swing.JLabel lFaculty;
    private javax.swing.JLabel lLecturerName;
    private javax.swing.JLabel lLevel;
    private javax.swing.JLabel lRank;
    private javax.swing.JTextField txtEmployeeID;
    private javax.swing.JTextField txtLecturerName;
    private javax.swing.JTextField txtLevel;
    private javax.swing.JTextField txtRank;
    // End of variables declaration//GEN-END:variables
}
