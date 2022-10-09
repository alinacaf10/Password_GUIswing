package main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        JFrame frame=new JFrame();
        JPasswordField pass=new JPasswordField();
        JLabel l1=new JLabel("Pass: ");
        pass.setBounds(0,0,100,30);
        l1.setBounds(20,20,100,30);
        JButton button=new JButton("Submit");
        button.setBounds(20,80,100,30);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String password=new String(pass.getPassword());
                l1.setText(l1.getText()+password);
            }
        });

        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.add(pass);
        frame.add(l1);
        frame.add(button);
    }
}
