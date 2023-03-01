import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

// Пусть дан список сотрудников: Иван, Пётр, Антон и так далее. 
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. 
// Отсортировать по убыванию популярности.

public class Task17 {
    public static void main(String[] args) {
        String[] workerList = {"Иван", "Пётр", "Пётр", "Иван", "Иван", "Антон", "Олег", "Антон"};
        Map<String, Integer> repetitionName = new HashMap<>();
        for (String name : workerList) {
            if (repetitionName.containsKey(name))
                repetitionName.put(name, repetitionName.get(name)+1);
            else
                repetitionName.put(name, 1);
        }

        ArrayList<Map.Entry<String,Integer>> sortedList = new ArrayList<>(repetitionName.entrySet());
        sortedList.sort(Map.Entry.comparingByValue());
        System.out.println(sortedList);
    }
}
