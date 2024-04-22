package calismaBireysel;

//bir öğrenci sınıfı oluşturduk bir öğrencinin neyi olur ? 
//ismi(name),numarası(id),notu(point), bunlar olsun şimdilik. bir sınıf oluşturduk Student(öğrenci).
//constructor metod oluşturduk:Student.
//her öğrenci nesnesi oluşturulduğunda bana sayacı   arttırmasını istiyorum.
//ama bu diğerleri gibi olmayacak global olacak, public name ve id kısmı dinamik olarak 
//ogrenciden ogrenciye değişiyor ama benimm yapacağım sayac öyle olmamalı.
//yani aliye ait sayac ayşeye ait sayac olur eğer diğerleri gibi yaparsam o zaman da sayac
// hep 1 veya 0 olur . mantığa ters. bunun için bunlardan bağımsız olmalı. bunu için de 
// STATİC dediğimiz kısım devreye giriyor. 
//ogrencilerin notlarını aldık. diziye attık ve bunların ortalamasını da aldık
//bunu da farklı bir metod ile yaptık.

public class Student {

    public String name;
    public int id,point;
    private static int counter = 0;

    Student(String name, int id,int point) {
        this.name = name;
        this.id = id;
        this.point=point;
        Student.counter++;     //bunu buraya yazma sebebim: burada nesne (constructor) oluşuyor her bir öğrenci için.
                                //bundan dolayı her nesne oluştuğunda benim bu sayacı arttırmam lazım.

    }

    public void exit() {//ogrenci çıkış yaptığında sayac 1 azalacak ,
                        //amacım sistemdeki ogrenci sayisini bulmak zaten.
                        //bu metodlada onu yapacağım.

        Student.counter--;

    }
    public static int howStudent(){  // bu metod da kaç tane öğrenci var onu bana gösterecek.
                                     // asıl sonucu aldığım yer burası zaten.
        
        return Student.counter;
    }
    
    public static double calcOverall(int [] arr){
        double overall = 0;
        for (int i = 0; i < arr.length; i++) {
            overall += arr[i];
                
            
        }
        return overall / arr.length;
    }
    

}
