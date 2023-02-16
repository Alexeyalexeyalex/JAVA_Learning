// Вычислить n-ое треугольного число(сумма чисел от 1 до n), 
// n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        sc.close();
        int result = 0;
        for (int i = 0; i < number+1; i++) {
            // result = triangularNumber(result, i);
            result = factorial(result, i);
        }
        System.out.println(result);
        
    }

    public static int triangularNumber(int num, int i){
        num +=i;
        return num;
    }

    public static int factorial(int num, int i){
        i = i == 0 ? 1:i;
        num = num ==0 ? 1:num;
        num *=i;
        return num;
    }
}