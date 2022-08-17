import java.lang.reflect.Array;
import java.util.Arrays;

public class tripletSum {

    public static void main(String[] args) {
        int[] arrayOne = new int[]{ 3, 2, 6, 8, 2, 3, 8};
        for (int num : arrayOne) {
            System.out.println(num + " ");
        }
        System.out.println(maxTriSum(arrayOne));
    }

    public static int maxTriSum (int[] numbers) {
        int result = 0;
        Arrays.sort(numbers);
        int[] arrayWithoutDuplicates = removeDuplicates(numbers);
        for (int i = arrayWithoutDuplicates.length - 3; i < arrayWithoutDuplicates.length; i++){
            result += arrayWithoutDuplicates[i];
        }
        return result;
    }

    public static int[] removeDuplicates (int[] originalArray) {
        int[] resultArray = new int[originalArray.length];
        int resultArrayIndex = 0;
        for (int i = 0; i < originalArray.length - 1; i++){
            if (originalArray[i] != originalArray[i + 1]){
                resultArray[resultArrayIndex] = originalArray[i];
                resultArrayIndex++;
            }
        }
        return resultArray;
    }
}
