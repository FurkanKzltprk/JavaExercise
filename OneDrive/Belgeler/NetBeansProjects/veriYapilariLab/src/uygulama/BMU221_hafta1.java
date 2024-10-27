import javax.swing.*;
import java.awt.event.ActionEvent;

class Eleman {
    int icerik;
    Eleman ileri;

    public Eleman(int icerik) {
        this.icerik = icerik;
        ileri = null;
    }
}

class BListe {
    Eleman bas, son;

    public BListe() {
        bas = null;
        son = null;
    }

    // Başa Ekleme
    public void basaEkle(Eleman yeni) {
        if (son == null) {
            bas = yeni;
            son = yeni;
        } else {
            yeni.ileri = bas;
            bas = yeni;
        }
    }

    // Sona Ekleme
    public void sonaEkle(Eleman yeni) {
        if (bas == null) {
            son = yeni;
            bas = yeni;
        } else {
            son.ileri = yeni;
            son = yeni;
        }
    }

    // Baştan Sil
    public Eleman bastanSil() {
        Eleman tmp = bas;
        if (bas != null)
            bas = bas.ileri;
        else {
            son = null;
            return null;
        }
        return tmp;
    }

    // Sondan Sil
    public Eleman sondansil() {
        Eleman tmp = bas, once = null, silinen = son;
        while (tmp != son) {
            once = tmp;
            tmp = tmp.ileri;
        }
        if (once == null) {
            bas = null;
            son = null;
            return null;
        } else {
            once.ileri = null;
            son = once;
            return silinen;
        }
    }

    // Liste Elemanlarını gösterme
    public String listele() {
        StringBuilder S = new StringBuilder();
        Eleman tmp = bas;
        while (tmp != null) {
            S.append(tmp.icerik).append("-->");
            tmp = tmp.ileri;
        }
        S.append("null");
        return S.toString();
    }
}

public class BMU221_hafta1 extends JFrame {
    BListe L;
    private JTextField jTextField1;
    private JLabel jLabel2;
    
    public BMU221_hafta1() {
        initComponents();
        L = new BListe();
    }

    private void initComponents() {
        setTitle("Bağlı Liste Uygulaması");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        JLabel label = new JLabel("Sayı:");
        label.setBounds(30, 20, 50, 30);
        add(label);
        
        jTextField1 = new JTextField();
        jTextField1.setBounds(100, 20, 100, 30);
        add(jTextField1);
        
        JButton basaEkle = new JButton("Başa Ekle");
        basaEkle.setBounds(30, 70, 150, 30);
        basaEkle.addActionListener(this::basaEkleActionPerformed);
        add(basaEkle);
        
        JButton sonaEkle = new JButton("Sona Ekle");
        sonaEkle.setBounds(30, 110, 150, 30);
        sonaEkle.addActionListener(this::sonaEkleActionPerformed);
        add(sonaEkle);
        
        JButton bastanSil = new JButton("Baştan Sil");
        bastanSil.setBounds(30, 150, 150, 30);
        bastanSil.addActionListener(this::bastanSilActionPerformed);
        add(bastanSil);
        
        JButton sondanSil = new JButton("Sondan Sil");
        sondanSil.setBounds(30, 190, 150, 30);
        sondanSil.addActionListener(this::sondanSilActionPerformed);
        add(sondanSil);
        
        jLabel2 = new JLabel();
        jLabel2.setBounds(30, 230, 300, 30);
        add(jLabel2);
    }

    private void basaEkleActionPerformed(ActionEvent evt) {
        int sayi = Integer.parseInt(jTextField1.getText());
        Eleman yeni = new Eleman(sayi);
        L.basaEkle(yeni);
        jLabel2.setText(L.listele());
    }

    private void sonaEkleActionPerformed(ActionEvent evt) {
        int sayi = Integer.parseInt(jTextField1.getText());
        Eleman yeni = new Eleman(sayi);
        L.sonaEkle(yeni);
        jLabel2.setText(L.listele());
    }

    private void bastanSilActionPerformed(ActionEvent evt) {
        Eleman sonuc = L.bastanSil();
        if (sonuc != null)
            jLabel2.setText(L.listele());
        else
            jLabel2.setText("Liste boş");
    }

    private void sondanSilActionPerformed(ActionEvent evt) {
        Eleman sonuc = L.sondansil();
        if (sonuc != null)
            jLabel2.setText(L.listele());
        else
            jLabel2.setText("Liste boş");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            BMU221_hafta1 frame = new BMU221_hafta1();
            frame.setVisible(true);
        });
    }
}
