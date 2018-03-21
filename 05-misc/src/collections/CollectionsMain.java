package collections;

import java.util.*;

public class CollectionsMain {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(); // it's always better to use the
        list.add("string 1");                  // abstraction (List interface)
        list.add("string 2");                  // as a reference to the ArrayList
        list.add("string 3");

        Iterator<String> iterator = list.iterator(); // Iterator is a facility
        while(iterator.hasNext()) {                  // Java gives you to navigate
            System.out.println(iterator.next());     // through collections
        }

        list.get(2); // and you can also access elements like this

        Map<String, String> dictionary = new HashMap<>(); // HashMaps are like dictionaries
        dictionary.put("key-1", "value-1");               // You can use them to store values
        dictionary.put("key-2", "value-2");               // and give them specific keys
        dictionary.put("key-3", "value-3");               // so that you can get to them faster
        dictionary.put("key-4", "value-4");               // when you need them

        System.out.println(dictionary.get("key-1"));
        System.out.println(dictionary.get("key-2"));
        System.out.println(dictionary.get("key-3"));
    }

}
