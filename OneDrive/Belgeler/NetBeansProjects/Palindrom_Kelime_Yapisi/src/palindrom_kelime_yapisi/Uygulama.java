package palindrom_kelime_yapisi;

import java.util.Scanner;

public class Uygulama {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack_yapisi st = new Stack_yapisi(100);
        Queue_yapisi qu = new Queue_yapisi(100);

        String kelime;
        System.out.println("kelime girin : ");
        kelime = scan.nextLine();
        int n = kelime.length();
       
        char[] harfler =kelime.toCharArray();
        int i = 0;
        
        while(i<n)
        {
            
            st.push(harfler[i]);
            qu.enQueue(harfler[i]);
            i++;
        }
        boolean sonuc = true;
        
        while(!st.isEmpty())
        {
            if(st.pop()!= qu.deQueue()){
                sonuc = false;
                break;
            }
        }
        if(sonuc){
            System.out.println(kelime +" palindromdur");
        }
        else{
            System.out.println(kelime + " palindrom degildir.");
        }

    }

}
