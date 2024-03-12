package app;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class App extends JFrame {

    private static final long serialVersionUID = 1L;
    private JButton  btnMembers;
    private JButton btnActivity;
    private JLabel label;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    App frame = new App();
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
    public App() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 1014, 597);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("YMCA");
        lblNewLabel.setForeground(Color.BLACK);
        lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 46));
        lblNewLabel.setBounds(423, 13, 273, 93);
        contentPane.add(lblNewLabel);


        btnMembers = new JButton("Members");
        btnMembers.setForeground(new Color(0, 0, 0));
        btnMembers.setBackground(UIManager.getColor("Button.disabledForeground"));
        btnMembers.setFont(new Font("Tahoma", Font.PLAIN, 39));
        btnMembers.setBounds(200, 166, 250, 96);
        btnMembers.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                dispose();
                Member mem = new Member("valid");
                mem.setVisible(true);
            }
        });
        contentPane.add(btnMembers);

        btnActivity = new JButton("Activity");
        btnActivity.setForeground(new Color(0, 0, 0));
        btnActivity.setBackground(UIManager.getColor("Button.disabledForeground"));
        btnActivity.setFont(new Font("Tahoma", Font.PLAIN, 39));
        btnActivity.setBounds(525, 166, 250, 96);
        btnActivity.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                dispose();
                Activity act = new Activity("valid");
                act.setVisible(true);


            }
        });

        contentPane.add(btnActivity);



    }
}