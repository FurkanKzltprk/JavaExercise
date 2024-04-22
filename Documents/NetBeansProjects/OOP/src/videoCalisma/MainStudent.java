package videoCalisma;

public class MainStudent {

    public static void main(String[] args) {

        
        Student s1 = new Student("Furkan", 2351,90);
        Student s2 = new Student("Ayse", 820,100);
        Student s3 = new Student("Mehmet", 245,60);
        
        System.out.println("Online ogrenci : " +Student.howStudent());

        
        int[] notlar = new int [3];
        notlar[0]=s1.point;
        notlar[1]=s2.point;
        notlar[2]=s3.point;
        
        System.out.println(Student.calcOverall(notlar));
    }

}
