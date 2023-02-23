import java.util.Arrays;

// Реализовать алгоритм сортировки слиянием.

public class Task8 {
    public static void main(String[] args) {
        Integer[] list = { 3,2,11,8 };
        for (Integer integer : list) {
            System.out.printf("%s ",integer);
        }
        System.out.print("  ->   ");
        for (Integer integer : sortFunction(list)) {
            System.out.printf("%s ",integer);
        }

    }

    private static Integer[] sortFunction(Integer[] list) {
        if (list.length <= 1) {
            return list;
        }

        Integer[] firstArray = sortFunction(Arrays.copyOfRange(list, 0, (list.length -1 ) / 2 +1));
        Integer[] secondArray = sortFunction(Arrays.copyOfRange(list, (list.length -1)/2 + 1, list.length));
        Integer[] resultArray = new Integer[list.length];
        
        int resultArrayKey = 0;
        int firstArrayKey = 0;
        int secondArrayKey = 0;
        while ((firstArrayKey != firstArray.length) && ((secondArrayKey != secondArray.length))) {
            if (firstArray[firstArrayKey] > secondArray[secondArrayKey]) {
                resultArray[resultArrayKey] = secondArray[secondArrayKey];
                secondArrayKey++;
            } 
            else {
                resultArray[resultArrayKey] = firstArray[firstArrayKey];
                firstArrayKey++;
            }
            resultArrayKey++;
        }
        if (firstArrayKey<firstArray.length) {
            for ( ; firstArrayKey < firstArray.length; firstArrayKey++) {
                resultArray[resultArrayKey] = firstArray[firstArrayKey];
                resultArrayKey++;
            }
        }
        else if (secondArrayKey<secondArray.length) {
            for ( ; secondArrayKey < secondArray.length; secondArrayKey++) {
                resultArray[resultArrayKey] = secondArray[secondArrayKey];
                resultArrayKey++;
            }
        }

        return resultArray;

    }
}
