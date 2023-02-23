import java.util.ArrayList;

// Пусть дан произвольный список целых чисел. Удалить из него чётные числа.
public class Task9 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayOfNumbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayOfNumbers.add(i);
        }
        System.out.println(arrayOfNumbers);

        for (int i = 0; i < arrayOfNumbers.size(); i++) {
            if (arrayOfNumbers.get(i) % 2 == 0){
                arrayOfNumbers.remove(i);
                i--;
            }
        }

        System.out.println(arrayOfNumbers);

    }
}
