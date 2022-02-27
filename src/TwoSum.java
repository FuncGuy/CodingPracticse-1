import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] array, int target) {

        int left = 0;
        int right = array.length -1;
        Arrays.sort(array);
        while (left < right) {
            int sum = array[left] + array[right];
            if (sum == target) {
                return new int[] {array[left], array[right]};
            } else if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            }

        }
        return new int[]{0};
    }

    public static void main(String[] args) {
        int[] array = {3, 5, -4, 8, 11, 1, -1, 6};
        int[] a = twoSum(array, 10);
        System.out.println(Arrays.toString(a));
    }
}
