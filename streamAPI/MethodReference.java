package streamAPI;

import java.util.Arrays;
import java.util.List;

public class MethodReference {
    public static void main(String[] args) {
        List<String> names=Arrays.asList("Navin","Harsh","John");

        List<String> uNames=names.stream()
                                .map(name->name.toUpperCase())  // will give a Stream containing upper case names
                                .toList();  // convert to list

        System.out.println(uNames);


        // Method Referencing
         List<String> uNames1=names.stream()
                                .map(String::toUpperCase)  // we are just calling a function toUpperCase - just write the method name, not even the brackets. String denotes where toUpperCase function belongs to.
                                // :: denotes the Referencing (belongs to)
                                // toUpperCase function belongs to String
                                .toList();  // convert to list
        
        System.out.println(uNames1);

        
        uNames.forEach(System.out::println);    // println belongs to System.out
        
    }
}
