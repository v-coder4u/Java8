package streams;

import java.util.Arrays;
import java.util.List;

public class StreamToArray {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(20 , 40 , 45 , 80 , 13 , 32 , 34 , 48);
        Integer[]arr = list.stream().toArray(Integer[]::new);
        for(int val: arr) {
            System.out.println(val);
        }

    }
}
