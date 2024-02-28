package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Main extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JButton btnNewButton;
    private JButton btnNewButton_1;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Main frame = new Main();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Main() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1044, 545);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 255, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        textField = new JTextField();
        textField.setBounds(391, 198, 275, 30);
        contentPane.add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setBounds(391, 262, 275, 30);
        contentPane.add(textField_1);
        textField_1.setColumns(10);

        btnNewButton = new JButton("Sign in");
        btnNewButton.setForeground(new Color(255, 255, 255));
        btnNewButton.setBackground(new Color(255, 0, 128));
        btnNewButton.setBounds(476, 302, 85, 21);
        contentPane.add(btnNewButton);

        JTextPane txtpnWelcome = new JTextPane();
        txtpnWelcome.setFont(new Font("Arial", Font.BOLD, 20));
        txtpnWelcome.setFocusable(false);
        txtpnWelcome.setText("         SalesPro Retailers");
        txtpnWelcome.setBounds(374, 116, 275, 30);
        contentPane.add(txtpnWelcome);

        JTextPane txtpnUsernameemail = new JTextPane();
        txtpnUsernameemail.setFocusable(false);
        txtpnUsernameemail.setText("Username/Email");
        txtpnUsernameemail.setBounds(482, 178, 100, 19);
        contentPane.add(txtpnUsernameemail);

        btnNewButton_1 = new JButton("Create Account");
        btnNewButton_1.addActionListener(this);
        btnNewButton_1.setBounds(455, 343, 141, 21);
        contentPane.add(btnNewButton_1);

        JTextPane txtpnPassword = new JTextPane();
        txtpnPassword.setFocusable(false);
        txtpnPassword.setText("Password");
        txtpnPassword.setBounds(488, 244, 73, 19);
        contentPane.add(txtpnPassword);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnNewButton_1) {
            CreateAccount createAccount = new CreateAccount();
            createAccount.showFrame(); // Add this line to show the CreateAccount window
            this.dispose(); // Close the current sign-in window if needed
        }
    }
}