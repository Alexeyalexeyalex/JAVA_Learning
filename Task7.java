import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

// В файле содержится строка с данными:
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"}, {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"}, {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// Напишите метод, который разберёт её на составные части и, используя StringBuilder создаст массив строк такого вида:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

public class Task7 {
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



        StringBuilder result = new StringBuilder();

        String[] onePersone = text.split("},");
        for (String string : onePersone) {
            String[] keyValueOnePerson = string.split(",");
            for (int i = 0; i < keyValueOnePerson.length; i++) {
                String keyValuePerson = keyValueOnePerson[i];
                keyValuePerson = keyValuePerson.replace("{", "");
                keyValuePerson = keyValuePerson.replace("}", "");
                keyValuePerson = keyValuePerson.replace("\"", "");
                keyValuePerson = keyValuePerson.replace(" ", "");
                keyValuePerson = keyValuePerson.replace("[", "");
                keyValuePerson = keyValuePerson.replace("]", "");
                
                String[] keyValue = keyValuePerson.split(":");
                if (keyValue[0].equals("фамилия")){
                    result.append(String.format("Студент %s ",keyValue[1]));
                }
                else if(keyValue[0].equals("оценка")){
                    result.append(String.format("получил %s ",keyValue[1]));
                }
                else if(keyValue[0].equals("предмет")){
                    result.append(String.format("по предмету %s \n",keyValue[1]));
                }
            }
           
        }
        System.out.println(result);

    }
}
