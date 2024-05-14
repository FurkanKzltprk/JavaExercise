package AlgoDersKalitim;
//eğer bir sınıf üst sınıftaki bir metodu kullanmayacaksa
// aynı isimli aynı parametere sayısı ve aynı paramter 
// tiplerine sahip yeni bir metot tanımlayabiilir 
// Buna override yani geçersiz kılma diyoruz .

//Sınıfı final yapılırsa miras yani extend edilemezse
// metod final olursa override edilmezse
// değişken final olursa bu da sabit olur.


//NOT : javada bütün sınıfların atası OBJECT sınıfıdır .
// bir sınıfta extend yapmsaan bile object sınıfından miras alır.

class B {

    public void p(double i) {
        System.out.println(i * 2);
    }
}

class A extends B {

    @Override
    public void p(double i) {
        System.out.println(i);  // buradaki p yi çağırdı
        super.p(i); //yeni sınıftaki update böyle yapılıyor.
    }
}
public class Kalitim3{
    public static void main(String[] args) {
        A a = new A();
        a.p(4);
    }
}
