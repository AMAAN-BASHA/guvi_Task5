import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentsGifts {//progam to filter the studends name starting with "A";
    public static void main(String[] args) {
        // Create a list of student names
        List<String> students = Arrays.asList("Amaan","Basha","Guvi","Aarya","Surya","Vijay","Alan","Rajesh","kishore","Adam");

        // Filter students whose names start with "A"
        List<String> filteredStudents = students.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        // Output the list of filtered student names
        filteredStudents.forEach(System.out::println);
    }
}
