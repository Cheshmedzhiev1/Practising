package practising.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamIntermediateOps {
    public static void main(String[] args) {

        List<List<String>> listOfLists = Arrays.asList(                         //list of lists of names
                Arrays.asList("Reflection", "Collection", "Stream"),
                Arrays.asList("Structure", "State", "Flow"),
                Arrays.asList("Sorting", "Mapping", "Reduction", "Stream")
        );

        //creating a set to hold the intermediate results
        Set<String> intermediateResults = new HashSet<>();

        //creating a stream pipeline demonstrating various intermediate operations

        List<String> results = listOfLists.stream()
                .flatMap(List::stream)    //flattens the nested lists into a single stream of lists
                .filter(s -> s.startsWith("S"))   //to only include the strings that starts with "S"
                .map(String::toUpperCase)  //converts each string in the stream to uppercase
                .distinct() //removes any duplicate strings
                .sorted()//sorts the resulting strings alphabetically
                .peek(s -> intermediateResults.add(s))//adds each processed element to IntermediateResults
                .collect(Collectors.toList()); //collects all final processed strings into a list called result
        System.out.println("Intermediate results:");    //printing intermediate results
        intermediateResults.forEach(System.out::println);

        //printing the final result
        System.out.println("Final result:");
        results.forEach(System.out::println);
    }
}
