
package javaexercise;


public class diziYazdirmaRekursif {
    public static void diziYazdir (int [] dizi , int index){
        if (index == dizi.length) {
            return;
            
        }else{
            System.out.print(dizi[index]+"/");
            diziYazdir(dizi, index+1);
            
        }
        
    }
    public static void main(String[] args) {
        int dizi [] = {18,23,33,46,5,6,99};
        diziYazdir(dizi, 0);
    }
    
    
}
