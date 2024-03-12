package app;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Toolkit;
import java.io.PrintWriter;
import java.sql.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class Activity extends JFrame {

    private JPanel contentPane;
    private JButton btnAdd;
    private JButton btnRemove;
    private JButton btnSearch;
    private JButton btnBack;

    //private JTable table;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Member frame = new Member();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Activity() {

    }

    /**
     * Create the frame.
     */
    public Activity(String userSes) {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 1014, 597);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Activity");
        lblNewLabel.setForeground(Color.BLACK);
        lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 46));
        lblNewLabel.setBounds(423, 13, 273, 93);
        contentPane.add(lblNewLabel);

        // labels
        //row1
        JLabel lblActivityName = new JLabel("ActivityName");
        lblActivityName.setBackground(Color.BLACK);
        lblActivityName.setForeground(Color.BLACK);
        lblActivityName.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblActivityName.setBounds(100, 150, 150, 35);
        contentPane.add(lblActivityName);

        JLabel lblType = new JLabel("Activity Type");
        lblType.setForeground(Color.BLACK);
        lblType.setBackground(Color.CYAN);
        lblType.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblType.setBounds(100, 200, 150, 35);
        contentPane.add(lblType);

        JLabel lblLocation = new JLabel("Location");
        lblLocation.setForeground(Color.BLACK);
        lblLocation.setBackground(Color.CYAN);
        lblLocation.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblLocation.setBounds(100, 250, 150, 35);
        contentPane.add(lblLocation);

        JLabel lblAge = new JLabel("Age Restriction");
        lblAge.setForeground(Color.BLACK);
        lblAge.setBackground(Color.CYAN);
        lblAge.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblAge.setBounds(100, 300, 150, 35);
        contentPane.add(lblAge);


        JLabel lblActiveId = new JLabel("ActivityID");
        lblActiveId.setForeground(Color.BLACK);
        lblActiveId.setBackground(Color.CYAN);
        lblActiveId.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblActiveId.setBounds(375, 350, 150, 35);
        contentPane.add(lblActiveId);

        JTextField activeId = new JTextField();
        activeId.setFont(new Font("Tahoma", Font.PLAIN, 16));
        activeId.setBounds( 475, 350, 200, 35);
        contentPane.add(activeId);



        //row2
        JLabel lblCost = new JLabel("Cost");
        lblCost .setBackground(Color.BLACK);
        lblCost.setForeground(Color.BLACK);
        lblCost.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblCost.setBounds(550, 150, 150, 35);
        contentPane.add(lblCost);

        JLabel lblTime = new JLabel("Time");
        lblTime.setForeground(Color.BLACK);
        lblTime.setBackground(Color.CYAN);
        lblTime.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblTime.setBounds(550, 200, 150, 35);
        contentPane.add(lblTime);

        JLabel lblSecton = new JLabel("Section");
        lblSecton.setForeground(Color.BLACK);
        lblSecton.setBackground(Color.CYAN);
        lblSecton.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblSecton.setBounds(550, 250, 150, 35);
        contentPane.add(lblSecton);

        JLabel lblStaff = new JLabel("StaffID");
        lblStaff.setForeground(Color.BLACK);
        lblStaff.setBackground(Color.CYAN);
        lblStaff.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblStaff.setBounds(550, 300, 150, 35);
        contentPane.add(lblStaff);



        // Fields
        //row1
        JTextField activityName = new JTextField();
        activityName.setFont(new Font("Tahoma", Font.PLAIN, 16));
        activityName.setBounds(250, 150, 200, 35);
        contentPane.add(activityName);

        JTextField type = new JTextField();
        type.setFont(new Font("Tahoma", Font.PLAIN, 16));
        type.setBounds(250, 200, 200, 35);
        contentPane.add(type);

        JTextField location = new JTextField();
        location.setFont(new Font("Tahoma", Font.PLAIN, 16));
        location.setBounds(250, 250, 200, 35);
        contentPane.add(location);

        JTextField age = new JTextField();
        age.setFont(new Font("Tahoma", Font.PLAIN, 16));
        age.setBounds(250, 300, 200, 35);
        contentPane.add(age);

        // row2
        JTextField cost  = new JTextField();
        cost.setFont(new Font("Tahoma", Font.PLAIN, 16));
        cost.setBounds(700, 150, 200, 35);
        contentPane.add(cost);

        JTextField time = new JTextField();
        time.setFont(new Font("Tahoma", Font.PLAIN, 16));
        time.setBounds(700, 200, 200, 35);
        contentPane.add(time);

        JTextField section = new JTextField();
        section .setFont(new Font("Tahoma", Font.PLAIN, 16));
        section .setBounds(700, 250, 200, 35);
        contentPane.add(section);

        JTextField staff = new JTextField();
        staff.setFont(new Font("Tahoma", Font.PLAIN, 16));
        staff.setBounds(700, 300, 200, 35);
        contentPane.add(staff);


        
        
        
        //buttons
        btnAdd = new JButton("Add");
        btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 26));
        btnAdd.setBounds(125, 425, 162, 73);
        btnAdd.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                String actid = activeId.getText();
                String actName = activityName.getText();
                String actType = type.getText();
                String ageRestr = age.getText();
                String costs = cost.getText();
                String timing = time.getText();
                String loc = location.getText();
                String staffid = staff.getText();
                String sec = section.getText();

                String msg = "" + activityName;
                msg += " \n";
                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/membershipdb", "root", "#stayAlive1");

                    String query = "INSERT INTO activities values('" + actid + "','" + actName + "','" + actType + "','" + sec + "','" +
                            timing + "','" + loc + "','" + ageRestr + "','" + costs + "','" + staffid + "')";

                    Statement sta = connection.createStatement();
                    int x = sta.executeUpdate(query);
                    if (x == 0) {
                        JOptionPane.showMessageDialog(btnAdd, "This already exists");
                    } else {
                        JOptionPane.showMessageDialog(btnAdd,
                                "The Activity was created successfully!");
                    }
                    connection.close();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }

            }
        });
        contentPane.add(btnAdd);

        btnRemove = new JButton("Remove");
        btnRemove.setFont(new Font("Tahoma", Font.PLAIN, 26));
        btnRemove.setBounds(325, 425, 162, 73);
        btnRemove.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                String actid = activeId.getText();
                String actName = activityName.getText();
                String actType = type.getText();
                String ageRestr = age.getText();
                String costs = cost.getText();
                String timing = time.getText();
                String loc = location.getText();
                String staffid = staff.getText();
                String sec = section.getText();

                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/membershipdb", "root", "#stayAlive1");

                    String query = "DELETE FROM activities WHERE activityID = "+ actid;

                    Statement sta = connection.createStatement();
                    int x = sta.executeUpdate(query);
                    if (x == 0) {
                        JOptionPane.showMessageDialog(btnAdd, "This already exist");
                    } else {
                        JOptionPane.showMessageDialog(btnAdd,
                                "The Activity was removed successfully!");
                    }
                    connection.close();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }


            }
        });
        contentPane.add(btnRemove);

        btnSearch = new JButton("Search");
        btnSearch.setFont(new Font("Tahoma", Font.PLAIN, 26));
        btnSearch.setBounds(525, 425, 162, 73);
        btnSearch.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                String actid = activeId.getText();
                String actName = activityName.getText();
                String actType = type.getText();
                String ageRestr = age.getText();
                String costs = cost.getText();
                String timing = time.getText();
                String loc = location.getText();
                String staffid = staff.getText();
                String sec = section.getText();

                String msg = "" + activityName;
                msg += " \n";
                //DefaultTableModel model = new DefaultTableModel(new String[]{"video name", "video description", "video_city"}, 0);
                //model=(DefaultTableModel) table.getModel();
                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/membershipdb", "root", "#stayAlive1");

                    String query = "SELECT * FROM activities WHERE activityID = " + actid + " ";

                    Statement sta = connection.createStatement();
                    ResultSet x = sta.executeQuery(query);

                    //String bookName = x.getString("name");
                    String name = null;
                    String section = null;
                    String cost = null;
                    String agereq = null;
                    while (x.next()) {
                        name = x.getString("name");
                        section = x.getString("section");
                        cost = x.getString("cost");
                        agereq = x.getString("ageRequirement");
                        //model.addRow(new Object[]{d, e11, f});
                    }
                    //table.setModel(model);

                    JOptionPane.showMessageDialog(null, "Name = " + name + "Section = " + section + "Cost = "
                            + cost + "Age Restriction" + agereq);
                    connection.close();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        contentPane.add(btnSearch);

        btnBack = new JButton("Back");
        btnBack.setFont(new Font("Tahoma", Font.PLAIN, 26));
        btnBack.setBounds(725, 425, 162, 73);
        btnBack.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                dispose();
                App app = new App();
                app.setVisible(true);
            }
        });
        contentPane.add(btnBack);
    }
}