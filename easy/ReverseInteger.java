package easy;

/* Given a 32-bit signed integer, reverse digits of an integer.
 *
 *  Example 1:
 *
 *  Input: 123
 *  Output: 321
 *
 *  Example 2:
 *
 *  Input: -123
 *  Output: -321
 *
 *  Example 3:
 *
 *  Input: 120
 *  Output: 21
 *  Note:
 *  Assume we are dealing with an environment which could only store integers within the 32-bit signed
 *  integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0
 *  when the reversed integer overflows.
 * */

public class ReverseInteger {

    public static int reverse(int x) {

        String str = Integer.toString(x);
        char[] charArray = str.toCharArray();
        String reverseStr = "";

        for (int i = charArray.length - 1; i >= 0; i--) {
            if (charArray[i] == '-') {
                reverseStr = "-" + reverseStr;
            } else
                reverseStr += Character.toString(charArray[i]);
        }
        int num;
        try {
            num = Integer.parseInt(reverseStr);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            num = 0;
        }
        return num;
    }

    public static void main(String[] args) {

        System.out.println("output : " + reverse(1534236469));
        System.out.println("output : " + reverse(4321));
        System.out.println("output : " + reverse(-11000));

    }
}


