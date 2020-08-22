package ch.joelschaller.windows.loginWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginWindow extends JFrame{

    private static ImageIcon icon;
    private static JButton loginButton;
    private static JComboBox usernameCombobox;
    private static JPasswordField passwordField;
    private static JLabel label;

    public LoginWindow(String title) {
        super(title);
        create();
    }

    public void create() {

        icon = new ImageIcon("icon.png");
        loginButton = new JButton("Login");
        usernameCombobox = new JComboBox();
        passwordField = new JPasswordField();
        label = new JLabel("AdminPanel");

        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 450);
        setIconImage(icon.getImage());
        setResizable(false);

        usernameCombobox.setSize(200, 50);
        usernameCombobox.setLocation(100, 150);
        usernameCombobox.setFont(new Font("loginFont", Font.PLAIN, 30));
        usernameCombobox.addItem("none");
        usernameCombobox.addItem("Joel");

        passwordField.setSize(200, 50);
        passwordField.setLocation(100, 220);
        passwordField.setFont(new Font("loginFont", Font.PLAIN, 30));

        loginButton.setSize(200, 50);
        loginButton.setLocation(100, 320);
        loginButton.setFont(new Font("loginFont", Font.PLAIN, 30));

        label.setSize(500, 50);
        label.setLocation(25, 40);
        label.setFont(new Font("", Font.BOLD, 60));

        add(loginButton);
        add(usernameCombobox);
        add(passwordField);
        add(label);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login();
            }
        });
    }

    private void login() {
        if (usernameCombobox.getSelectedItem().toString().equals("Joel") && passwordField.getText().equals("Buck-2017!")) {
            JOptionPane.showMessageDialog(this, "Sucessfully logged in!");
        }   else if (usernameCombobox.getSelectedItem().toString().equals("none")) {
            JOptionPane.showMessageDialog(this, "Please select a User!");
        } else {
            JOptionPane.showMessageDialog(this, "Invalid Password!");
        }
    }
}