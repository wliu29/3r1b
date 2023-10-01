import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    public static void main(String[] args) {
        Icon donut = new ImageIcon("\\hackathon\\hack1\\src\\donut.png");
        Icon travisScottMeal = new ImageIcon("\\hackathon\\hack1\\src\\trscmeal.png");
        Icon pizza = new ImageIcon("\\hackathon\\hack1\\src\\pizza.png");
        Icon twinkie = new ImageIcon("\\hackathon\\hack1\\src\\twinkie.png");
        Icon banana = new ImageIcon("\\hackathon\\hack1\\src\\banana.png");
        Icon redBeanRice = new ImageIcon("\\hackathon\\hack1\\src\\rbr.png");
        Icon grillCKBreast = new ImageIcon("\\hackathon\\hack1\\src\\grilledCKBreast.png");
        Icon caesarSalad = new ImageIcon("\\hackathon\\hack1\\src\\caesarSalad.png");
        JButton title = new JButton("<html>" + "Nutrition Education Interactive Application" + "</html>");
        title.setFont(new Font("Times New Roman", Font.BOLD, 25));
        title.setBackground(Color.CYAN);
        JButton direction = new JButton(
                "<html>" + "Click on each image to learn more about its nutritional benefits!" + "</html>");
        direction.setFont(new Font("Times New Roman", Font.BOLD, 25));
        direction.setBackground(Color.CYAN);


        JButton button1 = new JButton();
        button1.setBackground(Color.PINK);
        button1.setIcon(donut);
        button1.setText("Donut");
        button1.setFont(new Font("Times New Roman", Font.BOLD, 25));
        button1.setHorizontalTextPosition(SwingConstants.CENTER);
        button1.setVerticalTextPosition(SwingConstants.BOTTOM);
        // testing button1
        JFrame f1 = new JFrame("Donut Info");
        JLabel l1 = new JLabel();
        Icon donutinfo = new ImageIcon("\\hackathon\\hack1\\src\\donutinfo.png");
        l1.setIcon(donutinfo);
        JPanel p1 = new JPanel();
        p1.add(l1);
        f1.add(p1);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // open a new frame i.e window
                f1.pack();
                f1.setLocationRelativeTo(null);
                f1.setVisible(true);
            }
        });

        JButton button2 = new JButton();
        button2.setBackground(Color.BLUE);
        button2.setIcon(travisScottMeal);
        button2.setText("Travis Scott Meal");
        button2.setFont(new Font("Times New Roman", Font.BOLD, 17));
        button2.setHorizontalTextPosition(SwingConstants.CENTER);
        button2.setVerticalTextPosition(SwingConstants.BOTTOM);
        JFrame f2 = new JFrame("Travis Scott Meal Info");
        JLabel l2 = new JLabel();
        Icon trscminfo = new ImageIcon("\\hackathon\\hack1\\src\\trscmealinfo.png");
        l2.setIcon(trscminfo);
        JPanel p2 = new JPanel();
        p2.add(l2);
        f2.add(p2);
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // open a new frame i.e window
                f2.pack();
                f2.setLocationRelativeTo(null);
                f2.setVisible(true);
            }
        });

        JButton button3 = new JButton();
        button3.setBackground(Color.MAGENTA);
        button3.setIcon(pizza);
        button3.setText("Pizza");
        button3.setFont(new Font("Times New Roman", Font.BOLD, 25));
        button3.setHorizontalTextPosition(SwingConstants.CENTER);
        button3.setVerticalTextPosition(SwingConstants.BOTTOM);
        JFrame f3 = new JFrame("Pizza Info");
        JLabel l3 = new JLabel();
        Icon pizzainfo = new ImageIcon("\\hackathon\\hack1\\src\\pizzainfo.png");
        l3.setIcon(pizzainfo);
        JPanel p3 = new JPanel();
        p3.add(l3);
        f3.add(p3);
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // open a new frame i.e window
                f3.pack();
                f3.setLocationRelativeTo(null);
                f3.setVisible(true);
            }
        });

        JButton button4 = new JButton();
        button4.setBackground(Color.WHITE);
        button4.setIcon(twinkie);
        button4.setText("Twinkie");
        button4.setFont(new Font("Times New Roman", Font.BOLD, 25));
        button4.setHorizontalTextPosition(SwingConstants.CENTER);
        button4.setVerticalTextPosition(SwingConstants.BOTTOM);
        JFrame f4 = new JFrame("Twinkie Info");
        JLabel l4 = new JLabel();
        Icon twinkiesinfo = new ImageIcon("\\hackathon\\hack1\\src\\twinkiesinfo.jpg");
        l4.setIcon(twinkiesinfo);
        JPanel p4 = new JPanel();
        p4.add(l4);
        f4.add(p4);
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // open a new frame i.e window
                f4.pack();
                f4.setLocationRelativeTo(null);
                f4.setVisible(true);
            }
        });

        JButton button5 = new JButton();
        button5.setBackground(Color.YELLOW);
        button5.setIcon(banana);
        button5.setText("Banana");
        button5.setFont(new Font("Times New Roman", Font.BOLD, 25));
        button5.setHorizontalTextPosition(SwingConstants.CENTER);
        button5.setVerticalTextPosition(SwingConstants.BOTTOM);
        JFrame f5 = new JFrame("Banana Info");
        JLabel l5 = new JLabel();
        Icon bananainfo = new ImageIcon("\\hackathon\\hack1\\src\\bananainfo.jpg");
        l5.setIcon(bananainfo);
        JPanel p5 = new JPanel();
        p5.add(l5);
        f5.add(p5);
        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // open a new frame i.e window
                f5.pack();
                f5.setLocationRelativeTo(null);
                f5.setVisible(true);
            }
        });

        JButton button6 = new JButton();
        button6.setBackground(Color.RED);
        button6.setIcon(redBeanRice);
        button6.setText("Red Beans and Rice");
        button6.setFont(new Font("Times New Roman", Font.BOLD, 17));
        button6.setHorizontalTextPosition(SwingConstants.CENTER);
        button6.setVerticalTextPosition(SwingConstants.BOTTOM);
        JFrame f6 = new JFrame("Red Beans and Rice Info");
        JLabel l6 = new JLabel();
        Icon rbrinfo = new ImageIcon("\\hackathon\\hack1\\src\\rbrinfo.jpg");
        l6.setIcon(rbrinfo);
        JPanel p6 = new JPanel();
        p6.add(l6);
        f6.add(p6);
        button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // open a new frame i.e window
                f6.pack();
                f6.setLocationRelativeTo(null);
                f6.setVisible(true);
            }
        });

        JButton button7 = new JButton();
        button7.setBackground(Color.ORANGE);
        button7.setIcon(grillCKBreast);
        button7.setText("Grilled Chicken Breast");
        button7.setFont(new Font("Times New Roman", Font.BOLD, 15));
        button7.setHorizontalTextPosition(SwingConstants.CENTER);
        button7.setVerticalTextPosition(SwingConstants.BOTTOM);
        JFrame f7 = new JFrame("Grilled Chicken Breast Info");
        JLabel l7 = new JLabel();
        Icon gckbinfo = new ImageIcon("\\hackathon\\hack1\\src\\gckbinfo.jpg");
        l7.setIcon(gckbinfo);
        JPanel p7 = new JPanel();
        p7.add(l7);
        f7.add(p7);
        button7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // open a new frame i.e window
                f7.pack();
                f7.setLocationRelativeTo(null);
                f7.setVisible(true);
            }
        });

        JButton button8 = new JButton();
        button8.setBackground(Color.GREEN);
        button8.setIcon(caesarSalad);
        button8.setText("Caesar Salad");
        button8.setFont(new Font("Times New Roman", Font.BOLD, 25));
        button8.setHorizontalTextPosition(SwingConstants.CENTER);
        button8.setVerticalTextPosition(SwingConstants.BOTTOM);
        JFrame f8 = new JFrame("Caesar Salad Info");
        JLabel l8 = new JLabel();
        Icon caesarinfo = new ImageIcon("\\hackathon\\hack1\\src\\caesarinfo.jpg");
        l8.setIcon(caesarinfo);
        JPanel p8 = new JPanel();
        p8.add(l8);
        f8.add(p8);
        button8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // open a new frame i.e window
                f8.pack();
                f8.setLocationRelativeTo(null);
                f8.setVisible(true);
            }
        });

        JFrame frame = new JFrame("Nutrition Education by 3Rice1Bean");
        frame.setLayout(new GridLayout(2, 5)); // 2 rows, 4 columns

        frame.add(title);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(direction);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        frame.add(button8);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationByPlatform(true);
        frame.setSize(1100, 500); // Adjust the frame size as needed
        frame.setVisible(true);
    }
}