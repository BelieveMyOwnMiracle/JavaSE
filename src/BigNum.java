import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class BigNum {
    public static void main(String[] args) {
        BigInteger i = BigInteger.valueOf(Long.MAX_VALUE);
        i = i.multiply(BigInteger.valueOf(Long.MAX_VALUE));
        System.out.println(i);
        i = i.pow(100);
        System.out.println(i);

        BigDecimal d = BigDecimal.valueOf(10);
        d = d.divide(BigDecimal.valueOf(3),100, RoundingMode.CEILING);
        //RoundingMode是舍入模式，就是精确到最后一位时，该怎么处理，这里CEILING表示向上取整
        System.out.println(d);
    }
}
