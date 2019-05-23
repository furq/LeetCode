package easy;

/*Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * Example:
 * --------
 * Given nums = [2, 7, 11, 15], target = 9,
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 * */

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int lenghtOfArray = nums.length;
        for (int i = 0; i < lenghtOfArray; i++) {

            for (int j = i + 1; j < lenghtOfArray; j++) {
                if ((nums[i] + nums[j]) == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0};
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int[] output = twoSum(nums, 7);
        System.out.print("Indices are : ");
        for (int i : output) {
            System.out.print(i + " ");
        }
    }
}


