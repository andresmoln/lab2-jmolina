package com.jmolina.lab2.view;

import com.jmolina.lab2.model.User;
import com.jmolina.lab2.service.UserService;
import com.jmolina.lab2.util.Dialog;
import com.jmolina.lab2.util.FormUtils;
import com.jmolina.lab2.util.Validator;
import java.util.List;
import javax.swing.DefaultListModel;

public class PasswordReset extends javax.swing.JFrame {

    private final DefaultListModel<String> listModel;
    private final UserService userService;

    public PasswordReset() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnConfirm = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        userList = new javax.swing.JList<>();
        txtCurrentPassword = new javax.swing.JPasswordField();
        txtNewPassword = new javax.swing.JPasswordField();
        txtConfirmPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Current Password");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("New Password");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Confirm Password");

        btnReset.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
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

        userList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                userListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(userList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(151, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149))
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCurrentPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtConfirmPassword, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNewPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnConfirm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(94, 94, 94))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnExit)
                            .addComponent(btnReset))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnConfirm)
                            .addComponent(btnCancel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCurrentPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        setResettingState();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        goBack();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        setInitialState();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        if (resetPassword()) {
            setInitialState();
        }
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void userListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_userListValueChanged
        if (!evt.getValueIsAdjusting()) {
            String selected = userList.getSelectedValue();
            if (selected != null) {
                btnReset.setEnabled(true);
            }
        }
    }//GEN-LAST:event_userListValueChanged

    private void setInitialState() {
        txtCurrentPassword.setEnabled(false);
        txtNewPassword.setEnabled(false);
        txtConfirmPassword.setEnabled(false);

        FormUtils.clearFields(txtCurrentPassword, txtNewPassword, txtConfirmPassword);

        btnReset.setVisible(true);
        btnExit.setVisible(true);
        btnReset.setEnabled(false);

        btnConfirm.setVisible(false);
        btnCancel.setVisible(false);

        userList.clearSelection();
    }

    private void setResettingState() {
        txtCurrentPassword.setEnabled(true);
        txtNewPassword.setEnabled(true);
        txtConfirmPassword.setEnabled(true);

        btnReset.setVisible(false);
        btnExit.setVisible(false);

        btnConfirm.setVisible(true);
        btnCancel.setVisible(true);

        txtCurrentPassword.requestFocus();
    }

    private void loadUsers() {
        listModel.clear();
        List<User> users = userService.getUsers();
        for (User user : users) {
            if (user.isActive()) {
                listModel.addElement(user.getUsername() + " - Active");
            }
        }
    }

    private boolean resetPassword() {
        String selected = userList.getSelectedValue();
        String username = selected.split(" - ")[0];

        String currentPassword = String.valueOf(txtCurrentPassword.getPassword());
        String newPassword = String.valueOf(txtNewPassword.getPassword());
        String confirmPassword = String.valueOf(txtConfirmPassword.getPassword());

        if (Validator.isEmpty(currentPassword) || Validator.isEmpty(newPassword) || Validator.isEmpty(confirmPassword)) {
            Dialog.showError(this, "All fields are required");
            return false;
        }

        if (!userService.authenticate(username, currentPassword)) {
            Dialog.showError(this, "Current password is incorrect");
            FormUtils.clearFields(txtCurrentPassword, txtNewPassword, txtConfirmPassword);
            return false;
        }

        if (!Validator.isValidPassword(newPassword)) {
            Dialog.showError(this, "Password must be at least 13 characters, include one uppercase letter and one special character");
            FormUtils.clearFields(txtNewPassword, txtConfirmPassword);
            return false;
        }

        if (!newPassword.equals(confirmPassword)) {
            Dialog.showError(this, "Passwords do not match");
            FormUtils.clearFields(txtNewPassword, txtConfirmPassword);
            return false;
        }

        if (newPassword.equals(currentPassword)) {
            Dialog.showError(this, "New password must be different from current password");
            FormUtils.clearFields(txtNewPassword, txtConfirmPassword);
            return false;
        }

        userService.updatePassword(username, newPassword);
        Dialog.showSuccess(this, "Password updated successfully");
        return true;
    }

    private void goBack() {
        new MainMenu().setVisible(true);
        this.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField txtConfirmPassword;
    private javax.swing.JPasswordField txtCurrentPassword;
    private javax.swing.JPasswordField txtNewPassword;
    private javax.swing.JList<String> userList;
    // End of variables declaration//GEN-END:variables
}
