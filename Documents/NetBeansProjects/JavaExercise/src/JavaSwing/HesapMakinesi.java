package JavaSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HesapMakinesi extends JFrame implements ActionListener {

    private JTextField sayi1 = new JTextField();
    private JTextField sayi2 = new JTextField();
    private JLabel sonucEtiketi = new JLabel("Sonuç:");
    private JButton toplaButonu = new JButton("+");
    private JButton cikarmaButonu = new JButton("-");
    private JButton carpmaButonu = new JButton("*");
    private JButton bolmeButonu = new JButton("/");
    private JButton esitleButonu = new JButton("=");

    public HesapMakinesi() {
        setTitle("Hesap Makinesi");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 4));

        add(sayi1);
        add(sayi2);
        add(sonucEtiketi);
        add(toplaButonu);
        add(cikarmaButonu);
        add(carpmaButonu);
        add(bolmeButonu);
        add(esitleButonu);

        toplaButonu.addActionListener(this);
        cikarmaButonu.addActionListener(this);
        carpmaButonu.addActionListener(this);
        bolmeButonu.addActionListener(this);
        esitleButonu.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double num1 = Double.parseDouble(sayi1.getText());
            double num2 = Double.parseDouble(sayi2.getText());

            double sonuc = 0;

            if (e.getSource() == toplaButonu) {
                sonuc = num1 + num2;
            } else if (e.getSource() == cikarmaButonu) {
                sonuc = num1 - num2;
            } else if (e.getSource() == carpmaButonu) {
                sonuc = num1 * num2;
            } else if (e.getSource() == bolmeButonu) {
                if (num2 != 0) {
                    sonuc = num1 / num2;
                } else {
                    JOptionPane.showMessageDialog(this, "Sıfıra bölme hatası!");
                }
            }

            sonucEtiketi.setText("Sonuç: " + sonuc);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Geçersiz sayı girdisi!");
        }
    }

    public static void main(String[] args) {
        HesapMakinesi hesapMakinesi = new HesapMakinesi();
        hesapMakinesi.setVisible(true);
    }
}
