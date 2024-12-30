package calismaBireysel;

//Student classında oluşturduğumuz sınıfı burada tanımlıyoruz burası neresi?
//main kısmımız burada tanımlamamız gerkeiyor eylemleri burada gerçekleştireceğiz.
//artık her nesnee ürettiğimde counter otomatik(+1) artacak.
public class MainStudent {

    public static void main(String[] args) {
        System.out.println("Online ogrenci : " + Student.howStudent());
        Student s1 = new Student("Furkan", 444,90);
        Student s2 = new Student("Ayse", 555,80);
        Student s3 = new Student("Mehmet", 666,40);
        System.out.println("Online ogrenci : " + Student.howStudent());
        s1.exit();
        System.out.println("Online ogrenci : " + Student.howStudent());
        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(s1.id);
        System.out.println(s2.id);
        int[] notlar = new int[3];
        notlar[0] = s1.point;
        notlar[1] = s2.point;
        notlar[2] = s3.point;
        
        System.out.println("Ogrencilerin not ortalamasi : "+Student.calcOverall(notlar));
        
        
        
    }

}
