public class SortingFlowchart {

    public static void main(String[] args) {

        int[] arrayOne = new int[]{1, 2, 56, 32, 51, 2, 8, 92, 15};
        int[] arrayTwo = new int[]{1, 2, 4, 7, 11, 22, 38, 42, 43};
        int value = 3;

        printIntArray(arrayOne);
        printIntArray(bubbleSort(arrayOne));
        printIntArray(arrayTwo);
        System.out.println(binarySearch(arrayTwo, value));
    }

    public static void printIntArray(int[] arrayToPrint) {
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.println(arrayToPrint[i]);
        }
    }

    public static int[] bubbleSort(int[] arrayToSort) {
        int n = arrayToSort.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arrayToSort[j] > arrayToSort[j + 1]) {
                    int a = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[j+1];
                    arrayToSort[j + 1] = a;
                }
            }
        }
        return arrayToSort;
    }

    public static int binarySearch (int[] arrayToCheck, int value) {
        //int start = 0;
        int end = arrayToCheck.length;

        for (int start = 0; start <= end; start++) {
            int mid = (start + end) / 2;
            if (arrayToCheck[mid] == value) {
                return mid;
            } else if (arrayToCheck[mid] > value){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
