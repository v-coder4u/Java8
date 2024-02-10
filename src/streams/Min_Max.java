package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Min_Max {
    public static void main(String[] args) {

        //min max of length of string
        List<String> list = Arrays.asList("Vaibhav", "Nikita", "Abhishek", "Amit", "Dhruv");
        Comparator<String> c = (a, b) -> {
            int l1 = a.length();
            int l2 = b.length();
//            if (l1 < l2) return -1;
//            else if(l1 > l2) return 1;
//            else return 0;
            return Integer.compare(l1,l2);
        };
        List<String> listAfterComparator = list.stream().sorted(c).collect(Collectors.toList());
        System.out.println(listAfterComparator);
        String minimum = list.stream().min(c).get();
        System.out.println(minimum);
        String maximum = list.stream().max(c).get();
        System.out.println(maximum);

        // min max of list of integer
        List<Integer> listOfIntegers = Arrays.asList(10,30,50,100,40,21,42,32,50);
        Integer min = listOfIntegers.stream().min((a,b) -> Integer.compare(a,b)).get();
        //using method reference
        Integer min1 = listOfIntegers.stream().min(Integer::compare).get();

        Integer max = listOfIntegers.stream().max((a,b) -> Integer.compare(a,b)).get();
        Integer max2 = listOfIntegers.stream().max(Integer::compare).get();

        System.out.println(listOfIntegers);
        System.out.println(min);
        System.out.println(min1);
        System.out.println(max);
        System.out.println(max2);
    }
}
