package project_final;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.EventQueue;

public class LoginPage extends JFrame implements ActionListener {
    private JLabel username;
    private JLabel password;
    private JTextField user_input;
    private JButton Login;
    private JPasswordField password_input;
    private JFrame frame;

    public LoginPage() {
        frame = new JFrame();
        username = new JLabel("Username : ");
        password = new JLabel("Password : ");
        Login = new JButton();
        user_input = new JTextField();
        password_input = new JPasswordField();
        user_input.setBounds(410, 105, 300, 40);
        password_input.setBounds(410, 155, 300, 40);
        Login.setBounds(400, 250, 200, 50);
        Login.setText("LOGIN");
        username.setBounds(300, 100, 150, 50);
        username.setFont(new Font("Agency FB", Font.BOLD, 26));
        password.setBounds(300, 150, 150, 50);
        password.setFont(new Font("Agency FB", Font.BOLD, 26));
        frame.add(user_input);
        frame.add(password_input);
        frame.add(password);
        frame.add(username);
        frame.add(Login);
        frame.setLayout(null);
        frame.setTitle("Final Project");
        frame.setSize(1000, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Login.addActionListener((ActionListener)this);
    }
    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        if (e.getSource() == Login) {
            new menuPage();
            frame.setVisible(false);
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable(){
            public void run() {
                LoginPage form = new LoginPage();
                form.frame.setVisible(true);
            }
        });
    }
}
