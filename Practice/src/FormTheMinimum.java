import java.util.Arrays;

public class FormTheMinimum {

    public static void main(String[] args) {
        int[] integerArray = new int[] {1, 9, 3, 1, 7, 4, 6, 6, 7};
        System.out.println(minValue(integerArray));
    }

    public static int minValue(int[] values){
        StringBuilder sb = new StringBuilder();
        Arrays.sort(values);

        for (int i = 0; i < values.length - 1; i++) {
            if (values[i] < values[i + 1]) {
                sb.append(values[i]);
            }
        }
        sb.append(values[values.length - 1]);
        return Integer.parseInt(sb.toString());
    }
}
