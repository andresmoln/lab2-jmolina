package com.jmolina.lab2.view;

import com.jmolina.lab2.model.User;
import com.jmolina.lab2.service.UserService;
import com.jmolina.lab2.util.Dialog;
import com.jmolina.lab2.util.FormUtils;
import com.jmolina.lab2.util.Validator;
import java.util.List;
import javax.swing.DefaultListModel;

public class UserMaintenance extends javax.swing.JFrame {
    
    private final DefaultListModel<String> listModel;
    private final UserService userService;
    private boolean isAdding = false;
    private boolean isUpdating = false;
    
    public UserMaintenance() {
        userService = UserService.getInstance();
        initComponents();
        listModel = new DefaultListModel<>();
        userList.setModel(listModel);
        loadUsers();
        setInitialState();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUsername = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        userList = new javax.swing.JList<>();
        txtPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDeactivate = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnConfirm = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 465));

        userList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                userListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(userList);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("User Maintenance");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("User Name");

        lblPassword.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPassword.setText("Password");

        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDeactivate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDeactivate.setText("Deactivate");
        btnDeactivate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeactivateActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnConfirm.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnConfirm.setText("Confirm");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addComponent(btnConfirm)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsername)
                            .addComponent(jLabel2)
                            .addComponent(lblPassword)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDeactivate)
                            .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(jLabel1)))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(lblPassword)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd)
                            .addComponent(btnDeactivate))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUpdate)
                            .addComponent(btnExit))))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirm)
                    .addComponent(btnCancel))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        setAddingState();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String selected = userList.getSelectedValue();
        String username = selected.split(" - ")[0];
        txtUsername.setText(username);
        setUpdatingState();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeactivateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeactivateActionPerformed
        deactivateUser();
    }//GEN-LAST:event_btnDeactivateActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        goBack();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        onConfirm();
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        setInitialState();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void userListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_userListValueChanged
        if (!evt.getValueIsAdjusting()) {
            String selected = userList.getSelectedValue();
            if (selected != null && !isAdding && !isUpdating) {
                btnUpdate.setEnabled(true);
                btnDeactivate.setEnabled(true);
                
                if (selected.contains("Inactive")) {
                    btnDeactivate.setText("Activate");
                } else {
                    btnDeactivate.setText("Deactivate");
                }
            }
        }
    }//GEN-LAST:event_userListValueChanged
    
    private void setInitialState() {
        txtUsername.setEnabled(false);
        txtPassword.setEnabled(false);
        txtPassword.setVisible(true);
        lblPassword.setVisible(true);
        
        FormUtils.clearFields(txtUsername, txtPassword);
        
        btnAdd.setVisible(true);
        btnUpdate.setVisible(true);
        btnDeactivate.setVisible(true);
        btnExit.setVisible(true);
        
        btnUpdate.setEnabled(false);
        btnDeactivate.setEnabled(false);
        
        btnConfirm.setVisible(false);
        btnCancel.setVisible(false);
        
        userList.clearSelection();
        
        isAdding = false;
        isUpdating = false;
        
        btnDeactivate.setText("Deactivate");
    }
    
    private void setAddingState() {
        isAdding = true;
        
        txtUsername.setEnabled(true);
        txtPassword.setEnabled(true);
        
        btnAdd.setVisible(false);
        btnUpdate.setVisible(false);
        btnDeactivate.setVisible(false);
        btnExit.setVisible(false);
        
        btnConfirm.setVisible(true);
        btnCancel.setVisible(true);
        
        txtUsername.requestFocus();
    }
    
    private void setUpdatingState() {
        isUpdating = true;
        
        txtUsername.setEnabled(true);
        txtPassword.setEnabled(false);
        txtPassword.setVisible(false);
        lblPassword.setVisible(false);
        
        btnAdd.setVisible(false);
        btnUpdate.setVisible(false);
        btnDeactivate.setVisible(false);
        btnExit.setVisible(false);
        
        btnConfirm.setVisible(true);
        btnCancel.setVisible(true);
    }
    
    private void loadUsers() {
        listModel.clear();
        List<User> users = userService.getUsers();
        
        for (User user : users) {
            String status = user.isActive() ? "Active" : "Inactive";
            listModel.addElement(user.getUsername() + " - " + status);
        }
    }
    
    private boolean addUser() {
        String username = txtUsername.getText();
        String password = String.valueOf(txtPassword.getPassword());
        
        if (Validator.isEmpty(username) || Validator.isEmpty(password)) {
            Dialog.showError(this, "All fields are required");
            return false;
        }
        
        if (userService.userExists(username)) {
            Dialog.showError(this, "User already exists");
            return false;
        }
        
        userService.addUser(new User(username, password, true));
        loadUsers();
        return true;
    }
    
    private boolean updateUser() {
        String selected = userList.getSelectedValue();
        String oldUsername = selected.split(" - ")[0];
        String newUsername = txtUsername.getText();
        
        if (Validator.isEmpty(newUsername)) {
            Dialog.showError(this, "Username is required");
            return false;
        }
        
        userService.updateUsername(oldUsername, newUsername);
        loadUsers();
        return true;
    }
    
    private void deactivateUser() {
        String selected = userList.getSelectedValue();
        
        if (selected == null) {
            Dialog.showError(this, "Select a user");
            return;
        }
        
        String username = selected.split(" - ")[0];
        
        if (selected.contains("Inactive")) {
            userService.activateUser(username);
        } else {
            userService.deactivateUser(username);
        }
        
        loadUsers();
        setInitialState();
    }
    
    private void onConfirm() {
        if (isAdding && addUser()) {
            setInitialState();
        } else if (isUpdating && updateUser()) {
            setInitialState();
        }
    }
    
    private void goBack() {
        new MainMenu().setVisible(true);
        this.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnDeactivate;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JList<String> userList;
    // End of variables declaration//GEN-END:variables
}
