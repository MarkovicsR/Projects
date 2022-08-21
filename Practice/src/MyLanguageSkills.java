import java.util.*;

public class MyLanguageSkills {

    public static void main(String[] args) {
        Map<String, Integer> skillsMap = new HashMap<>();
        skillsMap.put("Java", 10);
        skillsMap.put("Ruby", 80);
        skillsMap.put("Python", 90);

        System.out.println(skillsMap);
        System.out.println(myLanguages(skillsMap));
    }

    public static List<String> myLanguages(final Map<String, Integer> results) {
        List<String> resultList = new ArrayList<>();
        for (int i = 100; i >= 60; i--) {
            for (Map.Entry<String, Integer> entry : results.entrySet()) {
                if (entry.getValue() == i) {
                    resultList.add(entry.getKey());
                }
            }
        }
        return resultList;
    }
}
