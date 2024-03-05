package test;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import javax.annotation.processing.FilerException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextPane;
import javax.swing.JTextField;

public class CreateAccount {

    private JFrame frame;
    private JTextField userTxtField;
    private JPasswordField passwordField;
    private JPasswordField passwordField_1;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CreateAccount window = new CreateAccount();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public CreateAccount() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(255, 255, 255));
        frame.setBounds(100, 100, 1063, 529);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JTextPane txtpnCreateAnAccount = new JTextPane();
        txtpnCreateAnAccount.setFont(new Font("Arial", Font.BOLD, 22));
        txtpnCreateAnAccount.setText("     Create an Account");
        txtpnCreateAnAccount.setBounds(399, 76, 253, 38);
        txtpnCreateAnAccount.setFocusable(false);
        frame.getContentPane().add(txtpnCreateAnAccount);

        userTxtField = new JTextField();
        userTxtField.setBounds(435, 154, 195, 19);
        frame.getContentPane().add(userTxtField);
        userTxtField.setColumns(10);

        JTextPane txtpnUsernameemail = new JTextPane();
        txtpnUsernameemail.setText("Username/Email");
        txtpnUsernameemail.setBounds(435, 135, 101, 19);
        txtpnUsernameemail.setFocusable(false);
        frame.getContentPane().add(txtpnUsernameemail);

        passwordField = new JPasswordField();
        passwordField.setBounds(435, 202, 195, 19);
        frame.getContentPane().add(passwordField);

        JTextPane txtpnPassword = new JTextPane();
        txtpnPassword.setText("Password");
        txtpnPassword.setBounds(435, 183, 83, 19);
        txtpnPassword.setFocusable(false);
        frame.getContentPane().add(txtpnPassword);

        passwordField_1 = new JPasswordField();
        passwordField_1.setBounds(435, 247, 195, 19);
        frame.getContentPane().add(passwordField_1);

        JTextPane txtpnRepeatPassword = new JTextPane();
        txtpnRepeatPassword.setText("Repeat Password");
        txtpnRepeatPassword.setBounds(435, 228, 126, 19);
        txtpnRepeatPassword.setFocusable(false);
        frame.getContentPane().add(txtpnRepeatPassword);

        JButton btnNewButton = new JButton("Create Account");
        btnNewButton.setBounds(458, 296, 133, 21);
        frame.getContentPane().add(btnNewButton);

        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                createAccount();
            }
        });
    }

    private void createAccount() {
        String username = userTxtField.getText();
        String password = new String(passwordField.getPassword());
        String repeatPassword = new String(passwordField_1.getPassword());

        try {
            File accList = new File("accounts.txt");
            Scanner sc = new Scanner(accList);
            ArrayList<String> userList = new ArrayList<String>();
            ArrayList<String> passList = new ArrayList<String>();

            while (sc.hasNextLine()) {
                String currLine = sc.nextLine();
                String[] split = currLine.split(",", 2);
                for (String a : split) {
                    userList.add(a);
                    passList.add(a);
                }

                System.out.println(currLine + " | has been added.");
            }
            
            System.out.println(userList);
            System.out.println(passList);

            
            if (username.isEmpty() || password.isEmpty()){
                System.out.println("Username or Password cannot be empty!");
                return;
            } else if (userList.contains(username)) {
                System.out.println("Username already taken!");
                return;
            } 
            else if (!password.equals(repeatPassword)) {
                System.out.println("Passwords do not match. Please try again.");
                return;
            } else {
                try (PrintWriter writer = new PrintWriter(new FileWriter("accounts.txt", true))) {
                    writer.println(username + "," + password);                                                          // Store the account in a text file
                    System.out.println("Account created successfully.");
                } catch (IOException ex) {
                    ex.printStackTrace();
                    System.out.println("Error creating account. Please try again.");
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
        }


    }

    public void showFrame() {
        frame.setVisible(true);
    }
}
