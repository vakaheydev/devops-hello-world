import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        LocalDate dateNow = LocalDate.now();
        LocalTime timeNow = LocalTime.now();
        String argsStr = Arrays.toString(args);


        System.out.println("<------------------->");
        System.out.println("Аргументы: " + argsStr);
        System.out.println("Хеллоу Ворлд Изменён! " + dateNow);
        System.out.println("Время: " + timeNow);
        System.out.println("Класс: " + Main.class);
        System.out.println("Поток: " + Thread.currentThread());
        System.out.println("<------------------->");
    }
}