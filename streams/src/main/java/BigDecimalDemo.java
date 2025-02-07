import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {

    public static void main(String[] args) {

        double d1 = 174.56;
        double d2 = 174.26;

        System.out.println(d1-d2);

        BigDecimal b1 = new BigDecimal("174.56");
        BigDecimal b2 = new BigDecimal("174.26");

        System.out.println(b1.subtract(b2));

        //scaling and rounding
        BigDecimal number1 = new BigDecimal("23.12");
        System.out.println(number1.setScale(1, RoundingMode.HALF_DOWN));
        System.out.println(number1.compareTo(new BigDecimal("23.12")));

        //BigDecimals are immutable

    }
}
