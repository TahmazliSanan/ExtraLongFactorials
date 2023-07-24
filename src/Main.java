import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        extraLongFactorials(25);
    }

    public static void extraLongFactorials(int n) {
        BigInteger result = new BigInteger(String.valueOf(1));
        for (int i = 1; i <= n; i++){
            result = result.multiply(new BigInteger(String.valueOf(i)));
        }
        System.out.println(result);
    }
}