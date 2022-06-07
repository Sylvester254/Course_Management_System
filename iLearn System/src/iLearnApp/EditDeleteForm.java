/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iLearnApp;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class EditDeleteForm extends javax.swing.JFrame {

    /**
     * Creates new form EditDeleteForm
     */
    Scores sc = new Scores();
    public EditDeleteForm() {
        initComponents();
        sc.Fill_Score_Table(jTable1);
        jTable1.setRowHeight(40);
         jTable1.setShowGrid(true);
         jTable1.setGridColor(Color.black);
         jTable1.setSelectionBackground(Color.red);
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_std_Id = new javax.swing.JTextField();
        button_Remove_score = new java.awt.Button();
        jLabel6 = new javax.swing.JLabel();
        jTextField_Score = new javax.swing.JTextField();
        button_Edit_Score = new java.awt.Button();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jTextField_decription = new javax.swing.JTextField();
        jTextField_course_id = new javax.swing.JTextField();
        button_AddScore = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Edit / Delete Score");

        jLabel4.setFont(new java.awt.Font("Courier New", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Descrption:");

        jLabel5.setFont(new java.awt.Font("Courier New", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Student Id:");

        jTextField_std_Id.setEditable(false);
        jTextField_std_Id.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        jTextField_std_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_std_IdActionPerformed(evt);
            }
        });

        button_Remove_score.setBackground(new java.awt.Color(102, 102, 102));
        button_Remove_score.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        button_Remove_score.setForeground(new java.awt.Color(255, 255, 255));
        button_Remove_score.setLabel("Remove");
        button_Remove_score.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_Remove_scoreActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Courier New", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Course Id:");

        jTextField_Score.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        jTextField_Score.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ScoreActionPerformed(evt);
            }
        });

        button_Edit_Score.setBackground(new java.awt.Color(102, 102, 102));
        button_Edit_Score.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        button_Edit_Score.setForeground(new java.awt.Color(255, 255, 255));
        button_Edit_Score.setLabel("Edit");
        button_Edit_Score.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_Edit_ScoreActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Id", "Course Id", "Score", "Description"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jLabel7.setFont(new java.awt.Font("Courier New", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Score:");

        jTextField_decription.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        jTextField_decription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_decriptionActionPerformed(evt);
            }
        });

        jTextField_course_id.setEditable(false);
        jTextField_course_id.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        jTextField_course_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_course_idActionPerformed(evt);
            }
        });

        button_AddScore.setBackground(new java.awt.Color(102, 102, 102));
        button_AddScore.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        button_AddScore.setForeground(new java.awt.Color(255, 255, 255));
        button_AddScore.setLabel("Add");
        button_AddScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_AddScoreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(button_AddScore, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(button_Edit_Score, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(button_Remove_score, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jTextField_decription, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_std_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Score, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_course_id, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(247, 247, 247))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(52, 52, 52)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(718, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_std_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_course_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_Score, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_decription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button_AddScore, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button_Edit_Score, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button_Remove_score, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(206, 206, 206)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(267, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_std_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_std_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_std_IdActionPerformed

    private void button_Remove_scoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_Remove_scoreActionPerformed
            if(jTextField_std_Id.getText().equals("")){
            JOptionPane.showMessageDialog(null,"No Score Selected" );
        }else{
                        int SId,CId;
              SId = Integer.valueOf(jTextField_std_Id.getText());
               CId = Integer.valueOf(jTextField_course_id.getText());
               sc.insertUpdateDeleteScore('d', SId, CId,  null, null);
               jTable1.setModel(new DefaultTableModel(null ,new Object[]{"Student Id","Course Id","Score","Description"}));
               sc.Fill_Score_Table(jTable1);
                  }
    }//GEN-LAST:event_button_Remove_scoreActionPerformed

    
    private void jTextField_ScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ScoreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ScoreActionPerformed

    private void button_Edit_ScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_Edit_ScoreActionPerformed
              int SId,CId;
               
               
        if(jTextField_std_Id.getText().equals("") || jTextField_course_id.getText().equals("") ||
                  jTextField_Score.getText().equals("")  || jTextField_decription.getText().equals("")){
            JOptionPane.showMessageDialog(null,"No Score Selected" );
                
                                               }else{
            SId = Integer.valueOf(jTextField_std_Id.getText());
               CId = Integer.valueOf(jTextField_course_id.getText());
               double scr = Double.valueOf(jTextField_Score.getText());
               String des =jTextField_decription.getText();
                                sc.insertUpdateDeleteScore('u', SId, CId, scr, des);
                                 jTable1.setModel(new DefaultTableModel(null ,new Object[]{"Student Id","Course Id","Score","Description"}));
                                sc.Fill_Score_Table(jTable1);
                                           }
              
       
               
               
                       
//        int stdId = Integer.valueOf(jTextField_std_Id.getText());
//        int csdId = c.getCourseId(jComboBox_course_id.getSelectedItem().toString());
//        double scr = Double.valueOf(jTextField_Score.getText());
//        sc.insertUpdateDeleteScore('i', stdId, csdId, scr,jTextField_decription.getText());
        //        addCourceForm Addcf = new addCourceForm();
        //        Addcf.setVisible(true);
        //        Addcf.pack();
        //        Addcf.setLocationRelativeTo(null);
        //        Addcf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_button_Edit_ScoreActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
               

                           int rowIndex = jTable1.getSelectedRow();
                           jTextField_std_Id.setText(jTable1.getValueAt(rowIndex, 0).toString());
                           jTextField_course_id.setText(jTable1.getValueAt(rowIndex, 1).toString());
                           jTextField_Score.setText(jTable1.getValueAt(rowIndex, 2).toString());
                           jTextField_decription.setText(jTable1.getValueAt(rowIndex, 3).toString());
        //        DefaultTableModel model =(DefaultTableModel) jTable1.getModel();
        //        if(model.getValueAt(rowIndex, 3).toString().equals("Male")){jRadioButton_male.setSelected(true);jRadioButton_female.setSelected(false);}else{jRadioButton_female.setSelected(true);jRadioButton_male.setSelected(false);}
        //        jTextField_std_id.setText(model.getValueAt(rowIndex, 0).toString());
        //        jTextField_Fname.setText(model.getValueAt(rowIndex, 1).toString());
        //        jTextField_Lname.setText(model.getValueAt(rowIndex, 2).toString());
        //        jTextField_Phone.setText(model.getValueAt(rowIndex, 4).toString());
        //        jTextArea_txtarea.setText(model.getValueAt(rowIndex, 5).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
        // TODO add your handling code here:
        //        if(evt.getKeyCode()  == KeyEvent.VK_UP || evt.getKeyCode()  == KeyEvent.VK_DOWN)
        //        {
            //            rowIndex = jTable1.getSelectedRow();
            //            jTextField_std_id.setText(model.getValueAt(rowIndex, 0).toString());
            //            jTextField_Fname.setText(model.getValueAt(rowIndex, 1).toString());
            //            jTextField_Lname.setText(model.getValueAt(rowIndex, 2).toString());
            //            jTextField_Phone.setText(model.getValueAt(rowIndex, 4).toString());
            //            jTextArea_txtarea.setText(model.getValueAt(rowIndex, 5).toString());
            //
            //            if(model.getValueAt(rowIndex, 3).toString().equals("Male")){jRadioButton_male.setSelected(true);jRadioButton_female.setSelected(false);}else{jRadioButton_female.setSelected(true);jRadioButton_male.setSelected(false);}
            //
            //        }
    }//GEN-LAST:event_jTable1KeyReleased

    private void jTextField_decriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_decriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_decriptionActionPerformed

    private void jTextField_course_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_course_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_course_idActionPerformed

    private void button_AddScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_AddScoreActionPerformed
         addScoresForm Addscf = new addScoresForm();
        Addscf.setVisible(true);
        Addscf.pack();
        Addscf.setLocationRelativeTo(null);
        Addscf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_button_AddScoreActionPerformed

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
            java.util.logging.Logger.getLogger(EditDeleteForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditDeleteForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditDeleteForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditDeleteForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditDeleteForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button_AddScore;
    private java.awt.Button button_Edit_Score;
    private java.awt.Button button_Remove_score;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_Score;
    private javax.swing.JTextField jTextField_course_id;
    private javax.swing.JTextField jTextField_decription;
    private javax.swing.JTextField jTextField_std_Id;
    // End of variables declaration//GEN-END:variables
}
