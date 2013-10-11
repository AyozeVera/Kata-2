
package kata2;

import java.util.HashMap;

public class Kata2 {
    public static void main(String[] args) {
        int [] arrayNumber = {1,2,1,1,3,4,2,5};
        HashMap <Integer, Integer> frecuencyMap = new Hashmap <>();
        for (int value : arrayNumber) {
            frecuencyMap.put (value, getFrecuency(frecuencyMap, value)+1);
            int max = 0;
            int number = 1;
            for (int key : frecuencyMap.keySet()) {
                
            }
        }
    }
}
