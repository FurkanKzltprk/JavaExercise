
package Inheritance;


public class Main {
    public static void main(String[] args) {
//        Calisan c = new Calisan();
//        c.giris(); // bu metod calisan classinda var.
//        
//        
//        Akademisyen a = new Akademisyen();
//        a.giris();  //bu metod akademisyende yok ama
//                    //extends yani kalıtım aldıgımız 
//                    // classda var 
//
//                    
//         Memurlar m = new Memurlar();
//         m.giris();//bu metod akademisyende yok ama
//                    //extends yani kalıtım aldıgımız 
//                    // classda var 
//                    
//        System.out.println(Akademisyen.giris());


//            Asistan a = new Asistan();
//            
//            a.derseGir(); //burada calisti
//            
//            OgretimUyesi o = new OgretimUyesi();
//            
//            o.derseGir(); // burdada calisti.
//            

         Calisan c = new Calisan("Ahmet Kizil", "a.1@gmail.com", "0543120432");
         Akademisyen a = new Akademisyen("Ceng", "Prof", "BMÜ160", "Furkan", "Furkan.@gmail.", "12730192");
         System.out.println(a.getAdSoyad());
         
         OgretimUyesi o = new OgretimUyesi("EEM", "Hoca", "EEM102", "MEHMET kaya", "dsad.q@gmail.com", "1328123");
         System.out.println(o.getBolum());
         o.giris();
        
    }
    
}
