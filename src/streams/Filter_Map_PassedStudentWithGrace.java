package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter_Map_PassedStudentWithGrace {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(20, 40, 45, 80, 13, 32, 34, 48);
        List<Integer> passedFilterList = list.stream().filter(i -> i > 33).collect(Collectors.toList());
        System.out.println(passedFilterList);

        // if we want to give 5 grace marks to the students who all are not passed
        List<Integer> mappedGraceMarksList = list.stream().filter(i -> i < 33).map(j -> j += 5).collect(Collectors.toList());
        System.out.println(mappedGraceMarksList);
    }
}
