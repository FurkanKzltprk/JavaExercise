
package videoCalisma;


public class Book {
    public String name,author,publisher;
    public int numberOfPage;
    
    Book(String name, int numberOfPage,String author, String publisher){
        this.name=name;
        this.numberOfPage=numberOfPage;
        this.author=author;
        this.publisher=publisher;
        
        if(numberOfPage <1 ){
            this.numberOfPage =10;
            
        }else{
            this.numberOfPage = numberOfPage;
        }
    }
    public int getNumberOfPage(){
        return this.numberOfPage;
    }
     public void setNumberOfPage(int size){
         if(size<1){
             System.out.println("Sayfa sayisi negatif olamaz.");
             this.numberOfPage = 10;
         }else{
             this.numberOfPage= size;
         }
       
    }
     public String getName(){
           return this.name;
       }
     public void setName(String name){
         this.name = name;
     }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    
}
