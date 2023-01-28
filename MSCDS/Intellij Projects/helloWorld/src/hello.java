import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class hello {
    private JButton button1;
    JPanel panel1;

    public hello(JFrame frame) {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Hello World!");
                panel1.setVisible(false);
                frame.remove(panel1);

//                JFrame frame = new JFrame("App");
//                frame.setContentPane(new welcome().panel1);
//                frame.setPreferredSize(new Dimension(500,500));
//                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//                frame.pack();
//                frame.setVisible(true);
            }
        });
    }
}
