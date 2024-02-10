package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Count_FailedStudents {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(20 , 40 , 45 , 80 , 13 , 32 , 34 , 48);
        List<Integer> failedStudentList = list.stream().filter(i -> i < 33).collect(Collectors.toList());
        System.out.println(failedStudentList);
        long count = list.stream().filter(i -> i < 33).count();
        System.out.println("Number of failed students are: " +  count);
    }
}
