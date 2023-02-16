// Реализовать простой калькулятор Введите число 2 
// Введите операцию 1 + 2 - 3 * 4 / 
// Введите число 2 2 + 2 = 4

import java.util.Scanner;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;


public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstnumber = firstnumber(sc);      
        String sign = sign(sc);       
        int secondnumber =secondnumber(sc);
        sc.close();
        System.out.printf("%s %s %s = %s",firstnumber, sign, secondnumber, arithmeticOperations(firstnumber, sign, secondnumber));

    }


// Получаем первое число от пользователя
    public static Integer firstnumber(Scanner sc){
        System.out.println("Введите первое число:");
        
        int firstnumber = Integer.parseInt(sc.nextLine());
        
        return firstnumber;
    }
    
// Получаем знак действия от пользователя
    public static  String sign(Scanner sc){
        String sign = " ";
        String data = "+,-,/,*,%";
        while ((!data.contains(sign))) {
            System.out.println("Введите знак действия (+, -, /, *, %):");
            
            sign = sc.nextLine();
            
            
        } 
        return sign;
    }

// Получаем второе число от пользователя
    public static Integer secondnumber(Scanner sc){
        System.out.println("Введите второе число:");
       
        int secondnumber = Integer.parseInt(sc.nextLine());
        
        return secondnumber;
    }

// Проверка знака и выполнение соответствующего действия 
    public static Integer arithmeticOperations(Integer firstnumber, String sign, Integer secondnumber) {
    Integer result = 0;
    switch (sign) {
        case "+":
            result = firstnumber + secondnumber;
            break;
        case "-":
            result = firstnumber - secondnumber;
            break;
        case "*":
            result = firstnumber * secondnumber;
            break;       
        case "/":
            result = firstnumber / secondnumber;
            break; 
        case "%":
            result = firstnumber % secondnumber;
            break; 
    }

    return result;
    }



}
