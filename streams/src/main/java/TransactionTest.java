import java.util.Comparator;

public class TransactionTest {
    public static void main(String[] args) {

        //find all transactions in 2011 and sort by value
        System.out.println("**************");
        TransactionData.getAll().stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .forEach(System.out::println);

        //what are all unique cities where traders work
        System.out.println("**************");
        TransactionData.getAll().stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .forEach(System.out::println);

        //find all traders from Chicago and sort them by name
        System.out.println("**************");
        TransactionData.getAll().stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Chicago"))
                .distinct()
                .sorted(Comparator.comparing(Trader::getName))
                .forEach(System.out::println);

        //return a string of all tarders names sorted asc
        System.out.println("**************");
        String result = TransactionData.getAll().stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .reduce((a,b) -> a+","+b).get();
        System.out.println(result);

        //are there any thraders based in milan
        System.out.println("**************");
        boolean milanBased = TransactionData.getAll().stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));

        System.out.println(milanBased);

        //print the values of transactions of traders living in Chicago
        System.out.println("**************");
        TransactionData.getAll().stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Chicago"))
                .map(Transaction::getValue)
                .forEach(System.out::println);

        //highest value of all transactions
        System.out.println("**************");
        Integer max = TransactionData.getAll().stream()
                .map(Transaction::getValue)
                .reduce(Integer::max).get();

        System.out.println(max);




    }
}
