package javaexercise;

import javax.swing.*;
import java.awt.*;

public class SiyasiPastaGrafik extends JPanel {

    
    @Override
    public void paint(Graphics g) {
        
        int w = getWidth() / 2;
        int h = getHeight() / 2;
        int r = 80;

        // Oy oranlarını belirleyelim (toplamı 100 olmalı)
        int[] oyOranlari = {20, 25, 15, 30, 10}; // Parti A, Parti B, Parti C, Parti D, Parti E
        
        // Parti renklerini belirleyelim
        Color[] renkler = {Color.blue, Color.green, Color.red, Color.orange, Color.magenta};
        
        // Başlangıç açısını 0 yapalım
        int baslangicAci = 0;

        for (int i = 0; i < oyOranlari.length; i++) {
            g.setColor(renkler[i]);
            g.fillArc(w - r, h - r, 2 * r, 2 * r, baslangicAci, (int) (oyOranlari[i] * 3.6));
            baslangicAci += (int) (oyOranlari[i] * 3.6);
        }
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        SiyasiPastaGrafik spg = new SiyasiPastaGrafik();
        f.add(spg);
        f.setSize(400, 400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
