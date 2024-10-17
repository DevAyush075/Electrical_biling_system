package electricity.biling.system.splash;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Login extends JFrame {
    JTextField userText, userpass;
    Choice loginChoice;

    JButton loginButton, cancelButton, signupButton;

    Login() {
        super("Login");

        // Label for username
        JLabel username = new JLabel("UserName");
        username.setBounds(300, 68, 100, 20);
        add(username);

        // Text field for username
        userText = new JTextField("Enter username");
        userText.setBounds(400, 68, 150, 20);
        addPlaceholder(userText, "Enter username");
        add(userText);

        // Label for password
        JLabel password = new JLabel("Password");
        password.setBounds(300, 100, 100, 20);
        add(password);

        // Text field for password
        userpass = new JTextField("Enter password");
        userpass.setBounds(400, 100, 150, 20);
        addPlaceholder(userpass, "Enter password");
        add(userpass);

        // Label for login choice
        JLabel login = new JLabel("Login In AS");
        login.setBounds(300, 148, 100, 20);
        add(login);

        // Choice for login type
        loginChoice = new Choice();
        loginChoice.add("ADMIN");
        loginChoice.add("CUSTOMER");
        loginChoice.setBounds(400, 148, 150, 20);
        add(loginChoice);

        // Login button
        loginButton = new JButton("Login");
        loginButton.setBounds(330, 180, 100, 20);
        add(loginButton);

        // Cancel Button
        cancelButton = new JButton("Cancel");
        cancelButton.setBounds(460, 180, 100, 20);
        add(cancelButton);

        // Signup Button
        signupButton = new JButton("Signup");
        signupButton.setBounds(395, 210, 100, 20);
        add(signupButton);

        // Profile image
        String imagePath = "C:/Users/Ayush/Desktop/electric biling system/electric biling system/src/splash/profile.jpg";
        ImageIcon profileIcon = new ImageIcon(imagePath); // Load image
        if (profileIcon.getImageLoadStatus() == MediaTracker.COMPLETE) {
            Image profileImg = profileIcon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
            ImageIcon scaledProfileIcon = new ImageIcon(profileImg);
            JLabel profileLabel = new JLabel(scaledProfileIcon);
            profileLabel.setBounds(0, 0, 100, 100); // Set position and size for the profile image
            add(profileLabel);
        } else {
            System.out.println("Error: Image not loaded from path: " + imagePath);
        }

        // Set frame properties
        setSize(640, 300);
        setLocation(400, 200);
        setLayout(null); // Using null layout for absolute positioning
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void addPlaceholder(JTextField textField, String placeholderText) {
        textField.setForeground(Color.GRAY); // Set placeholder color
        textField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // Remove placeholder text when focus is gained
                if (textField.getText().equals(placeholderText)) {
                    textField.setText("");
                    textField.setForeground(Color.BLACK); // Set normal text color
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                // If the text field is empty, restore the placeholder
                if (textField.getText().isEmpty()) {
                    textField.setForeground(Color.GRAY);
                    textField.setText(placeholderText);
                }
            }
        });
    }

    public static void main(String[] args) {
        new Login();
    }
}
