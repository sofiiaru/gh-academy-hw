import java.util.Arrays;
import java.util.List;

public class TransactionData {
    public static List<Transaction> getAll() {
        Trader raul = new Trader("Raul", "Chicago");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Toronto");
        Trader brian = new Trader("Brian", "Chicago");

        return Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raul, 2012, 1000),
                new Transaction(mario, 2011, 400),
                new Transaction(alan, 2012, 700),
                new Transaction(brian, 2012, 800),
                new Transaction(mario, 2011, 900)

        );

    }
}
