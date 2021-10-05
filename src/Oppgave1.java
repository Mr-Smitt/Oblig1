
public class Oppgave1 {
    public static int maks(int[]a) {
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
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        int b=maks(a);
        System.out.println(b);
    }
}
