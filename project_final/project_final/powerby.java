package project_final;
import javax.swing.*;
import java.awt.*;
public class powerby {
    public powerby() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton button = new JButton("QR CODE");
        JButton button2 = new JButton("PromptPay");
        JLabel label = new JLabel("-------ชำระเงินด้วย-------");
        frame.setSize(600, 600);
        frame.setLayout(new GridLayout());
        label.setBounds(250, 0, 1000, 100);
        panel.setLayout(null);
        button.setBounds(0, 150, 150, 100);
        button2.setBounds(200, 150, 150, 100);
        panel.add(label);
        panel.add(button);
        panel.add(button2);
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new powerby();

    }
}