import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, 
// что один человек может иметь несколько телефонов.

public class Task16 {
    public static void main(String[] args) {
        
        Map<String, ArrayList<Integer>> phoneBook = new HashMap<>();

        Scanner sc = new Scanner(System.in);

        Integer answer = 0;
        while (answer!=3) {
            System.out.println("Что вы хотите сделать?\n1 Добавить пользователя\n2 Поиск по имени\n3 Выход");
            answer = Integer.parseInt(sc.nextLine());
            
            if (answer.equals(1))
                addNumber(sc, phoneBook);
            else if (answer.equals(2))
                System.out.println(searchNumber(sc, phoneBook));
            
        }
        sc.close();
    
        


    }

    public static void addNumber(Scanner sc, Map<String, ArrayList<Integer>> phoneBook) {
        System.out.println("Введите имя для добавления номера:");
        String name = sc.nextLine();
        System.out.println("Введите номер для добавления:");
        Integer number = Integer.parseInt(sc.nextLine());

        if (phoneBook.containsKey(name)){
            phoneBook.get(name).add(number);
        }
        else{
            ArrayList<Integer> numbers = new ArrayList<>();
            numbers.add(number);
            phoneBook.put(name, numbers);
        }
    }

    public static ArrayList<Integer> searchNumber(Scanner sc, Map<String, ArrayList<Integer>> phoneBook) {
        System.out.println("Введите имя для поиска:");
        String name = sc.nextLine();

        return phoneBook.get(name);
    }

}
