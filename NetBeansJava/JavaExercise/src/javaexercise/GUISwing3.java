

package javaexercise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

//buton ve text field oluştur butona her tıklandığında bir arttırararak yaz.

public class GUISwing3 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JLabel l1 = new JLabel();
        l1.setText("merhaba");
        l1.setBounds(100,50,100,30);
        JButton btn = new  JButton("Degistir.");
        btn.setBounds(100,100,100,30);
        btn.addActionListener(new ActionListener() {
            int c =1;
            @Override
            public void actionPerformed(ActionEvent e) {
                l1.setText("Btn tiklandi"+ c++ + "!!");}
        });
        f.add(btn);
        f.add(l1);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
