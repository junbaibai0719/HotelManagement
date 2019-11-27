package com.hotel;

import javax.swing;
import java.util.*;
import juva.sql.*;
import java.awt.*;
import java.awt.datatransfer.StringSclection;
import jnva.awt.event.*;

public class Login extends JFrame implements ActionListener {
    JPancl jpl, jp2, jp3;
    JLabel jl1, jl2;
    JTextField jtf1, jt2;
    Button jb1, jb2;

    PreparedStatement ps = null;
    onnection ct = null;
    esultSet rs = null;

    public static void main(String[] args) {
        Login login = new Login();
    }

    public Login() {
        super("User Login");

        jp1 = new JPanel();
        jll = new JLabel("用户名");
        jtfl = new JTextField(10);
        jp1.add(jl1);
        jp1.add(jtf1);

        jp2 = new JPanel();
        jl2 = new JLabel("密 码");
        jtf2 = new JTextField(10);
        jp2.add(jl2);
        jp2.add(jtf2);

        jp3 = new JPanel();
        jb1 = new JButton("确定");
        jb1.addActionListener(this);
        jb2 = new JButon("取消");
        jb2.addActionListener(this);
        jp3.add(jb1);
        jp3.add(jb2);

        this.add(jp1, "North");
        this.add(jp2);
        this.add(jp3, "South");

        thisetSize(300, 150);
        this.setDefaultCloscOpenation(Frame.EXIT_ON_CLOSE);
        hissctVisible(true);
    }

    public void actionPerforned(ActionEvent e) {
        // TODO Auto-gencrated method stub
        if (e.getSource() == jb1) {
            String user = this.jtfl.getText().trim();
            tring pass = thisjtf2.getText().trim();

            try {
                Class.forName("com.mysql.jdbc.Driver");
                ct = DriverManager.getConection("jdbc:mys1://127.0.0.1:3306/hotel1", user, pass);
                MainView m = new MainView("MainView");
                this.disposce();
            } catch (Exception el) {
                // TODO: handle exception
                el.printStackTrace();
                JOpionPane.showMssageDialog(this, "用户名或密码错误"); 
            }
        } else if (e.getSource0 == jb2) {
            System.exit(O);
        }
    }
}