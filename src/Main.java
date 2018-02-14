import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by host on 14.2.2018.
 */
public class Main {
    public static void main(String[] args) throws InvalidIdNumberException {
        String rc;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your id number:");
        rc=scanner.nextLine();

        String pattern = "\\d{2}([05][1-9]|[16][0-2])[0-3][0-9]/?[0-9]{4}";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(rc);

        if (m.matches()) {
            System.out.println("Id number is correct");
        }
        else{
            throw new InvalidIdNumberException(rc);
        }
    }
}
