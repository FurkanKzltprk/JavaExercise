package javaexercise;

public class recKarSayiBul {

    public static int karsay(String S, char c, int i) {
        if (i == S.length()) {
            return 0;

        } else if (S.charAt(i) == c) {
            return 1 + karsay(S, c, i + 1);
        } else {

            return 0 + karsay(S, c, i + 1);

        }

    }

    public static void main(String args[]) {

        String S = "bilgisayarMuhendisligi";
        char c = 'i';

        int sayac = karsay(S, c, 0);

        System.out.println(" " + c + " karakteri metinde " + sayac + " kere geciyor");

    }
}
