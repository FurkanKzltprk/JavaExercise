
package Interface;

public interface IKullanici {
    
//neden tek tek yazmadım da interface kullanarak
//diğer classlara implements ettim.
//bunun sebebi : interfaceler bir planlayıcı olarak düşünebilirsin
//bir boyama kitabının boyanmamış kısmı gibi ,
//sana bir iskelet sunar.interfaceler polymorphismle kullanıldığında 
//    bir demeti bağlayan lastik gibi düşünebilirsiniz.

    
            
    
    public void girisYap(String kullaniciAdi , String sifre);
    public void KayitOl();
    public void mesajGonder();
    
    
    
}
