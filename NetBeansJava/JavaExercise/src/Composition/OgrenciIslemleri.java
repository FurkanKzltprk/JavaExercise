
package Composition;


public class OgrenciIslemleri {
    public Ogrenci ogrenci;

    public OgrenciIslemleri (Ogrenci ogrenci) {
        this.ogrenci = ogrenci;
        
    }
    public void ekle(){
        System.out.println("Ogrenci eklendi : "+ogrenci.ad);
        
    }
    
    public void sil(){
        System.out.println("Ogrenci silindi  : "+ ogrenci.numara);
        
    }
    public void bilgileriGoster(){
        System.out.println(ogrenci.ad);
        System.out.println(ogrenci.soyad);
        System.out.println(ogrenci.numara);
        System.out.println(ogrenci.babaAdi);
        System.out.println(ogrenci.anaAdi);
        System.out.println(ogrenci.dgumTarihi);
    }
     
    
     

   
}
