
package Inheritance;


public class Main {
    public static void main(String[] args) {
        Calisan c = new Calisan();
        c.giris(); // bu metod calisan classinda var.
        
        
        Akademisyen a = new Akademisyen();
        a.giris();  //bu metod akademisyende yok ama
                    //extends yani kalıtım aldıgımız 
                    // classda var 
    }
    
}
