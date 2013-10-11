package kata2;

import java.util.HashMap;

public class MostFrecuentlyUsed {
    private final int[] numbersArray;
    private HashMap <Integer, Integer> frecuencyMap;
    
    public MostFrecuentlyUsed (int[] numbersArray){
        this.numbersArray = numbersArray;
    }
    
    public HashMap<Integer, Integer> FrequencyHashMap (int[] numbersArray){
        frecuencyMap = new HashMap<>();
        for (int value : numbersArray) {
            frecuencyMap.put(value, getFrequency(value)+1);
        }
        return frecuencyMap;
    }

    private int getFrequency(int value) {
        if (frecuencyMap.containsKey(value))return frecuencyMap.get(value);
        return 0;
    }
}