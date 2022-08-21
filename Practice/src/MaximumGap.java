import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximumGap {

    public static void main(String[] args) {
        int[] numbers = new int[]{8, 2, 4, 3, 15};
        System.out.println(maxGap(numbers));
    }

    public static int maxGap(int[] numbers) {
        int maxGap = 0;
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length - 1; i++) {
            int gapCounter = numbers[i + 1] - numbers [i];
            if (maxGap < gapCounter) {
                maxGap = gapCounter;
            }
        }
        return maxGap;
    }
}
