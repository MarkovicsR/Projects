import java.util.*;

public class Workshop0817 {

    public static void main(String[] args) {
        int[][] inputArray = new int[][] {{3, 1, 5}, {6, 5, 2}, {8, 4, 7}};
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray.length; j++) {
                System.out.println(inputArray[i][j]);
            }
        }
        System.out.println("After");
        int [] resultArray = minOfArrays(inputArray);
        for (int i = 0; i < resultArray.length; i++) {
            System.out.println(resultArray[i]);
        }

        int[] arrayOfNumbers = new int[]{1, 3, 2, 8, 4};
        System.out.println(toList(arrayOfNumbers));

        String textOne = "Something is about to go down";
        int minLength = 3;
        System.out.println(textOne);
        System.out.println(findLongWords(textOne, minLength));

        List<Integer> listOfNumbers = Arrays.asList(1, 3, 2, 8, 4);
        System.out.println(evensSorted(listOfNumbers));

        List<String> listOfWords = Arrays.asList("Apple", "Banana", "Apricot", "Coconut");
        System.out.println(listOfWords);
        System.out.println(removeWordsBeginingWithA(listOfWords));
    }

    public static int[] minOfArrays (int[][] inputArray) {
        int[] resultArray = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            int checkedNumber = inputArray[i][0];
            for (int j = 0; j < inputArray.length; j++) {
                if (inputArray[i][j] < checkedNumber) {
                    checkedNumber = inputArray[i][j];
                    resultArray[i] = checkedNumber;
                }
            }
        }
        return resultArray;
    }

    public static List<Integer> toList (int[] numbers) {
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            resultList.add(numbers[i]);
        }
        return resultList;
    }

    public static List<String> findLongWords (String text, int minLength) {
        List<String> resultList = new ArrayList<>();
        String[] arrayOfWords = text.split(" ");
        for (int i = 0; i < arrayOfWords.length; i++) {
            if (arrayOfWords[i].length() >= minLength) {
                resultList.add(arrayOfWords[i]);
            }
        }
        return resultList;
    }

    public static List<Integer> evensSorted (List<Integer> originalArray) {
        List<Integer> resultArray = new ArrayList<>();
        Collections.sort(originalArray);
        for (int i = 0; i < originalArray.size(); i++){
            if (originalArray.get(i) % 2 == 0) {
                resultArray.add(originalArray.get(i));
            }
        }
        return resultArray;
    }

    public static List<String> removeWordsBeginingWithA (List<String> originalList) {
        List<String> resultList = new ArrayList<>();
        for (int i = 0; i < originalList.size(); i++){
            if (originalList.get(i).toLowerCase(Locale.ROOT).charAt(0) != 'a') {
                resultList.add(originalList.get(i));
            }
        }
        return resultList;
    }
}
