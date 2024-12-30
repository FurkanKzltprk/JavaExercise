package javaexercise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class TextField {

    public static void main(String[] args) {

        JFrame f = new JFrame("TextArea ornegi");
        JLabel l1, l2;
        JTextArea area;
        JButton btn;

        l1 = new JLabel("kelime : 0");
        l1.setBounds(50, 25, 100, 30);
        l2 = new JLabel("karakter : 0");
        l2.setBounds(150, 25, 100, 30);

        area = new JTextArea();
        area.setBounds(20, 75, 200, 50);

        btn = new JButton("hesapla");
        btn.setBounds(140, 300, 120, 30);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = area.getText();
                String words[] = text.split("\\s+");
                l1.setText(("Kelime : " + words.length));
                l2.setText("Karakter : " + text.length());

            }

        });
        
        f.add(btn);
        f.add(area);
        f.add(l2);
        f.add(l1);
        
        f.setSize(400,400);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
