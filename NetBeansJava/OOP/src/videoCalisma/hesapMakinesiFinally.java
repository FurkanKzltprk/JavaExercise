
package videoCalisma;


public class hesapMakinesiFinally {
    public int sayi1 ;
    public int sayi2 ;
    public String renk;
   final static double PI = 3.14;
    
    hesapMakinesiFinally (int sayi1 , int sayi2 , String renk){
        this.sayi1 = sayi1;
        this.sayi2 = sayi2;
        this.renk = renk;
      
    }
    
    public int toplama (){
        return this.sayi1 -this.sayi2;
        
    }
    public int cikarma (){
        return this.sayi1-this.sayi2;
    }
    public int carpma (){
        return  this.sayi1*this.sayi2;
    }
    public int bolme (){
        return this.sayi1/this.sayi2;
    }
    public double area (int r){
        return hesapMakinesiFinally.PI *(Math.pow(r, 2));
    }
            
    
}
