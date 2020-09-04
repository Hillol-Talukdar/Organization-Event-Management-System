package organizationeventmangementsystem;

import DatabaseConnector.DatabaseManager;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author Hillol Talukdar
 */
public class organaization extends javax.swing.JFrame {

    DatabaseManager databaseManager;
    DefaultTableModel model;

    public organaization() {
        initComponents();
        jPanel1.setFocusable(true);
        
        read();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        namejLabel = new javax.swing.JLabel();
        streetjLabel = new javax.swing.JLabel();
        cityjLabel = new javax.swing.JLabel();
        maxCapacityjLabel = new javax.swing.JLabel();
        emailjLabel = new javax.swing.JLabel();
        contactNumberjLabel = new javax.swing.JLabel();
        namejTextField = new javax.swing.JTextField();
        streetjTextField = new javax.swing.JTextField();
        cityjTextField = new javax.swing.JTextField();
        maxCapacityjTextField = new javax.swing.JTextField();
        emailjTextField = new javax.swing.JTextField();
        contactNumberjTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        organaizationJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        insertjButton = new javax.swing.JButton();
        clearjButton = new javax.swing.JButton();
        deletejButton1 = new javax.swing.JButton();
        searchJTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        namejLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        namejLabel.setText("name");

        streetjLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        streetjLabel.setText("street");

        cityjLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cityjLabel.setText("city");

        maxCapacityjLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        maxCapacityjLabel.setText("max Capacity");

        emailjLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        emailjLabel.setText("email");
        emailjLabel.setPreferredSize(new java.awt.Dimension(118, 17));

        contactNumberjLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        contactNumberjLabel.setText("contact Number");

        namejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namejTextFieldActionPerformed(evt);
            }
        });

        streetjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                streetjTextFieldActionPerformed(evt);
            }
        });

        organaizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "name", "street", "city", "maxCapacity", "email", "contactNumber"
            }
        ));
        jScrollPane1.setViewportView(organaizationJTable);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("organaization");

        insertjButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        insertjButton.setText("Insert");
        insertjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertjButtonActionPerformed(evt);
            }
        });

        clearjButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clearjButton.setText("Clear");
        clearjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearjButtonActionPerformed(evt);
            }
        });

        deletejButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deletejButton1.setText("Delete");
        deletejButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletejButton1ActionPerformed(evt);
            }
        });

        searchJTextField.setForeground(new java.awt.Color(153, 153, 153));
        searchJTextField.setText("Search");
        searchJTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchJTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchJTextFieldFocusLost(evt);
            }
        });
        searchJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchJTextFieldActionPerformed(evt);
            }
        });
        searchJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchJTextFieldKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(emailjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                    .addComponent(maxCapacityjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(namejLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cityjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(streetjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contactNumberjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(insertjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 819, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(234, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(searchJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(deletejButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(clearjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(streetjTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                                                .addComponent(cityjTextField)
                                                .addComponent(maxCapacityjTextField)
                                                .addComponent(emailjTextField))
                                            .addComponent(namejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(contactNumberjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1)))
                        .addGap(36, 36, 36))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(searchJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(45, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(namejLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(namejTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(streetjTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(streetjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cityjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cityjTextField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(maxCapacityjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(maxCapacityjTextField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(emailjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailjTextField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(contactNumberjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(contactNumberjTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(insertjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clearjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deletejButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

        this.setSize(1400, 750);
    }//GEN-LAST:event_formWindowActivated

    private void namejTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namejTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namejTextFieldActionPerformed

    private void insertjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertjButtonActionPerformed
        // TODO add your handling code here:

        try 
        {
            String mxcap = maxCapacityjTextField.getText();
            String contactNumber = contactNumberjTextField.getText();

            int maxCapacity = Integer.parseInt(mxcap);
            String name = namejTextField.getText();
            String street = streetjTextField.getText();
            String city = cityjTextField.getText();
            String email = emailjTextField.getText();

            if (mxcap.isEmpty() || contactNumber.isEmpty() || name.isEmpty()
                    || street.isEmpty() || city.isEmpty() || email.isEmpty()) 
            {
                JOptionPane.showMessageDialog(null, "Some Field is still Empty", "Warning", JOptionPane.WARNING_MESSAGE);
            } 
            else 
            {

                model = (DefaultTableModel) organaizationJTable.getModel();

                databaseManager = DatabaseManager.getInstance();
                String query = "INSERT INTO tbl_organaization(org_name,org_street,org_city,org_MaxCapacity,org_email,org_contactNumber) VALUES (?,?,?,?,?,?)";
                PreparedStatement pst = databaseManager.getPreparedStatement(query);

                pst.setString(1, name);
                pst.setString(2, street);
                pst.setString(3, city);
                pst.setInt(4, maxCapacity);
                pst.setString(5, email);
                pst.setString(6, contactNumber);
              
                pst.executeUpdate();

                JOptionPane.showMessageDialog(null, "Data inserted successfully!");

                read();
                clear();
            }

        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, e, "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_insertjButtonActionPerformed

    private void clearjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearjButtonActionPerformed

        clear();
    }//GEN-LAST:event_clearjButtonActionPerformed

    private void streetjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_streetjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_streetjTextFieldActionPerformed

    private void deletejButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletejButton1ActionPerformed
        // TODO add your handling code here:
        try
        {   int row = organaizationJTable.getSelectedRow();
             delete(row);
        }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "No index selected", "Warning", JOptionPane.WARNING_MESSAGE);  
        }
    }//GEN-LAST:event_deletejButton1ActionPerformed

    private void searchJTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchJTextFieldFocusGained
        // TODO add your handling code here:
        if(searchJTextField.getText().equals("Search"))
        {
            searchJTextField.setText("");
            searchJTextField.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_searchJTextFieldFocusGained

    private void searchJTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchJTextFieldFocusLost
        // TODO add your handling code here:
        if(searchJTextField.getText().equals(""))
        {
            searchJTextField.setText("Search");
            searchJTextField.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_searchJTextFieldFocusLost

    private void searchJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchJTextFieldActionPerformed
        // TODO add your handling code here:
        

        
        
    }//GEN-LAST:event_searchJTextFieldActionPerformed

    private void searchJTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchJTextFieldKeyReleased
        // TODO add your handling code here:
        ResultSet rs;
        DatabaseManager organaizationData = DatabaseManager.getInstance();
        PreparedStatement pst;
        String search = searchJTextField.getText();

        try 
        {
            
            String query = "Select * from tbl_organaization where organaizationId Like '%" + search
                            + "%' or org_name Like '%" + search 
                            + "%' or org_street Like '%" + search 
                            + "%' or org_city Like '%" + search 
                            + "%' or org_maxCapacity Like '%" + search 
                            + "%' or org_email Like '%" + search 
                            + "%' or org_contactNumber Like '%" + search + "%'";
               
            pst = organaizationData.getPreparedStatement(query);
            rs = pst.executeQuery();
            organaizationJTable.setModel(DbUtils.resultSetToTableModel(rs));           
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Please Check Database.Something is Wrong!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_searchJTextFieldKeyReleased

    
    
    private void clear() 
    {
        maxCapacityjTextField.setText(null);
        contactNumberjTextField.setText(null);
        namejTextField.setText(null);
        streetjTextField.setText(null);
        cityjTextField.setText(null);
        emailjTextField.setText(null);
    }
    
    private void delete(int row) 
    {

        Object index = organaizationJTable.getValueAt(row, 0);

        try 
        {
            DatabaseManager organaizationData = DatabaseManager.getInstance();

            String query = "DELETE FROM tbl_organaization Where organaizationId = " + index;
            PreparedStatement pst = organaizationData.getPreparedStatement(query);

            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Data Deleted Successfully!", "Connection Status", JOptionPane.INFORMATION_MESSAGE);

            read();
        }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Please Check The Connection Settings!\nOr Fill The From Correctly", "Error!", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void read() 
    {

        model = (DefaultTableModel) organaizationJTable.getModel();
        
        while (model.getRowCount() > 0)
        {
            model.removeRow(0);
        }

        DatabaseManager organaizationData = DatabaseManager.getInstance();

        if (organaizationData.checkConnection()) 
        {
            String query = "Select * From tbl_organaization";
            ResultSet rset = null;
            try 
            {
                rset = organaizationData.getResult(query);
            } 
            catch (SQLException ex) 
            {
                JOptionPane.showMessageDialog(null, "Please Check Database.Something is Wrong!!", "Warning", JOptionPane.WARNING_MESSAGE);
                Logger.getLogger(organaization.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            try 
            {
                while (rset.next()) 
                {
                    int id = rset.getInt("organaizationId");
                    String name = rset.getString("org_name");
                    String street = rset.getString("org_street");
                    String city = rset.getString("org_city");
                    int maxCapacity = rset.getInt("org_maxCapacity");
                    String email = rset.getString("org_email");
                    String contactNumber = rset.getString("org_contactNumber");


                    Object[] row = {id, name, street, city, maxCapacity, email, contactNumber};

                    model = (DefaultTableModel) organaizationJTable.getModel();

                    model.addRow(row);

                }
            } 
            catch (SQLException ex) 
            {
                JOptionPane.showMessageDialog(null, "Please Check Database.Something is Wrong!!", "Warning", JOptionPane.WARNING_MESSAGE);
                Logger.getLogger(organaization.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    public int getOrganaizationId(String organaizationName)
    {
        DatabaseManager organaizationData = DatabaseManager.getInstance();
        int organaizationId = 0;
        
        if(organaizationData.checkConnection())
        {
            ResultSet rset = null;
            try
            {
                String query = "Select organaizationId from tbl_organaization where org_name = "+"'"+organaizationName+"';";
                rset = organaizationData.getResult(query);
            } 
            catch (SQLException ex) 
            {
                JOptionPane.showMessageDialog(null, "Please Check Database.Something is Wrong!!", "Warning", JOptionPane.WARNING_MESSAGE);
                Logger.getLogger(organaization.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try 
            {
                while(rset.next())
                {
                   organaizationId = Integer.parseInt(rset.getString("organaizationId"));
                }
                
            } 
            catch (SQLException ex) 
            {
               JOptionPane.showMessageDialog(null, "Please Check Database.Something is Wrong!!", "Warning", JOptionPane.WARNING_MESSAGE);
               Logger.getLogger(organaization.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
       return organaizationId;
       
    }
    
    public void setOrganaizationComboBox(JComboBox organaizationComboBox)
    {
        DatabaseManager organaizationData = DatabaseManager.getInstance();
        
        if(organaizationData.checkConnection())
        {
            ResultSet rset = null;
            try 
            {
                String query = "Select * from tbl_organaization";
                rset = organaizationData.getResult(query);
            } 
            catch (SQLException ex) 
            {
                JOptionPane.showMessageDialog(null, "Please Check Database.Something is Wrong!!", "Warning", JOptionPane.WARNING_MESSAGE);
                Logger.getLogger(organaization.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try 
            {
                while(rset.next())
                {    
                   String organaizationName = rset.getString("org_name");
                   organaizationComboBox.addItem(organaizationName);
                }
            }
            catch (SQLException ex) 
            {
                JOptionPane.showMessageDialog(null, "Please Check Database.Something is Wrong!!", "Warning", JOptionPane.WARNING_MESSAGE);
                Logger.getLogger(organaization.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
    }

    
    
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
            java.util.logging.Logger.getLogger(organaization.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(organaization.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(organaization.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(organaization.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new organaization().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cityjLabel;
    private javax.swing.JTextField cityjTextField;
    private javax.swing.JButton clearjButton;
    private javax.swing.JLabel contactNumberjLabel;
    private javax.swing.JTextField contactNumberjTextField;
    private javax.swing.JButton deletejButton1;
    private javax.swing.JLabel emailjLabel;
    private javax.swing.JTextField emailjTextField;
    private javax.swing.JButton insertjButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel maxCapacityjLabel;
    private javax.swing.JTextField maxCapacityjTextField;
    private javax.swing.JLabel namejLabel;
    private javax.swing.JTextField namejTextField;
    private javax.swing.JTable organaizationJTable;
    private javax.swing.JTextField searchJTextField;
    private javax.swing.JLabel streetjLabel;
    private javax.swing.JTextField streetjTextField;
    // End of variables declaration//GEN-END:variables
}
