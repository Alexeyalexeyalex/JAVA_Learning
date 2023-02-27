import java.util.LinkedList;

// Пусть дан LinkedList с несколькими элементами. 
// Реализуйте метод, который вернет “перевернутый” список.

public class Task12 {
    public static void main(String[] args) {
        LinkedList<Integer> listNumbers = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            listNumbers.add((int) (Math.random() * 100));
        }
        System.out.println(listNumbers);
        System.out.println(reverse(listNumbers));
        
    }

    public static LinkedList<Integer> reverse(LinkedList<Integer> listNumbers){
        for (int i = 0; i < listNumbers.size()/2; i++) {
            int temp = listNumbers.get(i);
            listNumbers.set(i,listNumbers.get(listNumbers.size()-1-i));
            listNumbers.set(listNumbers.size()-1-i,temp);
        }
        return listNumbers;
    }
}
