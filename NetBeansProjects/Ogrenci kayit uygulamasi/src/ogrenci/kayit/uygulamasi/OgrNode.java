
package ogrenci.kayit.uygulamasi;

public class OgrNode {
     int numara;
    String ad ;
    String soyad;
    int vize;
    int fin;
    double ortalama;
    String durum;
    
    OgrNode next;
    
    //constructor oluşturuldu ve varsayılan değerler verildi.
    public OgrNode (int numara , String ad , String soyad , int vize ,int fin) {
        this.numara = numara;
        this.ad = ad;
        this.soyad = soyad;
        this.vize = vize;
        this.fin = fin;
        
        ortalama = vize *0.4 + fin*0.6;
        
        if(ortalama >= 50 && fin >= 50){
            durum = "gecti";
        }else {
            durum = "Kaldi";
        }
        
         next = null;
        
}
    
    
}
