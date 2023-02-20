// В файле содержится строка с исходными данными в такой форме:
// {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
// Требуется на её основе построить и вывести на экран новую строку, в форме SQL запроса:
// SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city = "Moscow";
// Для разбора строки используйте String.split. Сформируйте новую строку, используя StringBuilder. 
// Значения null не включаются в запрос.

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        FileReader file = null;
        String text = "";
        try {
            file = new FileReader("text.txt");
            Scanner scan = new Scanner(file);
            text = scan.nextLine();

        } catch (IOException ex) {
            System.err.println("Ошибка: " + ex);
        } finally {
            if (file != null) {
                try {
                    file.close();
                } catch (IOException ex) {
                    System.err.println("Ошибка: " + ex);
                }
            }
        }
        StringBuilder result = new StringBuilder("SELECT * FROM students WHERE ");
        
        for (String argumentsValues : text.split(",")) {
            argumentsValues = argumentsValues.replace("{", "");
            argumentsValues = argumentsValues.replace("}", "");
            argumentsValues = argumentsValues.replace("\"", "");
            argumentsValues = argumentsValues.replace(" ", "");
          
            String[] values = argumentsValues.split(":");
            StringBuilder value = new StringBuilder();
            if (values[1].equals("null")){
                continue;
            }
            value.append(values[0]);
            value.append(" = ");
            value.append("\"");
            value.append(values[1]);
            value.append("\"");
            value.append(" AND ");
            result.append(value);
        }
        result.setLength(result.length() - 5);
        System.out.println(result);
    }
}
