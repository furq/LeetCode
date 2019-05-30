package easy;

/* Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 *
 * Example 1:
 * Input: 121
 * Output: true
 *
 * Example 2:
 * Input: -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 *
 * Example 3:
 * Input: 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 **/

public class PalindromeInteger {

    public static boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        char[] charArray = str.toCharArray();
        String reverseStr = "";

        for (int i = charArray.length - 1; i >= 0; i--) {
            reverseStr += Character.toString(charArray[i]);
        }
        int num = 0;
        try {
            num = Integer.parseInt(reverseStr);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return num == x ? true : false;
    }

    public static void main(String[] args) {

        System.out.println("output : " + isPalindrome(131));
        System.out.println("output : " + isPalindrome(-4321));
        System.out.println("output : " + isPalindrome(11000));

    }
}


