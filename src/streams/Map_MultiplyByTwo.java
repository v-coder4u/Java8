package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map_MultiplyByTwo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 10, 15, 20);
        List<Integer> mappedList = list.stream()
                                        .map(i-> i * 2)
                                            .collect(Collectors.toList());
        System.out.println(mappedList);
    }
}
