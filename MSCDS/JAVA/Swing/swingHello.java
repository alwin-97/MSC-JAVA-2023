import javax.swing.*;
import java.awt.event.*;

public class swingHello {
    static int counter = 0;
    public static void main(String[] args) {
        // creating a frame
        JFrame frame = new JFrame();
        
        JButton jButton1 = new JButton("click");// creating instance of JButton
        JLabel jLabel1 = new JLabel("Sample Text");

        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                counter += 1;
                jLabel1.setText("Button Clicked : "+counter);
            }
        });

        jLabel1.setBounds(130, 100, 100, 50);
        jButton1.setBounds(130, 150, 100, 40);// x axis, y axis, width, height

        frame.add(jButton1);// adding button in JFrame
        frame.add(jLabel1);

        frame.setSize(500, 500);// 400 width and 500 height
        frame.setLayout(null);// using no layout managers
        frame.setVisible(true);// making the frame visible

    }
}
