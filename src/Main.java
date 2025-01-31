import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        String argsStr = Arrays.toString(args);
        System.out.println("Args: " + argsStr);
        System.out.println("Hello world Changed! " + now);
    }
}