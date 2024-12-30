
package palindrom_kelime_yapisi;


public class Stack_yapisi {
    Node top;
    int size;
    int cnt;

    public Stack_yapisi(int size) {
        this.size = size;
        cnt = 0;
        top=null;
    }
    
    void push(char ch)
    {
        if(!isFull()){
          Node eleman = new Node(ch);
          
            if (isEmpty()) {
                top = eleman;
               
            }else{
               eleman.next=top;
               top=eleman;
            }
            cnt++;
        }
    }
    
    char pop (){
        if(!isEmpty()){
            char harf = top.harf;
            top = top.next;
            cnt--;
            return harf;
             
        }else {
            return '-';
        }
        
        
    }
    
    boolean isEmpty(){
      return  cnt ==0;
    }
    boolean isFull(){
      return cnt == size;
    }
    
}
