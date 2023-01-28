import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class testForm {
    JPanel panel1;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton button1;

    public testForm() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                code to be perfromed on button click
                String userName = textField1.getText();
                String password = String.valueOf(passwordField1.getPassword());
                try{
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","12345");
                    Statement statement = connection.createStatement();
                    ResultSet resultSet = statement.executeQuery(
                            "select * from designation");
                    int code;
                    String title;
                    while (resultSet.next()) {
                        code = resultSet.getInt("code");
                        title = resultSet.getString("title").trim();
                        System.out.println("Code : " + code
                                + " Title : " + title);
                    }
                    resultSet.close();
                    statement.close();
                    connection.close();
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }
}
