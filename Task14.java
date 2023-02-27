import java.util.LinkedList;
import java.util.Scanner;

// В калькулятор добавьте возможность отменить последнюю операцию.

public class Task14 {
    public static void main(String[] args) {
        int result = 0;
        int i =0;
        LinkedList<Integer> steps = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        while (i<5) {
            
            int firstnumber = result;
            if (result == 0 && steps.size()<1) {
                firstnumber = firstnumber(sc);
            }
            else{
                if (printMenuCalc(sc) == 1){
                    result = steps.pollLast();
                    System.out.printf("=> %s \n",result);
                    continue;
                }
                System.out.printf("=> %s \n",result);
            }     
            String sign = sign(sc);       
            int secondnumber =secondnumber(sc);
            steps.add(result);
            System.out.printf("%s %s %s = %s \n",firstnumber, sign, secondnumber, arithmeticOperations(firstnumber, sign, secondnumber));
            result = arithmeticOperations(firstnumber, sign, secondnumber);
            System.out.printf("=> %s \n",result);
            
        }
        // System.out.println(steps);
        sc.close();
        
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

    public static Integer printMenuCalc(Scanner sc){
        System.out.println("1 - Вернуться назад");
        System.out.println("2 - Продолжить вычисления"); 
        int answer = Integer.parseInt(sc.nextLine());
        
        return answer;
    }

}