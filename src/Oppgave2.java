public class Oppgave2 {
    public static int antallUlikeSortert(int[]a) {
        for (int o=0; o+1 < a.length; o++) {
            if (a[o]>a[o+1]){
                throw new IllegalStateException("Tabellen må være sortert");
            }
        }
        int n = 1;
        for (int i=0; i+1 < a.length; i++) {
            if (a[i] == a[i+1]) {
            }
            else {
                n++;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        int[] a={1,1,2,2,4,4,5,5,6,6,7,7,8};
        int b =antallUlikeSortert(a);
        System.out.println(b);
    }
}
