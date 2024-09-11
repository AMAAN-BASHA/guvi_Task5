import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NonEmptyString {//program to check the string empty or not and to print the nonEmptyString;
    public static void main(String[] args) {
        List<String>stringList = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        List<String>nonEmptyString = new ArrayList<>();
        for ( String str : stringList){//condition to check the string is empty or not;
            if (!str.isEmpty()) {
            nonEmptyString.add(str);
            }
        }
        System.out.println("Non Empty String : "+nonEmptyString);
    }
}