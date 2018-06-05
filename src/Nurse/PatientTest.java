/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nurse;

import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sampath
 */
public class PatientTest extends javax.swing.JFrame {

    /**
     * Creates new form PatientTest
     */
    public PatientTest() {
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
        jLabel1 = new javax.swing.JLabel();
        sbmt = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        p_nic = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        s_id = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        repo = new javax.swing.JTextArea();
        d_id = new javax.swing.JTextField();
        updt = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        srch = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        p_nm = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        pts_table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(227, 222, 222));
        jPanel1.setMaximumSize(new java.awt.Dimension(1055, 343));
        jPanel1.setMinimumSize(new java.awt.Dimension(1055, 343));
        jPanel1.setPreferredSize(new java.awt.Dimension(1055, 343));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Prescription Details");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 1020, 40));

        sbmt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        sbmt.setText("Submit");
        sbmt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbmtActionPerformed(evt);
            }
        });
        jPanel1.add(sbmt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 90, 30));

        jLabel2.setText("Doctor ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 90, 30));

        p_nic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                p_nicKeyTyped(evt);
            }
        });
        jPanel1.add(p_nic, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 130, 30));

        jLabel4.setText("Patient NIC");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 90, 30));

        jLabel5.setText("Doctor's report");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 90, 30));

        jLabel6.setText("ServiceID");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 90, 30));
        jPanel1.add(s_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 130, 30));

        repo.setColumns(20);
        repo.setRows(5);
        jScrollPane1.setViewportView(repo);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 180, -1));
        jPanel1.add(d_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 130, 30));

        updt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        updt.setText("Update");
        updt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updtActionPerformed(evt);
            }
        });
        jPanel1.add(updt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 90, 30));

        jPanel2.setBackground(new java.awt.Color(227, 222, 222));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        srch.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        srch.setText("Search by NIC");
        srch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srchActionPerformed(evt);
            }
        });
        jPanel2.add(srch, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 200, 30));

        jLabel10.setText("Patient Name");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 90, 30));

        p_nm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_nmActionPerformed(evt);
            }
        });
        jPanel2.add(p_nm, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 230, 30));

        pts_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "prescript_id", "Service name", "doct_id", "ward_id (Service)", "date", "type", "description"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        pts_table.setColumnSelectionAllowed(true);
        jScrollPane2.setViewportView(pts_table);
        pts_table.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 670, 170));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 710, 260));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sbmtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbmtActionPerformed
        // TODO add your handling code here:
        String nic= p_nic.getText();
        String d_rep = repo.getText();
        int sID=0, dID=0;
        boolean chck=true;
        try{
            sID = Integer.valueOf(s_id.getText());
            dID = Integer.valueOf(d_id.getText()); 
        }catch(NumberFormatException e){
            chck = false;
            JOptionPane.showMessageDialog(null, "Invalid data type..", "Submission...",JOptionPane.INFORMATION_MESSAGE);
        }
        
        String sId= Integer.toString(sID);
        String dId= Integer.toString(dID);
        
        Controller.pst_TestCon pt = new Controller.pst_TestCon();
        if(chck && (nic.equals("") || sId.equals("") || dId.equals(""))){
            JOptionPane.showMessageDialog(null, "You haven't entered some data..", "Validation error..",JOptionPane.INFORMATION_MESSAGE);
        }else{
            pt.sbmtbtn(nic, sId, dId, d_rep);
        }
    }//GEN-LAST:event_sbmtActionPerformed

    private void updtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updtActionPerformed
        // TODO add your handling code here:
        String nic= p_nic.getText();
        String d_rep = repo.getText();
        int sID = 0;
        int dID = 0;
                
        try {
            sID = Integer.valueOf(s_id.getText());
            dID = Integer.valueOf(d_id.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "You have some invalid data..", "Error..",JOptionPane.INFORMATION_MESSAGE);
        }
        
        Controller.pst_TestCon pt = new Controller.pst_TestCon();
        String sid = Integer.toString(sID);
        String did = Integer.toString(dID);
        pt.updtbtn(nic, sid, did, d_rep);
        
        p_nic.setText("");
        s_id.setText("");
        d_id.setText("");
        repo.setText("");
        
    }//GEN-LAST:event_updtActionPerformed

    private void srchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srchActionPerformed
        // TODO add your handling code here:
        boolean check1 = true;
        String nic = p_nic.getText();
        String sID="", dID="", d_rep="", dt="", prepID="", pnm="", srvNM="", pID="";
        try {          
            Statement stat = Admin.DataBase.getStatement();
            ResultSet rs = stat.executeQuery("SELECT patient_fname, patient_lname FROM Patient WHERE nic_no='"+nic+"'");
            
            if(rs.next()){
                p_nm.setText(rs.getString(1) + " " + rs.getString(2));
            }else{
                check1=false;
                JOptionPane.showMessageDialog(null, "No patient with that nic no..", "Error..",JOptionPane.INFORMATION_MESSAGE);
            }
            if(check1){
                
                ResultSet rs1 = stat.executeQuery("SELECT pr.prescript_id, s.service_name, pr.doct_id, s.ward_id, pr.date, pr.type, pr.description "
                    + "FROM Patient p, Prescription pr, Service s "
                    + "WHERE p.nic_no='"+nic+"' AND pr.patient_id=p.patient_id AND s.serve_id=pr.serve_id");        
                
                DefaultTableModel dtm = (DefaultTableModel)pts_table.getModel();
                dtm.setRowCount(0);
                if(rs1.next()){
                    dtm.addRow(new Object[]{rs1.getString(1),rs1.getString(2),rs1.getString(3),rs1.getString(4),rs1.getString(5),rs1.getString(6),rs1.getString(7)});
                }
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_srchActionPerformed

    private void p_nmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_nmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p_nmActionPerformed

    private void p_nicKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p_nicKeyTyped
        // TODO add your handling code here:
        char a = evt.getKeyChar();
        if(p_nic.getText().length() == 10){
            evt.consume();
        }
    }//GEN-LAST:event_p_nicKeyTyped

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
            java.util.logging.Logger.getLogger(PatientTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientTest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField d_id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField p_nic;
    private javax.swing.JTextField p_nm;
    private javax.swing.JTable pts_table;
    private javax.swing.JTextArea repo;
    private javax.swing.JTextField s_id;
    private javax.swing.JButton sbmt;
    private javax.swing.JButton srch;
    private javax.swing.JButton updt;
    // End of variables declaration//GEN-END:variables
}
