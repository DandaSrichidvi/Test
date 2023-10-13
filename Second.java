import java.util.HashMap;

public class Second {
    public static void main(String[] args) {
        
        System.out.println(romanToInt("IX")); // Output: 9
        System.out.println(romanToInt("LVIII")); // Output: 58
        System.out.println(romanToInt("MCMXCIV")); // Output: 1994
    }

    public static int romanToInt(String s) {
        
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        
        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int currentValue = romanValues.get(currentChar);

            
            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }

            
            prevValue = currentValue;
        }

        return result;
    }
}
//This code defines a romanToInt function that takes a Roman numeral string as input and calculates the corresponding integer value according to Roman numeral rules. It uses a HashMap to map each Roman numeral character to its value and iterates through the input string, adjusting the result as needed based on the Roman numeral rules.






