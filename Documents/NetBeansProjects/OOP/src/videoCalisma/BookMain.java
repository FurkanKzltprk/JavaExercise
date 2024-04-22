package videoCalisma;

public class BookMain {

    public static void main(String[] args) {
        Book b1 = new Book("poter", 400, "JJRowling", "Furkan");

        b1.setNumberOfPage(500);

        System.out.println(b1.getNumberOfPage());
        
        Book b2 = new Book("lord of ring", 500, "peter", "kodlama");
        b2.setName("Lord of the rings");
        System.out.println(b2.getName());

    }

}
