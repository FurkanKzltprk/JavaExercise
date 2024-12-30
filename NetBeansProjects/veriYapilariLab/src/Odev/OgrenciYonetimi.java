import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Ders sınıfı
class Ders {
    String dersAdi;
    Ders sonraki;

    public Ders(String dersAdi) {
        this.dersAdi = dersAdi;
        this.sonraki = null;
    }
}

// Öğrenci sınıfı
class Ogrenci {
    String isim;
    Ders dersBas;
    Ogrenci sonraki;

    public Ogrenci(String isim) {
        this.isim = isim;
        this.dersBas = null;
        this.sonraki = null;
    }

    // Öğrenciye ders ekleme metodu
    public void dersEkle(String dersAdi) {
        Ders yeniDers = new Ders(dersAdi);
        yeniDers.sonraki = dersBas;
        dersBas = yeniDers;
    }

    // Öğrenciden ders çıkarma metodu
    public void dersSil(String dersAdi) {
        Ders mevcut = dersBas;
        Ders onceki = null;

        while (mevcut != null) {
            if (mevcut.dersAdi.equals(dersAdi)) {
                if (onceki == null) {
                    dersBas = mevcut.sonraki; // Başı sil
                } else {
                    onceki.sonraki = mevcut.sonraki; // Mevcut dersi sil
                }
                return; // Ders bulundu ve silindi
            }
            onceki = mevcut;
            mevcut = mevcut.sonraki;
        }
    }

    // Öğrencinin derslerini listeleme metodu
    public String[] dersleriListele() {
        java.util.List<String> dersListesi = new java.util.ArrayList<>();
        Ders mevcut = dersBas;
        while (mevcut != null) {
            dersListesi.add(mevcut.dersAdi);
            mevcut = mevcut.sonraki;
        }
        return dersListesi.toArray(new String[0]);
    }
}

// Öğrenci listesi sınıfı
class OgrenciListesi {
    Ogrenci bas;

    // Öğrenci ekleme metodu
    public void ogrenciEkle(String isim) {
        Ogrenci yeniOgrenci = new Ogrenci(isim);
        yeniOgrenci.sonraki = bas;
        bas = yeniOgrenci;
    }

    // En fazla dersi olan öğrenciyi bulma metodu
    public String enFazlaDersOgrenciBul() {
        Ogrenci mevcut = bas;
        Ogrenci enFazla = null;
        int maxDers = 0;

        while (mevcut != null) {
            int dersSayisi = 0;
            Ders dersMevcut = mevcut.dersBas;

            while (dersMevcut != null) {
                dersSayisi++;
                dersMevcut = dersMevcut.sonraki;
            }

            if (dersSayisi > maxDers) {
                maxDers = dersSayisi;
                enFazla = mevcut;
            }
            mevcut = mevcut.sonraki;
        }
        return enFazla != null ? enFazla.isim + " (" + maxDers + " ders)" : "Öğrenci yok";
    }

    // Öğrenci silme metodu
    public void ogrenciSil(String isim) {
        Ogrenci mevcut = bas;
        Ogrenci onceki = null;

        while (mevcut != null) {
            if (mevcut.isim.equals(isim)) {
                if (onceki == null) {
                    bas = mevcut.sonraki; // Başındaki öğrenciyi sil
                } else {
                    onceki.sonraki = mevcut.sonraki; // Mevcut öğrenciyi sil
                }
                return; // Öğrenci bulundu ve silindi
            }
            onceki = mevcut;
            mevcut = mevcut.sonraki;
        }
    }

    // Öğrenci ve dersleri silme metodu
    public void ogrenciVeDersSil(String isim) {
        Ogrenci mevcut = bas;
        Ogrenci onceki = null;

        while (mevcut != null) {
            if (mevcut.isim.equals(isim)) {
                // Öğrenci bulundu, tüm dersleri sil
                mevcut.dersBas = null; // Tüm dersleri sil
                if (onceki == null) {
                    bas = mevcut.sonraki; // Başındaki öğrenciyi sil
                } else {
                    onceki.sonraki = mevcut.sonraki; // Mevcut öğrenciyi sil
                }
                return; // Öğrenci bulundu ve silindi
            }
            onceki = mevcut;
            mevcut = mevcut.sonraki;
        }
    }
}

// Ana GUI sınıfı
public class OgrenciYonetimi extends JFrame {
    OgrenciListesi ogrenciListesi;
    JTextField isimField, dersField;
    DefaultTableModel tableModel;
    JTable table;

    public OgrenciYonetimi() {
        ogrenciListesi = new OgrenciListesi();
        initComponents();
    }

    private void initComponents() {
        setTitle("Öğrenci Yönetimi");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);

        isimField = new JTextField(10);
        dersField = new JTextField(10);

        // JTable için model ve tablo oluşturma
        String[] columnNames = {"Öğrenci İsmi", "Dersler"};
        tableModel = new DefaultTableModel(columnNames, 0);
        table = new JTable(tableModel);

        JButton ogrenciEkleButton = new JButton("Öğrenci Ekle");
        ogrenciEkleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String isim = isimField.getText();
                if (!isim.isEmpty()) {
                    ogrenciListesi.ogrenciEkle(isim);
                    tableModel.addRow(new Object[]{isim, ""});
                    isimField.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Lütfen bir isim girin.");
                }
            }
        });

        JButton dersEkleButton = new JButton("Ders Ekle");
        dersEkleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String isim = JOptionPane.showInputDialog("Ders eklemek istediğiniz öğrencinin ismini girin:");
                String dersAdi = dersField.getText();
                Ogrenci mevcut = ogrenciListesi.bas;

                while (mevcut != null) {
                    if (mevcut.isim.equals(isim)) {
                        mevcut.dersEkle(dersAdi);
                        int row = findRowByStudentName(isim);
                        if (row != -1) {
                            String dersler = (String) tableModel.getValueAt(row, 1);
                            dersler = dersler.isEmpty() ? dersAdi : dersler + ", " + dersAdi;
                            tableModel.setValueAt(dersler, row, 1);
                        }
                        break;
                    }
                    mevcut = mevcut.sonraki;
                }
                if (mevcut == null) {
                    JOptionPane.showMessageDialog(null, "Öğrenci bulunamadı.");
                }
                dersField.setText("");
            }
        });

        JButton dersSilButton = new JButton("Ders Sil");
        dersSilButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String isim = JOptionPane.showInputDialog("Ders silmek istediğiniz öğrencinin ismini girin:");
                String dersAdi = dersField.getText();
                Ogrenci mevcut = ogrenciListesi.bas;

                while (mevcut != null) {
                    if (mevcut.isim.equals(isim)) {
                        mevcut.dersSil(dersAdi);
                        int row = findRowByStudentName(isim);
                        if (row != -1) {
                            String dersler = (String) tableModel.getValueAt(row, 1);
                            dersler = dersler.replace(dersAdi, "").replaceAll(", ,", ",").replaceAll("^,|,$", "").trim();
                            tableModel.setValueAt(dersler, row, 1);
                        }
                        break;
                    }
                    mevcut = mevcut.sonraki;
                }
                if (mevcut == null) {
                    JOptionPane.showMessageDialog(null, "Öğrenci bulunamadı.");
                }
                dersField.setText("");
            }
        });

        JButton ogrenciSilButton = new JButton("Öğrenci Sil");
        ogrenciSilButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String isim = isimField.getText();
                int row = findRowByStudentName(isim);
                if (row != -1) {
                    ogrenciListesi.ogrenciVeDersSil(isim);
                    tableModel.removeRow(row);
                } else {
                    JOptionPane.showMessageDialog(null, "Öğrenci bulunamadı.");
                }
                isimField.setText("");
            }
        });

        JButton enFazlaDersButton = new JButton("En Fazla Dersi Olan Öğrenci");
        enFazlaDersButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String sonuc = ogrenciListesi.enFazlaDersOgrenciBul();
                JOptionPane.showMessageDialog(null, sonuc);
            }
        });

        add(new JLabel("Öğrenci İsmi:"));
        add(isimField);
        add(ogrenciEkleButton);
        add(ogrenciSilButton);
        add(new JLabel("Ders Adı:"));
        add(dersField);
        add(dersEkleButton);
        add(dersSilButton);
        add(enFazlaDersButton);
        add(new JScrollPane(table));

        setVisible(true);
    }

    // Öğrenci ismine göre tablo satırı bulma metodu
    private int findRowByStudentName(String isim) {
        for (int i = 0; i < tableModel.getRowCount(); i++) {
            if (tableModel.getValueAt(i, 0).equals(isim)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        new OgrenciYonetimi();
    }
}
