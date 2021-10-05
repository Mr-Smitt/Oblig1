
public class Oppgave1 {
    public static int ombyttinger(int[]a) {
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
        int[] a = {1, 2, 3, 4, 5};
        int c=ombyttinger(a);
        System.out.println(c);
    }
}
