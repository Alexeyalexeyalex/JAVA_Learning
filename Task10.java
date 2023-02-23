import java.util.ArrayList;
import java.util.Collections;

// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметичское этого списка.
public class Task10 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayOfNumbers = new ArrayList<>();
        Integer sum = 0;
        for (int i = 0; i < 10; i++) {
            arrayOfNumbers.add(i);
        }
        System.out.println(arrayOfNumbers);
        
        System.out.printf("Минимальное число - %s \n",Collections.min(arrayOfNumbers));
        System.out.printf("Максимальное число - %s \n",Collections.max(arrayOfNumbers));
        for (Integer number : arrayOfNumbers) {
            sum += number;
        }
        System.out.printf("Среднее арифмитическое - %s \n",sum / arrayOfNumbers.size());
    }
}
