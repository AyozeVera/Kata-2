package kata2;

import java.util.HashMap;

public class MostFrecuentlyUsed {
    private final int[] numbersArray;
    private HashMap <Integer, Integer> frequencyMap;
    private int[] mostFrequent = {-1,0};
    
    public MostFrecuentlyUsed (int[] numbersArray){
        this.numbersArray = numbersArray;
    }
    
    public void frequencyHashMap (){
        frequencyMap = new HashMap<>();
        for (int value : numbersArray) {
            frequencyMap.put(value, getFrequency(value)+1);
        }
    }

    private int getFrequency(int value) {
        if (frequencyMap.containsKey(value))return frequencyMap.get(value);
        return 0;
    }
    
    private int[] MostFrecuentlyNumber (HashMap <Integer,Integer> frequencyHashMap){
        frequencyHashMap();
        int maxFrequency = 0;
        int mostFrecuentNumber = -1;
        for (Integer Value : frequencyMap.keySet()) {
            if ()
        }
        return mostFrequent;
    }
}