package project_final;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class confirm_order implements ActionListener{
    int i = 0;
    private JButton back,m;
    private JFrame n;
    private JLabel[] list;
    private JLabel[] price;

    public confirm_order(int count) {
        n = new JFrame();
        m = new JButton("Confirm");
        m.addActionListener(this);
        back = new JButton("Back");
        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();
        JLabel label = new JLabel("Your Selected Picture", JLabel.CENTER);
        JLabel label2 = new JLabel("Order Details");
        JLabel label3 = new JLabel("Product Name");
        JLabel label4 = new JLabel("Price");
        JPanel order_detail = new JPanel();
        JPanel order_detail2 = new JPanel();
        JLabel total = new JLabel("Total : "+menuPage.price()+" THB");
        total.setFont(new Font("Agency FB", Font.BOLD, 40));
        total.setBounds(600,750,1000,200);
        panel2.setLayout(null);
        order_detail2.setLayout(null);
        order_detail2.setBounds(0, 210, 1000, 40);
        order_detail2.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.black));
        order_detail.setLayout(null);
        order_detail.setBounds(0, 0, 1000, 200);
        order_detail.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.black));
        label3.setBounds(50, 0, 300, 30);
        label3.setFont(new Font("Agency FB", Font.BOLD, 30));
        label4.setBounds(800, 0, 300, 30);
        label4.setFont(new Font("Agency FB", Font.BOLD, 30));
        label2.setFont(new Font("Agency FB", Font.BOLD, 50));
        label2.setBounds(50,50,500,200);
        label.setFont(new Font("Agency FB", Font.BOLD, 30));
        m.setBounds(450, 900, 100, 50);
        back.setBounds(10, 10, 100, 50);
        back.addActionListener(this);
        n.setLayout(new GridLayout(1, 1));
        System.out.println(menuPage.price());
        list = new JLabel[count];
        price = new JLabel[count];
        for (int j = 0; j < count; j++) {

            panel.setLayout(new GridLayout(count, 2, 0, 50));
            menuPage.pass(count)[j] = new JLabel();
            menuPage.pass(count)[j].setBounds(0, 20, 200, 200);
            menuPage.pass_Name(count)[j] = new JLabel();
            menuPage.pass_Name(count)[j].setBounds(500, 0, 500, 500);

            panel.add(menuPage.pass(count)[j]);
            panel.add(menuPage.pass_Name(count)[j]);
            list[j] = new JLabel(menuPage.pass_name_pic(count)[j]);
            list[j].setFont(new Font("Agency FB", Font.PLAIN, 40));
            list[j].setBounds(50, (j + 1) * 60, 200, 450);
            price[j] = new JLabel(menuPage.pass_price_pic(count)[j]);
            price[j].setFont(new Font("Agency FB", Font.PLAIN, 40));
            price[j].setBounds(800, (j + 1) * 60, 200, 450);

            panel2.add(list[j]);
            panel2.add(price[j]);
        }
        order_detail2.add(label3);
        order_detail2.add(label4);
        order_detail.add(label2);
        panel2.add(total);
        panel2.add(order_detail2);
        panel2.add(order_detail);
        panel2.add(m);
        panel2.add(back);
        JScrollPane src = new JScrollPane(panel);
        src.setColumnHeaderView(label);
        n.add(src);
        n.add(panel2);
        n.setExtendedState(JFrame.MAXIMIZED_BOTH);
        n.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        n.setVisible(true);
    }
    
    public void actionPerformed(java.awt.event.ActionEvent e) {
        if (e.getSource() == back) {
            new menuPage();
            n.setVisible(false);

        }
        if (e.getSource() == m) {
            new powerbuy();
        }
    }
}
