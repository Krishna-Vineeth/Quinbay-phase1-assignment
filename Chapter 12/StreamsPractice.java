import java.util.*;
import java.util.stream.*;

public class StreamsPractice {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("krishna", "krishna", "vineeth", "balaji", "ashok", "poojith", "vaishnavi");

        List<String> filter1 = names.stream().filter(name -> name.startsWith("k"))
                                             .collect(Collectors.toList());

        System.out.println("Names starting with k: " + filter1);

        List<String> upperCaseNames = names.stream()
                                           .map(String::toUpperCase)
                                           .collect(Collectors.toList());

        System.out.println("Names in uppercase: " + upperCaseNames);

        List<String> sortedNames = names.stream()
                                        .sorted()
                                        .collect(Collectors.toList());

        System.out.println("Sorted names: " + sortedNames);

        long count = names.stream()
                          .filter(name -> name.length() > 5)
                          .count();

        System.out.println("Number of names with length greater than 5: " + count);

        String combinedNames = names.stream()
                                    .collect(Collectors.joining(", "));

        System.out.println("Combined names: " + combinedNames);
    }
}
