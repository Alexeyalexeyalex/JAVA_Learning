import java.io.Console;
import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
// import java.lang.System.Logger;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

import javax.swing.plaf.synth.SynthOptionPaneUI;

// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

public class Task6 {
    public static Logger logger = Logger.getLogger(Task6.class.getName());
    public static void main(String[] args) throws IOException{
        // ConsoleHandler ch = new ConsoleHandler();
        FileHandler fh = new FileHandler("log.xml");
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);

        int[] arrayIntValues = new int[]{5,3,12,1,6,2,34};
        for (int i = 0; i < arrayIntValues.length-1; i++) {
            for (int j = i+1; j < arrayIntValues.length; j++) {
                if (arrayIntValues[i] > arrayIntValues[j]){
                    logger.info(String.format("Изменения в строке: %s <-> %s",arrayIntValues[i],arrayIntValues[j]));
                    int temp = arrayIntValues[j];
                    arrayIntValues[j] = arrayIntValues[i];
                    arrayIntValues[i] = temp;
                    
                }
            }
            
        }
        for (int i = 0; i < arrayIntValues.length; i++) {
            System.out.printf("%s ",arrayIntValues[i]);
        }
    }
}
