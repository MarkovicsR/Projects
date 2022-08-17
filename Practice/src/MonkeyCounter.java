public class MonkeyCounter {

    public static void main(String[] args) {
        int n = 10;
        int[] countedMonkeys = monkeyCount(n);
        for (int i = 0; i < countedMonkeys.length; i++) {
            System.out.println(countedMonkeys[i]);
        }
    }

    public static int[] monkeyCount(final int n) {
        int[] monkeyArray = new int[n];
        for (int i = 1; i <= n; i++) {
            monkeyArray[i - 1] = i;
        }
        return monkeyArray;
    }
}
