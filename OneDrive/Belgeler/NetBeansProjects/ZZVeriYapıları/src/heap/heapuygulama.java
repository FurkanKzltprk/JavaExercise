package yeni_dernek;

//Heap’te karakter olarak tutulan iki dizinin 
//ortak elemanlarını gösteren metod

// Parametre olarak gelen dizinin ternary heap kontrolünün yapılması

//Heap eleman yapısı
class Eleman{
    int sayi;
    public Eleman(int sayi) {
        this.sayi = sayi;
    }}
//******************************************************************************
//Heap sınıfı
class heap{
    Eleman[]dizi;
    int N;
    int adet;
   //Kurucu metot
    public heap(int N) {
        dizi=new Eleman[N];
        this.N=N;
        adet=0; }
    //Heap boş mu
    boolean bosmu(){ return adet==0; }
    //Heap dolu mu
    boolean dolumu(){return adet==N;}
    //Eleman ekleme
    void ekle(Eleman yeni){
        adet++;
        dizi[adet-1]=yeni;
        yukariCik(adet-1); }
    //Ekleme işleminden sonra heap yapısını yeniden düzenleme
    void yukariCik(int no){
        int ustdal=(no-1)/2;
        while(ustdal>=0 && dizi[ustdal].sayi<dizi[no].sayi){
            Eleman ara=dizi[ustdal];
            dizi[ustdal]=dizi[no];
            dizi[no]=ara;
            no=ustdal;
            ustdal=(no-1)/2; }}
    //Eleman silme Enbüyük eleman (kök düğüm)
    Eleman azamiDondur(){
        Eleman tmp=dizi[0];
        dizi[0]=dizi[adet-1];
        asagiIn(0);
        adet--;
        return tmp; }
    // Silme işleminden sonra heap yapısını tekrar düzenleme
    void asagiIn(int no){
        int sol=2*no+1;
        int sag=2*no+2;
        while((sol<adet && dizi[no].sayi<dizi[sol].sayi)||
                (sag<adet && dizi[no].sayi<dizi[sag].sayi)){
            if(sag>=adet || dizi[sol].sayi>dizi[sag].sayi){
              Eleman ara=dizi[no];
              dizi[no]=dizi[sol];
              dizi[sol]=ara;  
              no=sol;}
            else{
               Eleman ara=dizi[no];
              dizi[no]=dizi[sag];
              dizi[sag]=ara;     
              no=sag;
            }
            sol=2*no+1;
            sag=2*no+2;  }}
    //Heap dizisini göster
   void heapgoster(){
       for(int i=0;i<adet;i++)
           System.out.print(dizi[i].sayi+" "); }}

//******************************************************************************
public class heapuygulama {
//Verilen bir dizi heap mi?
static boolean heapMi(int[]d,int n){
    for(int i=0;i<=(n-2)/2;i++){
        if(d[2*i+1]>d[i])
            return false;
        if(2*i+2<n && d[2*i+2]>d[i])
            return false;
    }
    return true; }


//Max_Heapsort algoritması
static int[] heapsort(int[]d){
    int[]s=new int[d.length];
    heap h=new heap(d.length);
    for (int i = 0; i < s.length; i++) 
        h.ekle(new Eleman(d[i]));
    for (int i = 0; i < s.length; i++) 
        s[i]=h.azamiDondur().sayi;
    return s;
}

static void ortak_eleman_bul(char []d1, char []d2){
    for (int i = 0; i < d1.length; i++) {
        for (int j = 0; j < d2.length; j++) {
            if(d1[i]==d2[j]){
            System.out.println(""+d1[i]);
            break;}
        }
    }
}


public static void main(String[] args) {
        heap h=new heap(20);
        h.ekle(new Eleman((int)'a'));
        h.ekle(new Eleman(2));
        h.ekle(new Eleman(1));
        h.ekle(new Eleman(15));
        h.ekle(new Eleman(4));
        h.ekle(new Eleman(45));
        h.heapgoster();
        System.out.println("");

        int[]dizi={90,15,10,7,12,2,7,3};
        int n=dizi.length;
        if(heapMi(dizi, n)) // maxHeap()
            System.out.println("\nHeap");
        else 
            System.out.println("Heap değil");
        int []d={15,23,44,55,67,48,32,95,2,8};
        int [] s=heapsort(d);
        System.out.println("");
        for (int i = 0; i < s.length; i++){
            System.out.print(s[i]+"\t");}
        System.out.println("\n");
              
        //char dizileri
        char dizi1[]={'a','b','c','d','e'};
        char dizi2[]={'d','e','f','g'};
        ortak_eleman_bul(dizi1,dizi2);
        
        System.out.println((int)'a');// 65=A 97=a
}}





