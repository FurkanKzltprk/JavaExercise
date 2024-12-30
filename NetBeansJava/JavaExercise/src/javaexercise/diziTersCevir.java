
package javaexercise;


public class diziTersCevir {
    public static void diziyiTersCevir(int []dizi ,int baslangıc , int bitis ){
        if (baslangıc >= bitis) {
            return;
            
        }else{
            int temp = dizi[baslangıc];
            dizi[baslangıc] =dizi[bitis];
            dizi[bitis]=temp;
            diziyiTersCevir(dizi, baslangıc+1, bitis-1);
        }
    }
    public static void main(String[] args) {
        int [] dizi = {11,23,43,65,99};
        diziyiTersCevir(dizi, 0, dizi.length-1);
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i]+ " ");
            
        }
    }
    
}
