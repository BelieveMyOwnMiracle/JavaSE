package date;

import java.time.LocalDate;
import java.time.OffsetDateTime;

public class Test {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);

        OffsetDateTime now1 = OffsetDateTime.now();
    }
}
