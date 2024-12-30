package JavaGUIappletler;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

class ornek1 extends JPanel {
    //
    // içi + dışı - çizilsin

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int w = getWidth();
        int h = getHeight();
        g.drawOval((w / 2) - 100, (h / 2) - 100, 200, 200);
        int mx = w / 2;
        int my = h / 2;
        for (int i = 0; i < w; i += 15) {
            for (int j = 0; j < h; j += 15) {
                double mes = Math.sqrt((i - mx) * (i - mx) + (j - my) * (j - my));
                if (mes < 100) {
                    g.setColor(Color.blue);
                    g.drawString("+", i, j);
                } else {
                    g.setColor(Color.red);
                    g.drawString("-", i, j);
                }
            } 
        }
    }
}

public class GrafikUygulama2 extends JFrame {

    public GrafikUygulama2() {
        add(new ornek1()); // Changed from cizim() to ornek1()
    }

    public static void main(String[] args) {
        GrafikUygulama2 f = new GrafikUygulama2();
        f.setTitle("ilk grafik");
        f.setSize(700, 700);
        f.setResizable(true);
        f.setLocation(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
