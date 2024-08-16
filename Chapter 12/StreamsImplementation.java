import java.util.*;
import java.util.stream.*;


public class StreamsImplementation {
    public static void main(String[] args) {
        
        List<String> coffee = List.of("Cappuccino", "Americano", "Espresso", "Cortado", "Mocha","Cappuccino", "Flat White", "Latte");
        List<String> result = coffee.stream().filter(s -> s.endsWith("o"))
                                                        .sorted()
                                                        .distinct()
                                                        .collect(Collectors.toList());
        System.out.println(result);
    }
}