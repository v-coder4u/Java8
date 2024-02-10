package streams;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class Interview_FindMaxSalary {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date joiningDateVaibhav = simpleDateFormat.parse("01-10-2018");
        Date joiningDateNikita = simpleDateFormat.parse("01-07-2018");
        Date joiningDateAmit = simpleDateFormat.parse("01-10-2018");
        Date joiningDateAbhishek = simpleDateFormat.parse("01-10-2018");
        Date joiningDateDhruv = simpleDateFormat.parse("07-10-2018");

        List<Employee> employeeList = Arrays.asList(
                new Employee("Vaibhav", 50000.0, joiningDateVaibhav, "M"),
                new Employee("Nikita", 40000.0, joiningDateNikita, "F"),
                new Employee("Amit", 60000.0, joiningDateAmit, "M"),
                new Employee("Abhishek", 70000.0, joiningDateAbhishek, "M"),
                new Employee("Dhruv", 69000.0, joiningDateDhruv, "M")
        );

        Double maxSalary = employeeList.stream().max((a, b) -> Double.compare(a.getSalary(),b.getSalary())).get().getSalary();
        Double maxSalary2 = employeeList.stream().max(Comparator.comparingDouble(Employee::getSalary)).get().getSalary();
        System.out.println(maxSalary);
        System.out.println(maxSalary2);

        // second highest ??

        Employee employees = employeeList.stream()
                .sorted((a,b) -> Double.compare(b.getSalary(),a.getSalary()))
                .skip(1)
                .findFirst()
                .get();

        System.out.println("second highest salary: " + employees.getSalary());

        // using optional

        Optional<Employee> listEmployee = employeeList.stream().sorted((a, b) -> Double.compare(b.getSalary(), a.getSalary())).skip(1).findFirst();
        listEmployee.ifPresent(System.out::println);



        // find most senior based on joining date

        Optional<Employee> seniorEmployee = employeeList.stream().sorted((a,b) -> a.getJoiningDate().compareTo(b.getJoiningDate())).findFirst();
        seniorEmployee.ifPresent(System.out::println);

        Optional<Employee> seniorEmployee2 = employeeList.stream().min((a , b) -> a.getJoiningDate().compareTo(b.getJoiningDate()));
        seniorEmployee2.ifPresent(System.out::println);

        Optional<Employee> seniorEmployee3 = employeeList.stream().min(Comparator.comparing(Employee::getJoiningDate));
        seniorEmployee3.ifPresent(System.out::println);




        // Count Employee based on gender
        Map<String, Long> countEmployee = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(countEmployee);
    }
}