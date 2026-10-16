package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestArrayList {
    public static void main(String[] args) {

        List<String> countries_list = new ArrayList<>(
                List.of("USA", "China", "Japan", "Germany", "France"));


        System.out.println("Size: " + countries_list.size());


        displayList(countries_list);


        countries_list.set(3, "Tunisia");
        displayList(countries_list);


        Collections.sort(countries_list);
        displayList(countries_list);


        countries_list.clear();
        System.out.println("Size after clear: " + countries_list.size());
    }

    private static void displayList(List<String> list) {
        for (String s : list) {
            System.out.println("- " + s);
        }
    }
}