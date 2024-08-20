package RomanToInteger;

public class Main {
    public static void main(String[] args) {
        String strOne = "III";
        String strTwo = "LVIII";
        String strThree = "MCMXCIV";

        RomanToInteger converter = new RomanToInteger();
        System.out.println(converter.romanToInt(strOne));
        System.out.println(converter.romanToInt(strTwo));
        System.out.println(converter.romanToInt(strThree));
    }
}
