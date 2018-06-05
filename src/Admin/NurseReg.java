/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Sampath
 */
public class NurseReg extends javax.swing.JFrame {

    /**
     * Creates new form NurseReg
     */
    public NurseReg() {
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fnm = new javax.swing.JTextField();
        lnm = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        addr = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        nrs_nic = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cntct = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ml = new javax.swing.JRadioButton();
        fml = new javax.swing.JRadioButton();
        sbmt = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        wrd_no = new javax.swing.JTextField();
        srch = new javax.swing.JButton();
        dlt = new javax.swing.JButton();
        updt = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        nrsID = new javax.swing.JTextField();
        empID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(227, 222, 222));
        jPanel1.setMaximumSize(new java.awt.Dimension(729, 480));
        jPanel1.setMinimumSize(new java.awt.Dimension(729, 480));
        jPanel1.setPreferredSize(new java.awt.Dimension(729, 480));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nurse Registration Form");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 650, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Last Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 80, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("First Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 80, 30));
        jPanel1.add(fnm, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 190, 30));
        jPanel1.add(lnm, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 190, 30));

        addr.setColumns(20);
        addr.setRows(5);
        jScrollPane1.setViewportView(addr);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 190, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Address");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 60, 20));

        nrs_nic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nrs_nicKeyTyped(evt);
            }
        });
        jPanel1.add(nrs_nic, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 100, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("NIC no");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 90, 30));
        jPanel1.add(cntct, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 110, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Gender");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 80, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Contact no");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 70, 30));

        ml.setBackground(new java.awt.Color(227, 222, 222));
        buttonGroup1.add(ml);
        ml.setText("Male");
        jPanel1.add(ml, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, -1, -1));

        fml.setBackground(new java.awt.Color(227, 222, 222));
        buttonGroup1.add(fml);
        fml.setText("Female");
        jPanel1.add(fml, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, -1, -1));

        sbmt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        sbmt.setText("Submit");
        sbmt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbmtActionPerformed(evt);
            }
        });
        jPanel1.add(sbmt, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 270, 50));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Ward no");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 60, 30));
        jPanel1.add(wrd_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, 110, 30));

        srch.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        srch.setText("Search by NIC");
        srch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srchActionPerformed(evt);
            }
        });
        jPanel1.add(srch, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 270, 40));

        dlt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        dlt.setText("Delete");
        dlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dltActionPerformed(evt);
            }
        });
        jPanel1.add(dlt, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, 110, 50));

        updt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        updt.setText("Update");
        updt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updtActionPerformed(evt);
            }
        });
        jPanel1.add(updt, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 110, 50));

        jPanel2.setBackground(new java.awt.Color(227, 222, 222));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Search Results");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 30));

        jLabel10.setText("Emp_id");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 90, 30));

        jLabel11.setText("Nurse_id");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 90, 30));
        jPanel2.add(nrsID, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 120, 30));

        empID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empIDActionPerformed(evt);
            }
        });
        jPanel2.add(empID, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 120, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 270, 150));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sbmtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbmtActionPerformed
        // TODO add your handling code here:
        String gendr="";
        boolean checkValidity=true;
        if(ml.isSelected()){
            gendr = "Male";
        }else if(fml.isSelected()){
            gendr = "Female";
        }
        
        //Inserting data to Employee table
        
        String nic = nrs_nic.getText();
        String lname = lnm.getText();
        String fname = fnm.getText();
        try {
            int wdno=Integer.valueOf(wrd_no.getText());
        } catch (NumberFormatException e) {
            checkValidity=false;
            JOptionPane.showMessageDialog(null, "Invalid data type..", "Error...",JOptionPane.INFORMATION_MESSAGE);
        }
        
        try {            
            Statement stat = DataBase.getStatement();
            ResultSet rs1 = stat.executeQuery("SELECT * FROM Employee WHERE nic_no='"+nic+"'");
            if(rs1.next()){
                JOptionPane.showMessageDialog(null, "This employee is already entered to the system..", "Validation Error..",JOptionPane.INFORMATION_MESSAGE);
                checkValidity=false;
            }
            if(nic.equals("") || lname.equals("") || fname.equals("")){
                checkValidity=false;                
            }
            if(checkValidity){
                stat.executeUpdate("INSERT INTO Employee (emp_fname, emp_lname, nic_no, address, contact_no, gender, career) "
                    + "VALUES('"+fname+"','"+lname+"','"+nic+"','"+addr.getText()+"','"+cntct.getText()+"','"+gendr+"','Nurse')");
            }else{
                JOptionPane.showMessageDialog(null, "You have input data in wrong pattern", "Validation Error..",JOptionPane.INFORMATION_MESSAGE);
            }
                       
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        //Reading data from Employee table and copy to Nurse table
        
        String empid_1="";
        if(checkValidity){
            try {
                Statement stat = DataBase.getStatement();
                ResultSet empId = stat.executeQuery("SELECT * FROM Employee "
                    + "WHERE emp_fname='"+fname+"' AND emp_lname='"+ lname+"'");

                while(empId.next()){
                    empid_1 = Integer.toString(empId.getInt("emp_id"));
                }
                
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        
            //copy to Nurse table

            try {
                Statement stat = DataBase.getStatement();
                stat.executeUpdate("INSERT INTO Nurse (emp_id, nurse_fname, nurse_lname, ward_id) "
                        + "VALUES('"+empid_1+"','"+fname+"','"+lname+"','"+wrd_no.getText()+"')");

            }catch (SQLException e1){
                e1.printStackTrace();
            }

            fnm.setText("");
            lnm.setText("");
            nrs_nic.setText("");
            addr.setText("");
            cntct.setText("");
            wrd_no.setText("");
            empID.setText("");
            nrsID.setText("");
        }
        
    }//GEN-LAST:event_sbmtActionPerformed

    private void srchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srchActionPerformed
        // TODO add your handling code here:
        String nrs_fnm="", nrs_lnm="", nrs_addr="", nrs_cntct="", gndr="", wd_no="", emp_Id="", nrs_Id="";
        try {
            Statement stat = DataBase.getStatement();
            ResultSet rs1 = stat.executeQuery("SELECT * FROM Employee WHERE nic_no='"+nrs_nic.getText()+"'");
            
            if(rs1.next()){
                emp_Id=rs1.getString("emp_id");
                nrs_fnm=rs1.getString("emp_fname");
                nrs_lnm=rs1.getString("emp_lname");
                nrs_addr=rs1.getString("address");
                nrs_cntct=rs1.getString("contact_no");
                gndr=rs1.getString("gender");
            }
                        
            else{
                JOptionPane.showMessageDialog(null, "NIC_no you entered is wrong...", "Error..",JOptionPane.INFORMATION_MESSAGE);
                nrs_nic.setText("");
            }
            
            ResultSet rs2 = stat.executeQuery("SELECT nurse_id, ward_id FROM Nurse WHERE emp_id='"+emp_Id+"'");
            
            if(rs2.next()){
                nrs_Id = rs2.getString(1);
                wd_no = rs2.getString(2);
            }else{
                JOptionPane.showMessageDialog(null, "NIC_no you entered is wrong...", "Error..",JOptionPane.INFORMATION_MESSAGE);
                nrs_nic.setText("");
                emp_Id = nrs_fnm = nrs_lnm = nrs_addr = nrs_cntct = gndr = "";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        fnm.setText(nrs_fnm);
        lnm.setText(nrs_lnm);
        addr.setText(nrs_addr);
        cntct.setText(nrs_cntct);
        wrd_no.setText(wd_no);
        empID.setText(emp_Id);
        nrsID.setText(nrs_Id);
        
        if(gndr.equals("Male")){
            ml.setSelected(true);
        }else if(gndr.equals("Female")){
            fml.setSelected(true);
        }
        
    }//GEN-LAST:event_srchActionPerformed

    private void empIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empIDActionPerformed

    private void updtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updtActionPerformed
        // TODO add your handling code here:
        String gndr="", emp_Id="", nrs_Id="";
        boolean check_1 = true;
        try {
            Statement stat = DataBase.getStatement();
            ResultSet rs1 = stat.executeQuery("SELECT * FROM Employee WHERE nic_no='"+nrs_nic.getText()+"'");
            int wdno=Integer.valueOf(wrd_no.getText());
            if(rs1.next()){
                
                emp_Id=empID.getText();
                nrs_Id = nrsID.getText();

                if(ml.isSelected()){
                    gndr = "Male";
                }else if(fml.isSelected()){
                    gndr = "Female";
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "NIC_no you entered is wrong... \n Cannot update", "Error..",JOptionPane.INFORMATION_MESSAGE);
                check_1=false;
            }
                                   
            if(check_1){
                JOptionPane.showMessageDialog(null, "Successfully updated.. ", "Updation..",JOptionPane.INFORMATION_MESSAGE);
                
                stat.executeUpdate("UPDATE Employee "
                        + "SET emp_fname='"+fnm.getText()+"', emp_lname='"+lnm.getText()+"', nic_no='"+nrs_nic.getText()+"', address='"+addr.getText()+"', contact_no='"+cntct.getText()+"', gender='"+gndr+"', career='Nurse' "
                        + "WHERE emp_id="+emp_Id);
                
                stat.executeUpdate("UPDATE Nurse "
                        + "SET emp_id='"+emp_Id+"', nurse_fname='"+fnm.getText()+"', nurse_lname='"+lnm.getText()+"', ward_id='"+wdno+"' "
                        + "WHERE nurse_id="+nrs_Id);
            }
        } catch (NumberFormatException e) {            
            JOptionPane.showMessageDialog(null, "Invalid data type..", "Error...",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        fnm.setText("");
        lnm.setText("");
        nrs_nic.setText("");
        addr.setText("");
        cntct.setText("");
        wrd_no.setText("");
        empID.setText("");
        nrsID.setText("");
    }//GEN-LAST:event_updtActionPerformed

    private void dltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dltActionPerformed
        // TODO add your handling code here:
        
        try {
            Statement stat = DataBase.getStatement();
            ResultSet rs1 = stat.executeQuery("SELECT * FROM Employee WHERE nic_no='"+nrs_nic.getText()+"'");
            String empId="", nrsId="";
            boolean check_2 = false;
            if(rs1.next()){
                empId=rs1.getString("emp_id");
                ResultSet rs2= stat.executeQuery("SELECT nurse_id FROM Nurse WHERE emp_id='"+empId+"'");
                
                if(rs2.next()){
                    nrsId= rs2.getString(1);
                    check_2=true;
                }
            }else{
                JOptionPane.showMessageDialog(null, "NIC_no you entered is wrong... \n Cannot delete", "Error..",JOptionPane.INFORMATION_MESSAGE);
            }
            
            if(check_2){
                stat.execute("DELETE FROM Nurse WHERE nurse_id='"+nrsId+"'");
                stat.execute("DELETE FROM Employee WHERE emp_id='"+empId+"'");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        fnm.setText("");
        lnm.setText("");
        nrs_nic.setText("");
        addr.setText("");
        cntct.setText("");
        wrd_no.setText("");
        empID.setText("");
        nrsID.setText("");
        
    }//GEN-LAST:event_dltActionPerformed

    private void nrs_nicKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nrs_nicKeyTyped
        // TODO add your handling code here:
        char a = evt.getKeyChar();
        if(nrs_nic.getText().length() == 10){
            evt.consume();
        }
    }//GEN-LAST:event_nrs_nicKeyTyped

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
            java.util.logging.Logger.getLogger(NurseReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NurseReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NurseReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NurseReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NurseReg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea addr;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField cntct;
    private javax.swing.JButton dlt;
    private javax.swing.JTextField empID;
    private javax.swing.JRadioButton fml;
    private javax.swing.JTextField fnm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lnm;
    private javax.swing.JRadioButton ml;
    private javax.swing.JTextField nrsID;
    private javax.swing.JTextField nrs_nic;
    private javax.swing.JButton sbmt;
    private javax.swing.JButton srch;
    private javax.swing.JButton updt;
    private javax.swing.JTextField wrd_no;
    // End of variables declaration//GEN-END:variables
}
