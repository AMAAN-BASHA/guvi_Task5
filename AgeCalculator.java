import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {//program to calculate the age;
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        System.out.println("Enter your birthdate(yyyy-mm-dd)");
        LocalDate birthDate =LocalDate.parse(scanner.nextLine());
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(birthDate, currentDate);
        System.out.println("Your age is: "
                + age.getYears() + " years, "
                + age.getMonths() + " months, and "
                + age.getDays() + " days.");
    }
}
