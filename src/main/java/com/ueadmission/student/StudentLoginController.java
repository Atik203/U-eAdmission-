package com.ueadmission.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import javax.swing.JOptionPane;

public class StudentLoginController {

    @FXML
    private Button btnok;

    @FXML
    private PasswordField txtpass;

    @FXML
    private TextField txtuname;

    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    @FXML
    void login(ActionEvent event) {
        String uname = txtuname.getText();
        String pass = txtpass.getText();

        if (uname.equals("") || pass.equals("")) {
            JOptionPane.showMessageDialog(null, "Username or Password is blank");
            return;
        }

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/your_database_name", "your_username", "your_password");

            pst = con.prepareStatement("SELECT * FROM student WHERE username = ? AND password = ?");
            pst.setString(1, uname);
            pst.setString(2, pass);

            rs = pst.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Login Successful!");
                // Proceed to the dashboard or next scene
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect Username or Password");
            }

        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database Error: " + ex.getMessage());
        }
    }
}
