package project_final;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class menuPage implements ActionListener {
    public JFrame frame;
    private JPanel panel1, panel2, panel3, panel4, panel5, panel6;
    public JCheckBox item1, item2, item3, item4, item5, item6;
    private JButton order,zoomin,zoomin2,zoomin3,zoomin4,zoomin5,zoomin6;
    public static JLabel picture, picture2, picture3, picture4, picture5, picture6;
    public static JLabel[] send, send_Name;
    public static String[] send_name_pic;
    public static String[] send_price_item;
    public static JLabel name1, name2, name3, name4, name5, name6;
    public static float amount = 0;
    // private 
    public menuPage() {
        picture = new JLabel(resizeIMG(new ImageIcon("astronaut-galaxy-space-suit-dream-triangle-butterflies-1920x1080-8085.jpg")));
        picture2 = new JLabel(resizeIMG(new ImageIcon("astronaut-nasa-flower-garden-butterflies-surreal-moon-1920x1080-3197.jpg")));
        picture3 = new JLabel(resizeIMG(new ImageIcon("astronaut-nebula-clouds-space-travel-space-adventure-1920x1080-897.jpg")));
        picture4 = new JLabel(resizeIMG(new ImageIcon("astronaut-space-suit-dark-background-lost-in-space-space-1920x1080-2460.jpg")));
        picture5 = new JLabel(resizeIMG(new ImageIcon("astronaut-spacesuit-black-background-amoled-sci-fi-1920x1080-7632.png")));
        picture6 = new JLabel(resizeIMG(new ImageIcon("ghost-skull-astronaut-spacesuit-death-horror-outer-space-1920x1080-7681 (1).jpg")));
        name1 = new JLabel("picture1(50THB)", SwingConstants.CENTER);
        name2 = new JLabel("picture2,20THB", SwingConstants.CENTER);
        name3 = new JLabel("picture3,30THB", SwingConstants.CENTER);
        name4 = new JLabel("picture4,40THB", SwingConstants.CENTER);
        name5 = new JLabel("picture5,50THB", SwingConstants.CENTER);
        name6 = new JLabel("picture6,60THB",SwingConstants.CENTER);
        Font myfont = new Font("Agency FB",Font.BOLD,25);
        frame = new JFrame();
        order = new JButton();
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel5 = new JPanel();
        panel4 = new JPanel();
        panel6 = new JPanel();
        item1 = new JCheckBox();
        item2 = new JCheckBox();
        item3 = new JCheckBox();
        item4 = new JCheckBox();
        item5 = new JCheckBox();
        item6 = new JCheckBox();
        Icon zoomicon = resizeIMGsmall(new ImageIcon("61442.png"));
        zoomin = new JButton(zoomicon);
        zoomin.setBounds(198, 198, 27, 27);
        zoomin.setBackground(null);
        zoomin.addActionListener(this);

        zoomin2 = new JButton(zoomicon);
        zoomin2.setBounds(198, 198, 27, 27);
        zoomin2.setBackground(null);
        zoomin2.addActionListener(this);

        zoomin3 = new JButton(zoomicon);
        zoomin3.setBounds(198, 198, 27, 27);
        zoomin3.setBackground(null);
        zoomin3.addActionListener(this);

        zoomin4 = new JButton(zoomicon);
        zoomin4.setBounds(198, 198, 27, 27);
        zoomin4.setBackground(null);
        zoomin4.addActionListener(this);

        zoomin5 = new JButton(zoomicon);
        zoomin5.setBounds(198, 198, 27, 27);
        zoomin5.setBackground(null);
        zoomin5.addActionListener(this);

        zoomin6 = new JButton(zoomicon);
        zoomin6.setBounds(198, 198, 27, 27);
        zoomin6.setBackground(null);
        zoomin6.addActionListener(this);
        order.setBounds(351, 650, 100, 50);
        order.setText("Order");
        order.addActionListener(this);

        picture.setBounds(25, 0, 200, 195);
        name1.setBounds(20, 230, 200, 40);
        name1.setFont(myfont);
        name1.setOpaque(false);
        item1.setBounds(115, 200, 50, 30);
        item1.setBackground(null);
        panel1.setLayout(null);
        panel1.setBounds(10, 10, 250, 290);
        panel1.setBackground(null);
        panel1.add(zoomin);
        panel1.add(item1);
        panel1.add(name1);
        panel1.add(picture);
        frame.add(panel1);

        item2.setBounds(115, 195, 50, 30);
        item2.setBackground(null);
        picture2.setBounds(25, 0, 200, 195);
        name2.setBounds(20, 230, 200, 40);
        name2.setFont(myfont);
        panel2.add(name2);
        panel2.setLayout(null);
        panel2.setBackground(null);
        panel2.setBounds(270, 10, 250, 290);
        panel2.add(picture2);
        panel2.add(zoomin2);
        panel2.add(item2);
        frame.add(panel2);

        item3.setBounds(115, 195, 50, 30);
        item3.setBackground(null);
        name3.setBounds(20, 230, 200, 40);
        name3.setFont(myfont);
        panel3.add(name3);
        picture3.setBounds(25,0,200,195);
        panel3.setBounds(530, 10, 250, 290);
        panel3.setLayout(null);
        panel3.setBackground(null);
        panel3.add(picture3);
        panel3.add(zoomin3);
        panel3.add(item3);
        frame.add(panel3);

        item4.setBounds(115, 195, 50, 30);
        picture4.setBounds(25, 0, 200, 195);
        item4.setBackground(null);
        name4.setBounds(20, 230, 200, 40);
        name4.setFont(myfont);
        panel4.add(name4);
        panel4.setLayout(null);
        panel4.add(picture4);
        panel4.add(zoomin4);
        panel4.setBounds(10, 350, 250, 290);
        panel4.setBackground(null);
        panel4.add(item4);

        item5.setBounds(120, 195, 50, 30);
        picture5.setBounds(25, 0, 200, 195);
        panel5.add(picture5);
        name5.setBounds(20, 230, 200, 40);
        name5.setFont(myfont);
        panel5.add(name5);
        panel5.add(zoomin5);
        item5.setBackground(null);
        panel5.setLayout(null);
        panel5.setBounds(270, 350, 250, 290);
        panel5.setBackground(null);
        panel5.add(item5);

        item6.setBounds(115, 195, 50, 30);
        picture6.setBounds(25, 0, 200, 195);
        name6.setBounds(20, 230, 200, 40);
        name6.setFont(myfont);
        panel6.add(name6);
        item6.setBackground(null);
        panel6.setLayout(null);
        panel6.setBounds(530, 350, 250, 290);
        panel6.setBackground(null);
        panel6.add(item6);
        panel6.add(zoomin6);
        panel6.add(picture6);

        frame.add(panel4);
        frame.add(panel5);
        frame.add(panel6);
        frame.add(order);
        frame.setTitle("Product");
        frame.setSize(810, 800);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private ImageIcon resizeIMG(ImageIcon e) {
        Image r = e.getImage();
        Image resize = r.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH);
        ImageIcon reimgae = new ImageIcon(resize);
        return reimgae;
    }
    private ImageIcon resizeIMGsmall(ImageIcon e) {
        Image r = e.getImage();
        Image resize = r.getScaledInstance(25, 25, java.awt.Image.SCALE_SMOOTH);
        ImageIcon reimgae = new ImageIcon(resize);
        return reimgae;
    }
    
    public void actionPerformed(java.awt.event.ActionEvent e) {
        ArrayList<JLabel> list = new ArrayList<JLabel>();
        ArrayList<JLabel> name = new ArrayList<JLabel>();
        ArrayList<String> name_pic = new ArrayList<String>();
        ArrayList<String> price_item = new ArrayList<String>(); 
        if (e.getSource() == order) {
            int count = 0;
            amount = 0;
            if (item1.isSelected()) {
                list.add(picture);
                name.add(name1);
                name_pic.add("picture1");
                price_item.add("50");
                System.out.println();
                amount += 50;
                count++;
                //new test(/*pass(picture)*/);
            }
            if (item2.isSelected()) {
                // send[1] = picture2;
                list.add(picture2);
                name.add(name2);
                name_pic.add("picture2");
                amount += 20;
                price_item.add("20");
                System.out.println("Select 2");
                count++;
                //new test(/*pass(picture2)*/);
            }
            if (item3.isSelected()) {
                // send[2] = picture3;
                list.add(picture3);
                name.add(name3);
                name_pic.add("picture3");
                price_item.add("30");
                amount += 30;
                System.out.println("Select 3");
                count++;
                //new test(/*pass(picture3)*/);
            }
            if (item4.isSelected()) {
                list.add(picture4);
                name.add(name4);
                name_pic.add("picture4");
                price_item.add("40");
                amount += 40;
                // send[3] = picture4;
                System.out.println("Select 4");
                count++;
                //new test(/*pass(picture4)*/);
            }
            if (item5.isSelected()) {
                list.add(picture5);
                name.add(name5);
                name_pic.add("picture5");
                price_item.add("50");
                amount += 50;
                // send[4] = picture5;
                System.out.println("Select 5");
                count++;
                //new test(/*pass(send[4])*/);
            }
            if (item6.isSelected()) {
                list.add(picture6);
                name.add(name6);
                name_pic.add("picture6");
                price_item.add("60");
                amount += 60;
                // send[5] = picture6;
                System.out.println();
                count++;
                //new test(/*pass(picture6)*/);
            }
            // send = new JLabel[count];
            // System.out.println(list);
            if (item1.isSelected() == false && item2.isSelected() == false && item3.isSelected() == false && item4.isSelected() == false && item5.isSelected() == false && item6.isSelected() == false) {
                JOptionPane.showMessageDialog(null, "You not choose a picture", "Picture not Choose", JOptionPane.ERROR_MESSAGE);
            } else {
                price();
                send_price_item = new String[price_item.size()];
                send_price_item = price_item.toArray(send_price_item);
                send = new JLabel[list.size()];
                send = list.toArray(send);
                send_Name = new JLabel[name.size()];
                send_Name = name.toArray(send_Name);
                send_name_pic = new String[name_pic.size()];
                send_name_pic = name_pic.toArray(send_name_pic);
                // JOptionPane.showMessageDialog(frame, "สวัสดี", null, count);
                new confirm_order(count);
                // System.out.println();
                frame.setVisible(false);
            }

        }
        if (e.getSource() == zoomin) {
            JFrame showpic = new JFrame();
            JLabel pic = new JLabel(
                    new ImageIcon("astronaut-galaxy-space-suit-dream-triangle-butterflies-1920x1080-8085.jpg"));
            showpic.add(pic);
            showpic.setSize(1000, 1000);
            showpic.setVisible(true);
        }
        if (e.getSource() == zoomin2) {
            JFrame showpic = new JFrame();
            JLabel pic = new JLabel(
                    new ImageIcon("astronaut-nasa-flower-garden-butterflies-surreal-moon-1920x1080-3197.jpg"));
            showpic.add(pic);
            showpic.setSize(1000, 1000);
            showpic.setVisible(true);
        }
        if (e.getSource() == zoomin3) {
            JFrame showpic = new JFrame();
            JLabel pic = new JLabel(
                    new ImageIcon("astronaut-nebula-clouds-space-travel-space-adventure-1920x1080-897.jpg"));
            showpic.add(pic);
            showpic.setSize(1000, 1000);
            showpic.setVisible(true);
        }
        if (e.getSource() == zoomin4) {
            JFrame showpic = new JFrame();
            JLabel pic = new JLabel(
                    new ImageIcon("astronaut-space-suit-dark-background-lost-in-space-space-1920x1080-2460.jpg"));
            showpic.add(pic);
            showpic.setSize(1000, 1000);
            showpic.setVisible(true);
        }
        if (e.getSource() == zoomin5) {
            JFrame showpic = new JFrame();
            JLabel pic = new JLabel(
                    new ImageIcon("astronaut-spacesuit-black-background-amoled-sci-fi-1920x1080-7632.png"));
            showpic.add(pic);
            showpic.setSize(1000, 1000);
            showpic.setVisible(true);
        }
        if (e.getSource() == zoomin6) {
            JFrame showpic = new JFrame();
            JLabel pic = new JLabel(
                    new ImageIcon("ghost-skull-astronaut-spacesuit-death-horror-outer-space-1920x1080-7681 (1).jpg"));
            showpic.add(pic);
            showpic.setSize(1000, 1000);
            showpic.setVisible(true);
        }
    }

    public static JLabel[] pass(int c) {
        JLabel[] s = new JLabel[c];
        for (int i = 0; i < c; i++) {
            s[i] = send[i];
        }
        return s;
    }

    public static JLabel[] pass_Name(int x) {
        JLabel[] sn = new JLabel[x];
        for (int i = 0; i < x; i++) {
            sn[i] = send_Name[i];
        }
        return sn;
    }

    public static String[] pass_name_pic(int x) {
        String[] snp = new String[x];
        for (int i = 0; i < x; i++) {
            snp[i] = send_name_pic[i];
        }
        return snp;
    }
    public static String[] pass_price_pic(int x) {
        String[] spp = new String[x];
        for (int i = 0; i < x; i++) {
            spp[i] = send_price_item[i];
        }
        return spp;
    }

    public static String price() {
        String s = Float.toString(amount);
        return s;
    }
}
