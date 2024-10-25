
package dizi_ekle_yazdir;

import java.util.Scanner;


public class Dizi_ekleme {
    public static void main(String[] args) {
        Dizi dizi = new Dizi(5);
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Eklemek istediğiniz kelimeyi giriniz : ");
        String kelime = scan.nextLine();
        dizi.ekle(kelime);
        System.out.print("Dizideki elemanlar:");
        dizi.yazdir();
        
        scan.close();
    }
    
}
