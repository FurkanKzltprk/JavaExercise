package ListeYapisi;

public class ListeYapisi {

    
    Node tail = null;
    Node head = null;
    
    
    void ekle(int x) {
        Node eleman = new Node();

        eleman.data = x;
        eleman.next = null;
        
        if (head == null) {
            head = eleman;
            tail = eleman;
            System.out.println("liste olusturuldu ve ilk dugum (obje) eklendi ");
            
        }
        else {
            tail.next = eleman;
            tail= eleman;
            System.out.println("Listenin sonuna yeni bir eleman eklendi.");
            
        }

    }
    void yazdir (){
        
        if(head == null) {
            System.out.println("Liste yapısı boş.");
            
        }else {
            
            Node temp = head;
            System.out.print("\nbas-> ");
            while(temp!=null)
            {
                System.out.print(temp.data + " -> ");
                
                temp = temp.next;
                
            }
            System.out.print("son.");
        }
        
    }
   

}


