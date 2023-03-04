import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. 
// Реализовать в java.

// Создать множество ноутбуков.

// Написать метод, который будет запрашивать у пользователя критерий (или критерии) 
// фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. 
// Например:

// “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …

// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры 
// фильтрации можно также в Map.

// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

public class Task20 {
    public static void main(String[] args) {
        Set<Notebook> notebooks = new HashSet<>();
        notebooks.add(new Notebook("HP", "280H", 4, "intel core i7",
            "RTX 4060","WDS", 245,"Green"));
        notebooks.add(new Notebook("Lenovo", "G7", 8, "intel core i5",
            "GTX 1050 TI","WDS", 500,"Grey"));
        notebooks.add(new Notebook("Lenovo", "G7", 16, "intel core i5",
            "GTX 1050 TI","WDS", 500,"White"));
        notebooks.add(new Notebook("Lenovo", "G7", 8, "intel core i5",
            "GTX 1050 TI","WDS", 500,"Black"));
        notebooks.add(new Notebook("Asus", "ReS7", 32, "intel core i5",
            "RTX 3050 TI","WDS", 500,"Black"));
        notebooks.add(new Notebook("Asus", "ReS7", 32, "intel core i5",
            "RTX 3050 TI","WDS", 500,"White"));
        notebooks.add(new Notebook("Asus", "ReS7", 32, "intel core i5",
            "RTX 3050 TI","WDS", 500,"Green"));
        notebooks.add(new Notebook("Asus", "ReS7", 32, "intel core i5",
            "RTX 3050 TI","WDS", 500,"Grey"));

        
        String answer = "";
        Map<String, String> filters = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        while (!(answer.equals("6"))) {

            if (filters.size()>0) System.out.printf("\nВаши фильтры\n %s \n", filters);

            System.out.println("Введите имя или номер меню для фильтрации:\n"
                + "1 - ОЗУ\n"
                + "2 - Объем ЖД\n"
                + "3 - Процессор\n"
                + "4 - Цвет\n"
                + "5 - Сбросить фильтры\n"
                + "6 - Выход");
            answer = sc.nextLine();

            String key = "фирма производителя";
            switch (answer) {
                case "1":
                    System.out.println("Введите количество оперативной памяти: ");
                    answer = sc.nextLine();
                    key = "количество оперативной памяти";
                    break;

                case "2":
                    System.out.println("Введите объем жесткого диска: ");
                    answer = sc.nextLine();
                    key = "объем жесткого диска";
                    break;
                case "3":
                    System.out.println("Введите название процессора: ");
                    answer = sc.nextLine();
                    key = "название процессора";
                    break;
                case "4":
                    System.out.println("Введите цвет: ");
                    answer = sc.nextLine();
                    key = "цвет";
                    break;
                case "5":
                    filters.clear();
                    continue;    
            }

            if (filters.containsKey(key) && filters.get(key).equals(answer)) {
                System.out.println("Такой фильтр уже есть");
                continue;
            }
            else filters.put(key, answer);

            System.out.println();
            for (Notebook notebook : notebooks) {
                if (filters.containsKey("количество оперативной памяти") && notebook.getRam() !=   
                    Integer.parseInt(filters.get("количество оперативной памяти"))) continue;

                if (filters.containsKey("объем жесткого диска") && notebook.getHardDriveVolume() !=   
                    Integer.parseInt(filters.get("объем жесткого диска"))) continue;

                if (filters.containsKey("название процессора") && 
                    !(notebook.getProcessor().equals(filters.get("название процессора")))) continue;

                if (filters.containsKey("цвет") && 
                    !(notebook.getColor().equals(filters.get("цвет")))) continue;
                
                if (filters.containsKey("фирма производителя") && 
                    !(notebook.getName().equals(filters.get("фирма производителя")))) continue;
                
                System.out.println(notebook);
            }
            
        }
        sc.close();


    }
}
