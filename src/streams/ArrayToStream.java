package streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayToStream {
    public static void main(String[] args) {
        // 2 ways
        //Stream.of(args) -> args should be any type either arrays or any other group of elements
        Integer[] arr = {20, 24, 43, 34, 45};
        Arrays.stream(arr).filter(i -> i % 2 == 0).forEach(System.out::println);

        Stream<?> item = Stream.of(9,6,3,56,3,23,562, "a", "b");
        item.map(i -> i + ":v")
                .forEach(System.out::println);
    }
}
