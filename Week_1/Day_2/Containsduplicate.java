package Week_1.Day_2;

import java.util.Arrays;

public class Containsduplicate {

    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;

    }
}
