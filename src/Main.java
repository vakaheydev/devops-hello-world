import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        String argsStr = Arrays.toString(args);
        System.out.println("Аргументы: " + argsStr);
        System.out.println("Хеллоу Ворлд Изменён! " + now);
        System.out.println("Текущий класс: " + Main.class);
    }
}