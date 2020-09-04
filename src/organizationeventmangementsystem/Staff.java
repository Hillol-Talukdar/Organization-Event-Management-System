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
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Hillol Talukdar
 */
public class Staff extends javax.swing.JFrame {

    /**
     * Creates new form Staff
     */
    
    DatabaseManager databaseManager;
    DefaultTableModel model;
    
    public Staff() {
        initComponents();
        jPanel1.setFocusable(true);
        
        loadRoleComboBox();
        
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

        genderButtonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        staffjTable = new javax.swing.JTable();
        lastNamejLabel = new javax.swing.JLabel();
        firstNamejLabel = new javax.swing.JLabel();
        rolejLabel = new javax.swing.JLabel();
        streetjLabel = new javax.swing.JLabel();
        nationalIdjLabel = new javax.swing.JLabel();
        genderjLabel = new javax.swing.JLabel();
        organaizationNamejLabel = new javax.swing.JLabel();
        contactNumberjLabel = new javax.swing.JLabel();
        cityjLabel = new javax.swing.JLabel();
        lastNamejTextField = new javax.swing.JTextField();
        nationalIdjTextField = new javax.swing.JTextField();
        streetjTextField = new javax.swing.JTextField();
        cityjTextField = new javax.swing.JTextField();
        contactNumberjTextField = new javax.swing.JTextField();
        firstNamejTextField = new javax.swing.JTextField();
        malejRadioButton = new javax.swing.JRadioButton();
        femalejRadioButton = new javax.swing.JRadioButton();
        clearjButton = new javax.swing.JButton();
        deleteJButton = new javax.swing.JButton();
        rolejComboBox = new javax.swing.JComboBox<>();
        searchJTextField = new javax.swing.JTextField();
        insertjButton1 = new javax.swing.JButton();
        organaizationNameJComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Staff");

        staffjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Staff Id", "First Name", "Last Name", "Role", "Gender", "National Id", "Street", "City", "Contact No", "Organaization Id"
            }
        ));
        jScrollPane1.setViewportView(staffjTable);

        lastNamejLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lastNamejLabel.setText("Last Name");

        firstNamejLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        firstNamejLabel.setText("First Name");

        rolejLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rolejLabel.setText("Role");

        streetjLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        streetjLabel.setText("Street");

        nationalIdjLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nationalIdjLabel.setText("National Id");

        genderjLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        genderjLabel.setText("Gender");

        organaizationNamejLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        organaizationNamejLabel.setText("Org. Name");

        contactNumberjLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        contactNumberjLabel.setText("Contact No");

        cityjLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cityjLabel.setText("City");

        lastNamejTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        nationalIdjTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        streetjTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        cityjTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        contactNumberjTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        firstNamejTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        genderButtonGroup.add(malejRadioButton);
        malejRadioButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        malejRadioButton.setText("Male");

        genderButtonGroup.add(femalejRadioButton);
        femalejRadioButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        femalejRadioButton.setText("Female");

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

        rolejComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rolejComboBoxActionPerformed(evt);
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
        searchJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchJTextFieldKeyReleased(evt);
            }
        });

        insertjButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        insertjButton1.setText("Insert");
        insertjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertjButton1ActionPerformed(evt);
            }
        });

        organaizationNameJComboBox.setMaximumRowCount(50);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(organaizationNamejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(organaizationNameJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(contactNumberjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(contactNumberjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(cityjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cityjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(streetjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(streetjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(rolejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(rolejComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(lastNamejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lastNamejTextField))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(firstNamejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(firstNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nationalIdjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(genderjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(nationalIdjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(4, 4, 4)
                                            .addComponent(malejRadioButton)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(femalejRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(insertjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)
                                .addComponent(deleteJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clearjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 933, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(searchJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstNamejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lastNamejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rolejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rolejComboBox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(genderjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(malejRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(femalejRadioButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nationalIdjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nationalIdjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(streetjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(streetjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cityjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cityjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(contactNumberjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contactNumberjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(organaizationNamejLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                            .addComponent(organaizationNameJComboBox))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clearjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(insertjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        this.setSize(1400, 750);
    }//GEN-LAST:event_formWindowActivated

    private void clearjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearjButtonActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_clearjButtonActionPerformed

    private void deleteJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteJButtonActionPerformed
        // TODO add your handling code here:
        try
        {
            int row = staffjTable.getSelectedRow();
            delete(row);
        }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "No index selected", "Warning", JOptionPane.WARNING_MESSAGE);  
        }
    }//GEN-LAST:event_deleteJButtonActionPerformed

    private void rolejComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rolejComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rolejComboBoxActionPerformed

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
        DatabaseManager staffData = DatabaseManager.getInstance();
        PreparedStatement pst;
        String search = searchJTextField.getText();

        try
        {

            String query = "Select * from tbl_staff where staffId Like '%" + search
            + "%' or st_firstName Like '%" + search
            + "%' or st_lastName Like '%" + search
            + "%' or st_role Like '%" + search
            + "%' or st_gender Like '%" + search
            + "%' or st_nationalId Like '%" + search
            + "%' or st_street Like '%" + search
            + "%' or st_city Like '%" + search
            + "%' or st_contactNumber Like '%" + search
            + "%' or organaizationId Like '%" + search + "%'";

            pst = staffData.getPreparedStatement(query);
            rs = pst.executeQuery();
            staffjTable.setModel(DbUtils.resultSetToTableModel(rs));

        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Please Check Database.Something is Wrong!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_searchJTextFieldKeyReleased

    private void insertjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertjButton1ActionPerformed
        // TODO add your handling code here:
        
        try 
        {
            organaization org = new organaization();
            
            String firstName = firstNamejTextField.getText();
            String lastName = lastNamejTextField.getText();
            String role = rolejComboBox.getSelectedItem().toString();
            String gender= "";
            
            if(malejRadioButton.isSelected())
                gender = "Male";
            else if(femalejRadioButton.isSelected())
                gender = "Female";
                
            String nid = nationalIdjTextField.getText();
            String street = streetjTextField.getText();
            String city = cityjTextField.getText();
            String contactNumber = contactNumberjTextField.getText();
            
            String organaizationName = organaizationNameJComboBox.getSelectedItem().toString();
            int organaizationId = org.getOrganaizationId(organaizationName);
            

            if (firstName.isEmpty() || firstName.isEmpty() || role.isEmpty() || gender.isEmpty() || nid.isEmpty()
                || street.isEmpty() || city.isEmpty() || contactNumber.isEmpty() || organaizationName.isEmpty() ) 
            {
                JOptionPane.showMessageDialog(null, "Some Field is still Empty", "Warning", JOptionPane.WARNING_MESSAGE);
            } 
            else 
            {

                model = (DefaultTableModel) staffjTable.getModel();

                databaseManager = DatabaseManager.getInstance();
                String query = "INSERT INTO "
                       + "tbl_staff(st_firstName, st_lastName, st_role, st_gender, st_nationalId, st_street, st_city, st_contactNumber, organaizationId)"
                       + " VALUES (?,?,?,?,?,?,?,?,?)";
                PreparedStatement pst = databaseManager.getPreparedStatement(query);

                pst.setString(1, firstName);
                pst.setString(2, lastName);
                pst.setString(3, role);
                pst.setString(4, gender);
                pst.setString(5, nid);
                pst.setString(6, street);
                pst.setString(7, city);
                pst.setString(8, contactNumber);
                pst.setInt(9, organaizationId);

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
        
    }//GEN-LAST:event_insertjButton1ActionPerformed

    private void clear()
    {
        organaization org = new organaization();
        
        organaizationNameJComboBox.removeAllItems();;
        org.setOrganaizationComboBox(this.organaizationNameJComboBox);
        
        firstNamejTextField.setText(null);
        lastNamejTextField.setText(null);
        malejRadioButton.setSelected(true);
        nationalIdjTextField.setText(null);
        streetjTextField.setText(null);
        cityjTextField.setText(null);
        contactNumberjTextField.setText(null);
        loadRoleComboBox();
    }
    
    private void delete(int row) 
    {

        Object index = staffjTable.getValueAt(row, 0);

        try 
        {
            DatabaseManager staffData = DatabaseManager.getInstance();

            String query = "DELETE FROM tbl_staff Where staffId = " + index;
            PreparedStatement pst = staffData.getPreparedStatement(query);

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
        organaization org = new organaization();
        
        organaizationNameJComboBox.removeAllItems();;
        org.setOrganaizationComboBox(this.organaizationNameJComboBox);
        
        model = (DefaultTableModel) staffjTable.getModel();
        
        while (model.getRowCount() > 0)
        {
            model.removeRow(0);
        }

        DatabaseManager staffData = DatabaseManager.getInstance();

        if (staffData.checkConnection()) 
        {
            String query = "Select * From tbl_staff";
            ResultSet rset = null;
            try 
            {
                rset = staffData.getResult(query);
            } 
            catch (SQLException ex) 
            {
                JOptionPane.showMessageDialog(null, "Please Check Database.Something is Wrong!!", "Warning", JOptionPane.WARNING_MESSAGE);
                Logger.getLogger(Staff.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            try 
            {
                while (rset.next()) 
                {
                    int id = rset.getInt("staffId");
                    String firstName = rset.getString("st_firstName");
                    String lastName = rset.getString("st_lastName");
                    String role = rset.getString("st_role");
                    String gender = rset.getString("st_gender");
                    String nid = rset.getString("st_nationalId");
                    String street = rset.getString("st_street");
                    String city = rset.getString("st_city");
                    String contactNumber = rset.getString("st_contactNumber");                    
                    int organaizationId = rset.getInt("organaizationId");
                    

                    Object[] row = {id, firstName, lastName, role, gender, nid, street, city, contactNumber, organaizationId};

                    model = (DefaultTableModel) staffjTable.getModel();

                    model.addRow(row);

                }
            } 
            catch (SQLException ex) 
            {
                JOptionPane.showMessageDialog(null, "Please Check Database.Something is Wrong!!", "Warning", JOptionPane.WARNING_MESSAGE);
                Logger.getLogger(Staff.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public int getStaffeId(String firstName, String lastName, int organaizationId)
    {
        DatabaseManager staffData = DatabaseManager.getInstance();
        int staffId = -1;
        
        if(staffData.checkConnection())
        {
            ResultSet rset = null;
            try
            {
                String query = "Select staffId from tbl_staff where st_firstName = "+"'"+firstName+"'"
                        + "and organaizationId = "+"'"+organaizationId+"'"
                        + "and st_lastName = "+"'"+lastName+"';";
                rset = staffData.getResult(query);
            } 
            catch (SQLException ex) 
            {
                JOptionPane.showMessageDialog(null, "Please Check Database.Something is Wrong!!", "Warning", JOptionPane.WARNING_MESSAGE);
                Logger.getLogger(Staff.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try 
            {
                while(rset.next())
                {
                   staffId = Integer.parseInt(rset.getString("staffId"));
                }
                
            } 
            catch (SQLException ex) 
            {
               JOptionPane.showMessageDialog(null, "Please Check Database.Something is Wrong!!", "Warning", JOptionPane.WARNING_MESSAGE);
               Logger.getLogger(Staff.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
       return staffId;
       
    }
    
    private void loadRoleComboBox()
    {
        rolejComboBox.setModel(new DefaultComboBoxModel<>(StaffRole.values()));
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
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Staff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cityjLabel;
    private javax.swing.JTextField cityjTextField;
    private javax.swing.JButton clearjButton;
    private javax.swing.JLabel contactNumberjLabel;
    private javax.swing.JTextField contactNumberjTextField;
    private javax.swing.JButton deleteJButton;
    private javax.swing.JRadioButton femalejRadioButton;
    private javax.swing.JLabel firstNamejLabel;
    private javax.swing.JTextField firstNamejTextField;
    private javax.swing.ButtonGroup genderButtonGroup;
    private javax.swing.JLabel genderjLabel;
    private javax.swing.JButton insertjButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lastNamejLabel;
    private javax.swing.JTextField lastNamejTextField;
    private javax.swing.JRadioButton malejRadioButton;
    private javax.swing.JLabel nationalIdjLabel;
    private javax.swing.JTextField nationalIdjTextField;
    private javax.swing.JComboBox<String> organaizationNameJComboBox;
    private javax.swing.JLabel organaizationNamejLabel;
    private javax.swing.JComboBox<StaffRole> rolejComboBox;
    private javax.swing.JLabel rolejLabel;
    private javax.swing.JTextField searchJTextField;
    private javax.swing.JTable staffjTable;
    private javax.swing.JLabel streetjLabel;
    private javax.swing.JTextField streetjTextField;
    // End of variables declaration//GEN-END:variables
}
