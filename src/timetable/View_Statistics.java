package timetable;


import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class View_Statistics extends javax.swing.JFrame {

    /**
     * Creates new form statistic
     */
    public View_Statistics()  {
        //this.conl = MY_CONNECTION.getConnection();
        initComponents();
    }

    //Connection conl;
    PreparedStatement pst1;
    ResultSet rs;
    
    Connection conl;
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
        jLabel1 = new javax.swing.JLabel();
        txtRegRooms = new javax.swing.JTextField();
        txtRegLecturers = new javax.swing.JTextField();
        txtRegStudent = new javax.swing.JTextField();
        txtRegsubject = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        textlateLec = new javax.swing.JTextField();
        txtlategroup = new javax.swing.JTextField();
        txtsubject = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 153));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Show bar chart");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registerd Rooms");

        txtRegRooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegRoomsActionPerformed(evt);
            }
        });
        txtRegRooms.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtRegRoomsPropertyChange(evt);
            }
        });

        txtRegLecturers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegLecturersActionPerformed(evt);
            }
        });
        txtRegLecturers.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtRegLecturersPropertyChange(evt);
            }
        });

        txtRegStudent.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtRegStudentPropertyChange(evt);
            }
        });

        txtRegsubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegsubjectActionPerformed(evt);
            }
        });
        txtRegsubject.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtRegsubjectPropertyChange(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Registered Lecturers ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Registered Students");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Registered Subjects ");

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "What's new", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Latest Lecturer");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("Latest Group");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Latest Subject");

        textlateLec.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                textlateLecPropertyChange(evt);
            }
        });

        txtlategroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlategroupActionPerformed(evt);
            }
        });
        txtlategroup.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtlategroupPropertyChange(evt);
            }
        });

        txtsubject.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtsubjectPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(textlateLec, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtlategroup)
                            .addComponent(txtsubject))))
                .addGap(72, 72, 72))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textlateLec, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtlategroup, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtsubject, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton2.setText("Home");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 617, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(105, 105, 105))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(txtRegRooms, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(174, 174, 174)
                        .addComponent(txtRegLecturers, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126)
                        .addComponent(txtRegStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(158, 158, 158)
                        .addComponent(txtRegsubject, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(272, 272, 272)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(105, 105, 105)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addGap(53, 53, 53)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRegLecturers, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRegRooms, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRegStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRegsubject, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(185, 185, 185))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public int getLecCount(){
        
        try{
            conl=MY_CONNECTION.getConnection();
            String query = "SELECT COUNT(*) FROM location WHERE room_type='Lecture Hall'";
            PreparedStatement st = conl.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                int i = rs.getInt(1);
                return i;
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return 0;
    }
    
    public int getLabCount(){
        try{
            conl=MY_CONNECTION.getConnection();
            String query = "SELECT COUNT(*) FROM location WHERE room_type='Laboratory'";
            PreparedStatement st = conl.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                int i = rs.getInt(1);
                return i;
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return 0;
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
        DefaultCategoryDataset dcd = new DefaultCategoryDataset();
        dcd.setValue(getLecCount(), "capacity", "Lecture Room");
        dcd.setValue(getLabCount(), "capacity", "Laboratoty");

        JFreeChart jchart = ChartFactory.createBarChart("Location Record", "Location Type", "capacity", dcd, PlotOrientation.VERTICAL, true, true, false);

        CategoryPlot plot = jchart.getCategoryPlot();
        plot.setRangeGridlinePaint(Color.black);

        ChartFrame chartFrm = new ChartFrame("Location Record", jchart, true);
        chartFrm.setVisible(true);
        chartFrm.setSize(500, 400);
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtRegRoomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegRoomsActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtRegRoomsActionPerformed

    
    
    private void txtRegRoomsPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtRegRoomsPropertyChange
        int i = 0;
        try{
            conl=MY_CONNECTION.getConnection();
            String query = "SELECT COUNT(*) FROM location";
            PreparedStatement st = conl.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                i = rs.getInt(1);
            }
            txtRegRooms.setText(String.valueOf(i));
        }catch(SQLException e){
            System.out.println(e);
        } catch (Exception ex) {
            Logger.getLogger(View_Statistics.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_txtRegRoomsPropertyChange

    private void txtRegLecturersPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtRegLecturersPropertyChange
        // TODO add your handling code here:
       int i = 0;
        try{
            conl=MY_CONNECTION.getConnection();
            String query = "SELECT COUNT(*) FROM add_lecturer";
            PreparedStatement st = conl.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                i = rs.getInt(1);
            }
            txtRegLecturers.setText(String.valueOf(i));
        }catch(SQLException e){
            System.out.println(e);
        } catch (Exception ex) {
            Logger.getLogger(View_Statistics.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        
        
    }//GEN-LAST:event_txtRegLecturersPropertyChange

    private void txtRegStudentPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtRegStudentPropertyChange
        // TODO add your handling code here:
        int i = 0;
        try{
            conl=MY_CONNECTION.getConnection();
            String query = "SELECT COUNT(*) FROM student";
            PreparedStatement st = conl.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                i = rs.getInt(1);
            }
            txtRegStudent.setText(String.valueOf(i));
        }catch(SQLException e){
            System.out.println(e);
        } catch (Exception ex) {
            Logger.getLogger(View_Statistics.class.getName()).log(Level.SEVERE, null, ex);
        } 
              
        
        
        
   
    }//GEN-LAST:event_txtRegStudentPropertyChange

    private void txtRegsubjectPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtRegsubjectPropertyChange
        // TODO add your handling code here:
        int i = 0;
        try{
            conl=MY_CONNECTION.getConnection();
            String query = "SELECT COUNT(*) FROM subjects";
            PreparedStatement st = conl.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                i = rs.getInt(1);
            }
            txtRegsubject.setText(String.valueOf(i));
        }catch(SQLException e){
            System.out.println(e);
        } catch (Exception ex) {
            Logger.getLogger(View_Statistics.class.getName()).log(Level.SEVERE, null, ex);
        } 
              
        
    }//GEN-LAST:event_txtRegsubjectPropertyChange

    private void textlateLecPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_textlateLecPropertyChange
        // TODO add your handling code here:
        String i = null ;
        try {
            conl=MY_CONNECTION.getConnection();
            String query = "SELECT lname as lastLocation from add_lecturer ORDER BY eid ASC";
            
            PreparedStatement st = conl.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                i = rs.getString(1);
            }
            textlateLec.setText(String.valueOf(i));
        }catch(SQLException e){
            System.out.println(e);
        } catch (Exception ex) {
            Logger.getLogger(View_Statistics.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_textlateLecPropertyChange

    private void txtlategroupPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtlategroupPropertyChange
        // TODO add your handling code here:
        
        String i = null ;
        try {
            conl=MY_CONNECTION.getConnection();
            String query = "SELECT GroupID as lastGroup from student ORDER BY id ASC";
            
            PreparedStatement st = conl.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                i = rs.getString(1);
            }
            txtlategroup.setText(String.valueOf(i));
        }catch(SQLException e){
            System.out.println(e);
        } catch (Exception ex) {
            Logger.getLogger(View_Statistics.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        
    }//GEN-LAST:event_txtlategroupPropertyChange

    private void txtlategroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlategroupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlategroupActionPerformed

    private void txtsubjectPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtsubjectPropertyChange
        // TODO add your handling code here:
        String i = null ;
        try {
            conl=MY_CONNECTION.getConnection();
            String query = "SELECT subject_name as lastSubject from subjects ORDER BY id ASC";
            
            PreparedStatement st = conl.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                 i = rs.getString(1);
            }
            txtsubject.setText(String.valueOf(i));
        }catch(SQLException e){
            System.out.println(e);
        } catch (Exception ex) {
            Logger.getLogger(View_Statistics.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_txtsubjectPropertyChange

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        Timetable C = new Timetable();
        this.hide();
        C.setVisible(true);
           
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtRegsubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegsubjectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRegsubjectActionPerformed

    private void txtRegLecturersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegLecturersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRegLecturersActionPerformed

    //public void getLocationCount(){
        
    
    
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
            java.util.logging.Logger.getLogger(View_Statistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_Statistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_Statistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Statistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new View_Statistics().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(View_Statistics.class.getName()).log(Level.SEVERE, null, ex);
                }
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField textlateLec;
    private javax.swing.JTextField txtRegLecturers;
    private javax.swing.JTextField txtRegRooms;
    private javax.swing.JTextField txtRegStudent;
    private javax.swing.JTextField txtRegsubject;
    private javax.swing.JTextField txtlategroup;
    private javax.swing.JTextField txtsubject;
    // End of variables declaration//GEN-END:variables
}
