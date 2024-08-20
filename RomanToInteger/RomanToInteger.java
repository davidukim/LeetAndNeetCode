package RomanToInteger;

import java.util.HashMap;

public class RomanToInteger {
    
    public int romanToInt(String s){
        HashMap<Character, Integer> lookUpTable = new HashMap<>();
        int toInteger = 0;
        int currIndex = 0;

        lookUpTable.put('I', 1);
        lookUpTable.put('V', 5);
        lookUpTable.put('X', 10);
        lookUpTable.put('L', 50);
        lookUpTable.put('C', 100);
        lookUpTable.put('D', 500);
        lookUpTable.put('M', 1000);

        if (s.length() == 1) return lookUpTable.get(s.charAt(0));

        while (currIndex <= s.length()-1){
            if ( currIndex == s.length()-1){
                return toInteger += lookUpTable.get(s.charAt(currIndex));
            }

            if ( lookUpTable.get( s.charAt(currIndex) ) >= lookUpTable.get( s.charAt(currIndex+1) ) ){
                toInteger += lookUpTable.get( s.charAt(currIndex) ); 
                currIndex++;
            } else{
                toInteger += lookUpTable.get(s.charAt(currIndex+1)) - lookUpTable.get(s.charAt(currIndex));
                currIndex += 2;
            }
        }

        return toInteger;
    }
}
