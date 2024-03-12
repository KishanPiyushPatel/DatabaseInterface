package app;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Member extends JFrame {

    private JPanel contentPane;
    private JButton btnAdd;
    private JButton btnRemove;
    private JButton btnSearch;
    private JButton btnBack;

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

    public Member() {

    }

    /**
     * Create the frame.
     */
    public Member(String userSes) {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 1014, 597);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(2, 2, 2, 2));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Member");
        lblNewLabel.setForeground(Color.BLACK);
        lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 46));
        lblNewLabel.setBounds(423, 13, 273, 93);
        contentPane.add(lblNewLabel);

        // labels
        //row1
        JLabel lblMemberName = new JLabel("First Name");
        lblMemberName.setBackground(Color.BLACK);
        lblMemberName.setForeground(Color.BLACK);
        lblMemberName.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblMemberName.setBounds(100, 150, 150, 35);
        contentPane.add(lblMemberName);

        JLabel lbldob= new JLabel("Date of Birth");
        lbldob.setForeground(Color.BLACK);
        lbldob.setBackground(Color.CYAN);
        lbldob.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lbldob.setBounds(550, 350, 150, 35);
        contentPane.add(lbldob);

        JTextField dob = new JTextField();
        dob.setFont(new Font("Tahoma", Font.PLAIN, 16));
        dob.setBounds( 700, 350, 200, 35);
        contentPane.add(dob);

        JLabel lblMemberId = new JLabel("MemberId");
        lblMemberId.setForeground(Color.BLACK);
        lblMemberId.setBackground(Color.CYAN);
        lblMemberId.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblMemberId.setBounds(100, 350, 150, 35);
        contentPane.add(lblMemberId);

        JTextField mId = new JTextField();
        mId.setFont(new Font("Tahoma", Font.PLAIN, 16));
        mId.setBounds(250, 350, 200, 35);
        contentPane.add(mId);


        JLabel lbllname = new JLabel("Last Name");
        lbllname.setForeground(Color.BLACK);
        lbllname.setBackground(Color.CYAN);
        lbllname.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lbllname.setBounds(100, 200, 150, 35);
        contentPane.add(lbllname);

        JLabel lblGender = new JLabel("Gender");
        lblGender.setForeground(Color.BLACK);
        lblGender.setBackground(Color.CYAN);
        lblGender.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblGender.setBounds(100, 250, 150, 35);
        contentPane.add(lblGender);

        JLabel lblEmeContact = new JLabel("Emergency Contact");
        lblEmeContact.setForeground(Color.BLACK);
        lblEmeContact.setBackground(Color.CYAN);
        lblEmeContact.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblEmeContact.setBounds(100, 300, 150, 35);
        contentPane.add(lblEmeContact);

        //row2
        JLabel lblAdress = new JLabel("Address");
        lblAdress .setBackground(Color.BLACK);
        lblAdress.setForeground(Color.BLACK);
        lblAdress.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblAdress.setBounds(550, 150, 150, 35);
        contentPane.add(lblAdress);

        JLabel lblPhoneNumber = new JLabel("Phone Number");
        lblPhoneNumber.setForeground(Color.BLACK);
        lblPhoneNumber.setBackground(Color.CYAN);
        lblPhoneNumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblPhoneNumber.setBounds(550, 200, 150, 35);
        contentPane.add(lblPhoneNumber);

        JLabel lblEmail = new JLabel("Email");
        lblEmail.setForeground(Color.BLACK);
        lblEmail.setBackground(Color.CYAN);
        lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblEmail.setBounds(550, 250, 150, 35);
        contentPane.add(lblEmail);

        JLabel lblActive = new JLabel("Active");
        lblActive.setForeground(Color.BLACK);
        lblActive.setBackground(Color.CYAN);
        lblActive.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblActive.setBounds(550, 300, 150, 35);
        contentPane.add(lblActive);



        // Fields
        //row1
        JTextField memberName = new JTextField();
        memberName.setFont(new Font("Tahoma", Font.PLAIN, 16));
        memberName.setBounds(250, 150, 200, 35);
        contentPane.add(memberName);

        JTextField lastName = new JTextField();
        lastName.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lastName.setBounds(250, 200, 200, 35);
        contentPane.add(lastName);

        JTextField gender = new JTextField();
        gender.setFont(new Font("Tahoma", Font.PLAIN, 16));
        gender.setBounds(250, 250, 200, 35);
        contentPane.add(gender);

        JTextField EmeContact = new JTextField();
        EmeContact.setFont(new Font("Tahoma", Font.PLAIN, 16));
        EmeContact.setBounds(250, 300, 200, 35);
        contentPane.add(EmeContact);

        // row2
        JTextField address  = new JTextField();
        address.setFont(new Font("Tahoma", Font.PLAIN, 16));
        address.setBounds(700, 150, 200, 35);
        contentPane.add(address);

        JTextField pnumber = new JTextField();
        pnumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
        pnumber.setBounds(700, 200, 200, 35);
        contentPane.add(pnumber);

        JTextField email = new JTextField();
        email.setFont(new Font("Tahoma", Font.PLAIN, 16));
        email.setBounds(700, 250, 200, 35);
        contentPane.add(email);

        JTextField active = new JTextField();
        active.setFont(new Font("Tahoma", Font.PLAIN, 16));
        active.setBounds(700, 300, 200, 35);
        contentPane.add(active);

        // ID






        // button menu
        btnAdd = new JButton("Add");
        btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 26));
        btnAdd.setBounds(125, 425, 162, 73);
        btnAdd.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                // add database Query hear

                String membername = memberName.getText();
                String mID = mId.getText();
                String last = lastName.getText();
                String dateofbirth = dob.getText();//lastName.getText();
                String genders = gender.getText();
                String emergency = EmeContact.getText();
                String addr = address.getText();
                String pno = pnumber.getText();
                String emails = email.getText();
                String isactive = active.getText();

                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/membershipdb", "root", "#stayAlive1");
                    String query = "INSERT INTO participants values('" + mID + "','" + membername + "','" + last + "','" +
                            dateofbirth + "','" + addr + "','" + genders + "','" + emails + "','" + pno + "','" + isactive + "','" + emergency + "','" + "11111" + "')";

                    Statement sta = connection.createStatement();
                    int x = sta.executeUpdate(query);
                    if (x == 0) {
                        JOptionPane.showMessageDialog(btnAdd, "This already exists");
                    } else {
                        JOptionPane.showMessageDialog(btnAdd,
                                "The Account was created successfully!");
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
                // add database Query hear
                String membername = memberName.getText();
                String mID = mId.getText();
                String last = lastName.getText();
                String dateofbirth = dob.getText();//lastName.getText();
                String genders = gender.getText();
                String emergency = EmeContact.getText();
                String addr = address.getText();
                String pno = pnumber.getText();
                String emails = email.getText();
                String isactive = active.getText();

                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/membershipdb", "root", "#stayAlive1");

                    String query = "DELETE FROM participants WHERE memberID = "+ mID;

                    Statement sta = connection.createStatement();
                    int x = sta.executeUpdate(query);
                    if (x == 0) {
                        JOptionPane.showMessageDialog(btnAdd, "This member was not in database");
                    } else {
                        JOptionPane.showMessageDialog(btnAdd,
                                "The Member was removed successfully!");
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
                // add database Query hear
                String membername = memberName.getText();
                String mID = mId.getText();
                String last = lastName.getText();
                String dateofbirth = dob.getText();//lastName.getText();
                String genders = gender.getText();
                String emergency = EmeContact.getText();
                String addr = address.getText();
                String pno = pnumber.getText();
                String emails = email.getText();
                String isactive = active.getText();

                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/membershipdb", "root", "#stayAlive1");

                    String query = "SELECT * FROM participants WHERE memberID = " + mID + " ";

                    Statement sta = connection.createStatement();
                    ResultSet x = sta.executeQuery(query);

                    //String bookName = x.getString("name");
                    String fname = null;
                    String lname = null;
                    String isActive = null;
                    while (x.next()) {
                        fname = x.getString("firstName");
                        lname = x.getString("lastName");
                        isActive = x.getString("isActive");
                        //model.addRow(new Object[]{d, e11, f});
                    }
                    //table.setModel(model);

                    JOptionPane.showMessageDialog(null, "First Name = " + fname + ", Last Name = " + lname + ", Active? = "
                            + isActive);
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