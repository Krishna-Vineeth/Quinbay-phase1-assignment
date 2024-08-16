import java.util.*;

public class TreeSetPractice {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Mango");
        treeSet.add("Orange");
        treeSet.add("Apple");

        System.out.println("TreeSet: " + treeSet);

        System.out.println("First Element: " + treeSet.first());

        System.out.println("Last Element: " + treeSet.last());

        treeSet.remove("Mango");

        System.out.println("TreeSet after removal: " + treeSet);

        System.out.println("Iterating through TreeSet:");
        for (String element : treeSet) {
            System.out.println(element);
        }
    }
}
