package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {
        List<String> names=Arrays.asList("Navin","Lakshmi","John","Kishor");

        Optional<String> name=names.stream()
                         .filter(str -> str.contains("x")) 
                         .findFirst();  // does not return String -> Returns Optional -> to deal with Null Pointer Exception

        // System.out.println(name.get()); // will give Null Pointer exception
        System.out.println(name.orElse("Not found"));   // will give Not found if element not found

        String name1=names.stream()
                         .filter(str -> str.contains("x")) 
                         .findFirst()   // returns optional
                         .orElse("Not Found");  // retrieving string from optional
        System.out.println(name1);
    }
}
