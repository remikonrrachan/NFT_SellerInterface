package project_final;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.Color;

public class powerbuy implements ActionListener {
    private JButton button, button2;

    public powerbuy() {
        JFrame frame = new JFrame(); // frame สร้างเฟรม เฟรมคือคือหน้าต่าง
        JPanel panel = new JPanel(); // panel สร้างพาเนล พาเนลก้เหมือนกระดานที่ใส่ข้อมูลเข้าไป
        button = new JButton("QR CODE"); // button ปุ่มที่ 1
        button2 = new JButton("PromptPay"); // button ปุ่ม 2
        JLabel label = new JLabel("**********   ชำระเงินด้วย   **********"); // label ข้อความ
        frame.setSize(800, 500); // set ขนาดของเฟรม
        frame.setLayout(new GridLayout());
        label.setBounds(280, 50, 1000, 100);
        panel.setLayout(null);
        button.setBounds(150, 200, 150, 100); // set ตำเเหน่งของปุ่ม 1
        button2.setBounds(450, 200, 150, 100); // set ตำเเหน่งของปุ่ม 2
        panel.setLayout(null);
        frame.setVisible(true); // การมองเห็นของ frame
        panel.setBackground(Color.GREEN);

        // add ขอมูลเข้าไป
        panel.add(label);
        panel.add(button);
        panel.add(button2);
        frame.add(panel);
        button.addActionListener(this);
        button2.addActionListener(this);
    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        if (e.getSource() == button) {
            JFrame frame = new JFrame();
            JLabel pic = new JLabel(new ImageIcon("qr-code1.png"));
            frame.setLayout(new GridLayout());
            frame.add(pic);
            frame.setSize(600, 600);
            frame.setVisible(true);
        }
        if (e.getSource() == button2) {
            JFrame frame = new JFrame();
            JLabel text = new JLabel(("0692758852 SCB"));
            JLabel text2 = new JLabel(("0992546873 K-bank"));
            frame.setLayout(null);
            frame.add(text);
            frame.add(text2);
            frame.setSize(600, 500);
            text.setBounds(150, 30, 300, 300);
            text.setFont(new Font("Angsana New", Font.BOLD, 50));
            text2.setBounds(150, 100, 300, 300);
            text2.setFont(new Font("Angsana New", Font.BOLD, 50));
            frame.setVisible(true);
            
        }
    }
}