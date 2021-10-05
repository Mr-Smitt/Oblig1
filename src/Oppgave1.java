import java.util.NoSuchElementException;

public class Oppgave1 {
    public static int maks(int[]a) {
        if (a.length == 0) {
            throw new NoSuchElementException("Tabell kan ikke være tom");
        }
        for (int i = 0; i+1 < a.length; i++) {
            if (a[i] > a[i+1]) {
                a[i+1] = a[i];
            }
        }
        return a[a.length-1];
    }
    public static int ombyttinger(int[]a) {
        if (a.length == 0) {
            throw new NoSuchElementException("Tabell kan ikke være tom");
        }
        int n=0;
        for (int i = 0; i+1 < a.length; i++) {
            if (a[i] > a[i+1]) {
                a[i+1] = a[i];
                n++;
            }
            System.out.println(n);
        }
        return n;
    }

    public static void main(String[] args) {
        int[] a = {5,4,3,2,1};
        int c=ombyttinger(a);
        System.out.println(c);
    }
}
