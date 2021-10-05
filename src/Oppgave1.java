import java.util.NoSuchElementException;

public class Oppgave1 {
    public static int maks(int[]a) {
        if (a.length == 0) {
            throw new NoSuchElementException("Tabell kan ikke være tom");
        }
        for (int i = 0; i+1 < a.length;) {
            System.out.println(i);
            if (a[i] < a[i+1]) {
                a[i] = a[i+1];
                i = 0;
            } else {
                i = i + 1;
            }
            System.out.println(i);
        }
        return a[0];
    }
    public static int ombyttinger(int[]a) {
        if (a.length == 0) {
            throw new NoSuchElementException("Tabell kan ikke være tom");
        }
        int n=0;
        for (int i = 0; i+1 < a.length;) {
            if (a[i] < a[i+1]) {
                a[i] = a[i+1];
                i = 0;
                n++;
            } else {
                i++;
            }
            System.out.println(n);
        }
        return n;
    }

    public static void main(String[] args) {
        int[] a = {};
        int c=ombyttinger(a);
        System.out.println(c);
    }
}
