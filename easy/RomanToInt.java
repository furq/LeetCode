package easy;

/*
* Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
*
*  Symbol       Value
*  I             1
*  V             5
*  X             10
*  L             50
*  C             100
*  D             500
*  M             1000
*
*  For example, two is written as II in Roman numeral, just two one's added together.
*  Twelve is written as, XII, which is simply X + II. The number twenty seven is written as XXVII,
*  which is XX + V + II.
*
*  Roman numerals are usually written largest to smallest from left to right. However, the numeral for
*  four is not IIII. Instead, the number four is written as IV. Because the one is before the five we
*  subtract it making four. The same principle applies to the number nine, which is written as IX.
*  There are six instances where subtraction is used:
*
*  I can be placed before V (5) and X (10) to make 4 and 9.
*  X can be placed before L (50) and C (100) to make 40 and 90.
*  C can be placed before D (500) and M (1000) to make 400 and 900.
*  Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range
*  from 1 to 3999.
*
*  Example 1:*
*
*  Input: "III"
*  Output: 3
*
*  Example 2:
*
*  Input: "IV"
*  Output: 4
*
*  Example 3:
*
*  Input: "IX"
*  Output: 9
*
*  Example 4:
*
*  Input: "LVIII"
*  Output: 58
*  Explanation: L = 50, V= 5, III = 3.
*
*  Example 5:
*
*  Input: "MCMXCIV"
*  Output: 1994
8  Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
*
**/

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

    static Map<String, Integer> romanIntDictionary = new HashMap<>();

    public static int romanToInt(String s) {

        char[] charArray = s.toCharArray();
        int num = 0;
        int previousNum = 0, currentNum = 0;

        for (int i = charArray.length - 1; i >= 0; i--) {
            currentNum = romanIntDictionary.get(Character.toString(charArray[i]));
            if (previousNum > currentNum) {
                num -= romanIntDictionary.get(Character.toString(charArray[i]));
            } else {
                num += romanIntDictionary.get(Character.toString(charArray[i]));
            }
            previousNum = romanIntDictionary.get(Character.toString(charArray[i]));
        }
        return num;
    }

    static void createDictionary() {
        romanIntDictionary.put("I", 1);
        romanIntDictionary.put("V", 5);
        romanIntDictionary.put("X", 10);
        romanIntDictionary.put("L", 50);
        romanIntDictionary.put("C", 100);
        romanIntDictionary.put("D", 500);
        romanIntDictionary.put("M", 1000);
    }

    public static void main(String[] args) {
        createDictionary();
        System.out.println("output : " + romanToInt("XX"));
        System.out.println("output : " + romanToInt("IX"));
        System.out.println("output : " + romanToInt("VIII"));
        System.out.println("output : " + romanToInt("IV"));
        System.out.println("output : " + romanToInt("LVIII"));
        System.out.println("output : " + romanToInt("MCMXCIV"));

    }
}
