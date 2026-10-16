package collections;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {
    public static void main(String[] args) {

        Set<String> countries_set = new HashSet<>(
                Set.of("USA", "China", "Japan", "Germany", "France"));


        System.out.println("Size: " + countries_set.size());


        displaySet(countries_set);


        countries_set.remove("Germany");
        countries_set.add("Tunisia");
        displaySet(countries_set);


        countries_set.clear();
        System.out.println("Size after clear: " + countries_set.size());
    }

    private static void displaySet(Set<String> set) {
        for (String s : set) {
            System.out.println("- " + s);
        }
        System.out.println();
    }
}