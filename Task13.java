import java.util.LinkedList;

// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент 
// из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.

public class Task13 {
    public static void main(String[] args) {
        LinkedList<Integer> listNumbers = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            listNumbers = enqueue(listNumbers, (int) (Math.random() * 100));
        }
        System.out.println(listNumbers);
        System.out.println(dequeue(listNumbers));
        System.out.println(listNumbers);
        System.out.println(first(listNumbers));
        System.out.println(listNumbers);
    }

    public static LinkedList<Integer> enqueue(LinkedList<Integer> listNumbers, int number){
        listNumbers.add((int) number);
        return listNumbers;
    }

    public static int dequeue(LinkedList<Integer> listNumbers){
        int number = listNumbers.pollFirst();
        return number;
    }

    public static int first(LinkedList<Integer> listNumbers){
        int number = listNumbers.get(0);
        return number;
    }

}
