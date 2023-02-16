// Вывести все простые числа от 1 до 1000

import java.math.BigInteger;


public class Task2 {
    public static void main(String[] args) {
        Integer number = 100;
        String result = "";
        for (int i = 1; i < number+1; i++) {
            BigInteger bigInteger = BigInteger.valueOf(i);
            boolean isSimple = bigInteger.isProbablePrime((int) Math.log(i));
            result += isSimple == true ? i+", ": "";
        }

        System.out.println(result);
    }
}
