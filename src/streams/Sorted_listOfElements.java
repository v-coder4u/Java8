package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted_listOfElements {
    public static void main(String[] args) {
        List<Integer> marks = Arrays.asList(20 , 40 , 45 , 80 , 13 , 32 , 34 , 48);

        List<Integer> sortedMarks = marks.stream().sorted().collect(Collectors.toList());
        List<Integer> sortedMarks2 = marks.stream().sorted((a,b) -> a.compareTo(b)).collect(Collectors.toList());

        System.out.println(sortedMarks);
        System.out.println(sortedMarks2);
        // sort descending order.
        // customized sorting --> Comparator(FI) -> compare(obj1, obj2)
        // return -ve -> if obj1 has come before obj2
        // return +ve -> if obj1 has come after obj2
        // return 0 -> if obj1 and obj2 are equal

        // for descending order (a, b) -> (a < b) ? 1 : (a > b) ? - 1: 0

        List<Integer> sortedMarksUsingComparator = marks.stream().sorted( (a, b) -> (a < b) ? 1: (a > b) ? -1 : 0).collect(Collectors.toList());
        //or
        List<Integer> sortedMarksUsingComparator2 = marks.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        List<Integer> sortedMarksUsingComparator3 = marks.stream().sorted((a, b) -> b.compareTo(a)).collect(Collectors.toList());

        List<Integer> sortedMarksUsingComparator4 = marks.stream().sorted((a, b) -> -a.compareTo(b)).collect(Collectors.toList());

        System.out.println(sortedMarksUsingComparator);
        System.out.println(sortedMarksUsingComparator2);
        System.out.println(sortedMarksUsingComparator3);
        System.out.println(sortedMarksUsingComparator4);


        // sort string based on length of string
        List<String> list = Arrays.asList("Vaibhav", "Nikita", "Abhishek", "Amit", "Dhruv");
        Comparator<String> c = (a, b) -> {
            int l1 = a.length();
            int l2 = b.length();
//            if (l1 < l2) return -1;
//            else if(l1 > l2) return 1;
//            else return 0;
            return Integer.compare(l1,l2);
        };
        List<String> sortedList = list.stream().sorted(c).collect(Collectors.toList());
        List<String> sortedList2 = list.stream().sorted((a,b) -> Integer.compare(a.length(), b.length())).collect(Collectors.toList());
        List<String> sortedList3 = list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(sortedList);
        System.out.println(sortedList2);
        System.out.println(sortedList3);

        // sort string alphabetically
        List<String> sortedListAlphabetically = list.stream().sorted().collect(Collectors.toList());
        List<String> sortedListAlphabetically2 = list.stream().sorted((a,b) -> a.compareTo(b)).collect(Collectors.toList());
        List<String> sortedListAlphabetically3 = list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());

        System.out.println(sortedListAlphabetically);
        System.out.println(sortedListAlphabetically2);
        System.out.println(sortedListAlphabetically3);


        // reverse order
        List<String> sortedListAlphabeticallyReverse = list.stream().sorted((a,b) -> b.compareTo(a)).collect(Collectors.toList());
        List<String> sortedListAlphabeticallyReverse2 = list.stream().sorted((a,b) -> -a.compareTo(b)).collect(Collectors.toList());
        List<String> sortedListAlphabeticallyReverse3 = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println(sortedListAlphabeticallyReverse);
        System.out.println(sortedListAlphabeticallyReverse2);
        System.out.println(sortedListAlphabeticallyReverse3);
    }
}
