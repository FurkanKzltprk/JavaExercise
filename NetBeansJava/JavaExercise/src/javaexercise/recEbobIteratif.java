package javaexercise;

public class recEbobIteratif {

    public static int ebobBul(int m, int n) {
        int ob = 1;
        for (int i = 2; i <= n; i++) {
            if (m % i == 0 && n % i == 0) {
                ob = i;

            }

        }
        return ob;

    }

    public static int recObeb(int m, int n) {

        if (n == 0) {
            return m;

        } else {
            return recObeb(n, m % n);
        }

    }

    public static void main(String args[]) {

        System.out.println("Iteratif yol ile ebob bulma  : " + ebobBul(24, 16));
        System.out.println("Rekursif yolla ile ebob bulma : " + recObeb(24, 16));

        System.out.println("Iteratif yol ile ebob bulma  : " + ebobBul(1001, 13));
        System.out.println("Rekursif yolla ile ebob bulma : " + recObeb(81, 33));

        
    }

}
