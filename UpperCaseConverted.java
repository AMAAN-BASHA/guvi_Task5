import java.util.Scanner;
import java.util.stream.Stream;
public class UpperCaseConverted {//program to convert a given string to upperCase using map method;
    public static void main(String[] strings) {
        System.out.println("Enter the names needed to be converted : ");
        Scanner scanner = new Scanner(System.in);
        //using the scanner method to get the input;
    Stream names = Stream.of(scanner.next())
            .map(String::toUpperCase);
            //using the map method to convert the string to upperCase;
            names.forEach(System.out::println);
    }
}
