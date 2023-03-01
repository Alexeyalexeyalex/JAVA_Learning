// Реализовать алгоритм пирамидальной сортировки (HeapSort).

public class Task18 {
    public static void main(String[] args) {
        int[] listNumbers = {3,1,0,12,3,5,7,23};
        int lengthList = listNumbers.length;
        for (int i = lengthList/2-1 ; i > -1 ; i--) {
            listNumbers = maxKucha(listNumbers, lengthList, i);
        }
        while (lengthList>1) {
            int temp = listNumbers[0];
            listNumbers[0] = listNumbers[lengthList-1];
            listNumbers[lengthList-1] = temp;
            lengthList--;

            listNumbers = maxKucha(listNumbers, lengthList, 0);
        }
        for (int i = 0; i < listNumbers.length; i++) {
            System.out.println(listNumbers[i]);
        }
        
    }

    private static int[] maxKucha(int[] listNumbers, int lengthList, int peak){
        int leftPeak= peak*2+1;
        int rightPeak= peak*2+2;
        int maxPeak = peak;
        if (leftPeak<lengthList && listNumbers[leftPeak]>listNumbers[peak])
            maxPeak = leftPeak;
        
        if (rightPeak<lengthList && listNumbers[rightPeak]>listNumbers[maxPeak])
            maxPeak = rightPeak;
        
        if (maxPeak!=peak){
            int temp = listNumbers[maxPeak];
            listNumbers[maxPeak] = listNumbers[peak];
            listNumbers[peak] = temp;
            maxKucha(listNumbers, lengthList, maxPeak);
        }
        return listNumbers;
    }

}
