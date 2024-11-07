
package stack2liste;


public class StackYapisi {
    int size;
    int cnt;

    Node top ; // en üst düğümü tutan gösterici head gibi düşünebilrsin.
    
    
    public StackYapisi(int size) {
        this.size = size;
       cnt = 0;   
       top = null;
    }
    
    void push(int data){   //ekleme
        Node eleman = new Node(data);
            if(isFull()){
                System.out.println("stack dolu, ekleme yapilamadi !! ");
            }
            else 
            {
                if(isEmpty())
                {
                    top=eleman;
                    System.out.println(top.data+" stacke ilk eleman olarak eklendi");
                    
                    
                }
                else {
                    eleman.next=top;
                    top = eleman;
                    System.out.println(top.data+ " stacke eklendi !");
                    
                }
                cnt++;
            }
        
        
    }
    
    void pop(){
        if(isEmpty()){
            
            System.out.println("stack bos , cikarticak bir sey yok");
        }
        else {
            System.out.println(top.data + " cikartildi");
            top =top.next;   
            cnt--;
        }
        
        
    }
    
    void print()
    {
        if(isEmpty()){
            System.out.println("Stack bos yazdirilacak bir sey yok .");
        }else{
            Node temp = top;
            
            while (temp != null){
                System.out.println(temp.data);
                temp = temp.next;
                
            }
            System.out.println("\n");
        }
    }
    
    void showTop ()
    {
     if(isEmpty()){
         System.out.println("stack bos");
         
     }   
     else {
         System.out.println("en ustteki dugumun datasi "+ top.data);
         
     }
        
        
        
        
    }
    
    
    
    
    boolean isFull(){
        
        return cnt == size; 
    }
    
    boolean isEmpty(){
        
        return cnt==0;
    }
}
