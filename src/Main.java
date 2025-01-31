import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        LocalDate dateNow = LocalDate.now();
        LocalTime timeNow = LocalTime.now();
        String argsStr = Arrays.toString(args);


        System.out.println("<------------------->");
        System.out.printf("Аргументы: %s%n", argsStr);
        System.out.printf("Хеллоу Ворлд Изменён! %s%n", dateNow);
        System.out.printf("Время: %s%n", timeNow);
        System.out.printf("Класс: %s%n", Main.class);
        System.out.printf("Поток: %s%n", Thread.currentThread());
        System.out.println("<------------------->");
    }
}