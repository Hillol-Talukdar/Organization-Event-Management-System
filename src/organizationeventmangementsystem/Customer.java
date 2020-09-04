/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package organizationeventmangementsystem;

import DatabaseConnector.DatabaseManager;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author kallo
 */
public class Customer extends javax.swing.JFrame {

    /**
     * Creates new form Customer
     */
    
    DatabaseManager databaseManager;
    DefaultTableModel model;
    
    public Customer() {
        initComponents();
        jPanel1.setFocusable(true);
        
        read();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        customerJTable = new javax.swing.JTable();
        lastNamejLabel = new javax.swing.JLabel();
        firstNamejLabel = new javax.swing.JLabel();
        streetjLabel = new javax.swing.JLabel();
        cityjLabel = new javax.swing.JLabel();
        nationalIdjLabel = new javax.swing.JLabel();
        contactNumberjLabel = new javax.swing.JLabel();
        lastNamejTextField = new javax.swing.JTextField();
        firstNamejTextField = new javax.swing.JTextField();
        streetjTextField = new javax.swing.JTextField();
        nationalIdjTextField = new javax.swing.JTextField();
        contactNumberjTextField = new javax.swing.JTextField();
        cityjTextField = new javax.swing.JTextField();
        InsertjButton = new javax.swing.JButton();
        clearjButton = new javax.swing.JButton();
        deleteJButton = new javax.swing.JButton();
        searchJTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Customer");

        customerJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer Id", "First Name", "Last Name", "National Id", "Street", "City", "Contact Number"
            }
        ));
        jScrollPane1.setViewportView(customerJTable);

        lastNamejLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lastNamejLabel.setText("Last Name");

        firstNamejLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        firstNamejLabel.setText("First Name");

        streetjLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        streetjLabel.setText("Street");

        cityjLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cityjLabel.setText("City");

        nationalIdjLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nationalIdjLabel.setText("National Id");

        contactNumberjLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        contactNumberjLabel.setText("Contact No");

        lastNamejTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        firstNamejTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        firstNamejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNamejTextFieldActionPerformed(evt);
            }
        });

        streetjTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        nationalIdjTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        contactNumberjTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        cityjTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        InsertjButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        InsertjButton.setText("Insert");
        InsertjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertjButtonActionPerformed(evt);
            }
        });

        clearjButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clearjButton.setText("Clear");
        clearjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearjButtonActionPerformed(evt);
            }
        });

        deleteJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deleteJButton.setText("Delete");
        deleteJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteJButtonActionPerformed(evt);
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(contactNumberjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(contactNumberjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(streetjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nationalIdjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lastNamejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(firstNamejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nationalIdjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(streetjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lastNamejTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                        .addComponent(firstNamejTextField)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(cityjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cityjTextField)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(InsertjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clearjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(searchJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(searchJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstNamejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lastNamejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nationalIdjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nationalIdjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(streetjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(streetjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cityjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cityjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(contactNumberjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contactNumberjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deleteJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clearjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InsertjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(138, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        this.setSize(1400, 750);
    }//GEN-LAST:event_formWindowActivated

    private void InsertjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertjButtonActionPerformed
        
        try
        {
            String firstName = firstNamejTextField.getText();
            String lastName = lastNamejTextField.getText();          
            String nid = nationalIdjTextField.getText();           
            String street = streetjTextField.getText();
            String city = cityjTextField.getText();            
            String contactNumber = contactNumberjTextField.getText();
           
            
            if(firstName.isEmpty() || lastName.isEmpty() || nid.isEmpty() ||  street.isEmpty() || city.isEmpty() ||  contactNumber.isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Some Field is still Empty", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else
            {
                
               model =  (DefaultTableModel) customerJTable.getModel();
                
                
                databaseManager = DatabaseManager.getInstance();
                String querry = "INSERT INTO tbl_customer(cs_firstName,cs_lastName,cs_nationalId,cs_street,cs_city,cs_contactNumber) VALUES(?,?,?,?,?,?)";
                PreparedStatement pst = databaseManager.getPreparedStatement(querry);

                
                pst.setString(1, firstName);
                pst.setString(2, lastName);
                pst.setString(3, nid);
                pst.setString(4, street);
                pst.setString(5, city);
                pst.setString(6, contactNumber);

                pst.executeUpdate();

                JOptionPane.showMessageDialog(null, "Data inserted successfully!");
                
                read();
                clear();
            }
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e, "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_InsertjButtonActionPerformed

    private void clearjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearjButtonActionPerformed
        clear();
    }//GEN-LAST:event_clearjButtonActionPerformed

    private void deleteJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteJButtonActionPerformed
        // TODO add your handling code here:
        try
        {
            int row = customerJTable.getSelectedRow();
            delete(row);
        }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "No index selected", "Warning", JOptionPane.WARNING_MESSAGE);  
        }
    }//GEN-LAST:event_deleteJButtonActionPerformed

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

    private void searchJTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchJTextFieldKeyReleased
        // TODO add your handling code here:
        ResultSet rs;
        DatabaseManager customerData = DatabaseManager.getInstance();
        PreparedStatement pst;
        String search = searchJTextField.getText();

        try
        {

            String query = "Select * from tbl_customer where customerId Like '%" + search
            + "%' or cs_firstName Like '%" + search
            + "%' or cs_lastName Like '%" + search
            + "%' or cs_nationalId Like '%" + search
            + "%' or cs_street Like '%" + search
            + "%' or cs_city Like '%" + search
            + "%' or cs_contactNumber Like '%" + search + "%'";

            pst = customerData.getPreparedStatement(query);
            rs = pst.executeQuery();
            customerJTable.setModel(DbUtils.resultSetToTableModel(rs));

        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Please Check Database.Something is Wrong!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_searchJTextFieldKeyReleased

    private void firstNamejTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNamejTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNamejTextFieldActionPerformed

    private void searchJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchJTextFieldActionPerformed

    private void clear()
    {
        firstNamejTextField.setText(null);
        lastNamejTextField.setText(null);
        nationalIdjTextField.setText(null);
        streetjTextField.setText(null);
        cityjTextField.setText(null);
        contactNumberjTextField.setText(null);
    }
    
    private void delete(int row) 
    {

        Object index = customerJTable.getValueAt(row, 0);

        try {
            DatabaseManager customerData = DatabaseManager.getInstance();

            String query = "DELETE FROM tbl_customer Where customerId = " + index;
            PreparedStatement pst = customerData.getPreparedStatement(query);

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
        model = (DefaultTableModel) customerJTable.getModel();
        
        while (model.getRowCount() > 0)
        {
            model.removeRow(0);
        }

        DatabaseManager customerData = DatabaseManager.getInstance();

        if (customerData.checkConnection()) 
        {
            String query = "Select * From tbl_customer";
            ResultSet rset = null;
            try 
            {
                rset = customerData.getResult(query);
            } 
            catch (SQLException ex) 
            {
                JOptionPane.showMessageDialog(null, "Please Check Database.Something is Wrong!!", "Warning", JOptionPane.WARNING_MESSAGE);
                Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            try 
            {
                while (rset.next()) 
                {
                    int id = rset.getInt("customerId");
                    String firstName = rset.getString("cs_firstName");
                    String lastName = rset.getString("cs_lastName");
                    int nId = rset.getInt("cs_nationalId");
                    String street = rset.getString("cs_street");
                    String city = rset.getString("cs_city");
                    String contactNumber = rset.getString("cs_contactNumber");
                    

                    Object[] row = {id, firstName, lastName, nId, street, city, contactNumber};

                    model = (DefaultTableModel) customerJTable.getModel();

                    model.addRow(row);

                }
            } 
            catch (SQLException ex) 
            {
                JOptionPane.showMessageDialog(null, "Please Check Database.Something is Wrong!!", "Warning", JOptionPane.WARNING_MESSAGE);
                Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public int getCustomerId(String firstName, String lastName, String ContactNumber)
    {
        DatabaseManager customerData = DatabaseManager.getInstance();
        int customerId = -1;
        
        if(customerData.checkConnection())
        {
            ResultSet rset = null;
            try
            {
                String query = "Select customerId from tbl_customer where cs_firstName = "+"'"+firstName+"'"
                        + "and cs_contactNumber = "+"'"+ContactNumber+"'"
                        + "and cs_lastName = "+"'"+lastName+"';";
                rset = customerData.getResult(query);
            } 
            catch (SQLException ex) 
            {
                JOptionPane.showMessageDialog(null, "Please Check Database.Something is Wrong!!", "Warning", JOptionPane.WARNING_MESSAGE);
                Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try 
            {
                while(rset.next())
                {
                   customerId = Integer.parseInt(rset.getString("customerId"));
                }
                
            } 
            catch (SQLException ex) 
            {
               JOptionPane.showMessageDialog(null, "Please Check Database.Something is Wrong!!", "Warning", JOptionPane.WARNING_MESSAGE);
               Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
       return customerId;
       
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
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton InsertjButton;
    private javax.swing.JLabel cityjLabel;
    private javax.swing.JTextField cityjTextField;
    private javax.swing.JButton clearjButton;
    private javax.swing.JLabel contactNumberjLabel;
    private javax.swing.JTextField contactNumberjTextField;
    private javax.swing.JTable customerJTable;
    private javax.swing.JButton deleteJButton;
    private javax.swing.JLabel firstNamejLabel;
    private javax.swing.JTextField firstNamejTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lastNamejLabel;
    private javax.swing.JTextField lastNamejTextField;
    private javax.swing.JLabel nationalIdjLabel;
    private javax.swing.JTextField nationalIdjTextField;
    private javax.swing.JTextField searchJTextField;
    private javax.swing.JLabel streetjLabel;
    private javax.swing.JTextField streetjTextField;
    // End of variables declaration//GEN-END:variables
}
