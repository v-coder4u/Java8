package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter_EvenNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 10, 15, 20);
        List<Integer> filteredList = list.stream().filter(i -> i % 2 == 0 ).collect(Collectors.toList());
        System.out.println(filteredList);
    }
}
