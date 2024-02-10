package streams;

import java.util.Arrays;
import java.util.List;

public class ForEach_ {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 30, 23, 90, 32, 100);
        list.stream().forEach(i -> System.out.println(i));
        // or using method reference
        list.stream().forEach(System.out::println);
        // as we are not performing an action we can directly use for each
        list.forEach(System.out::println);
    }
}
