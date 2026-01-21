import java.util.*;

class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int n = nums.length;

        // Step 1: find possible candidates
        int candidate1 = 0, candidate2 = 1;
        int count1 = 0, count2 = 0;

        for (int i = 0; i < n; i++) {

            if (nums[i] == candidate1) {
                count1++;
            } else if (nums[i] == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = nums[i];
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = nums[i];
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        // Step 2: verify the candidates
        count1 = 0;
        count2 = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == candidate1) count1++;
            else if (nums[i] == candidate2) count2++;
        }

        List<Integer> result = new ArrayList<>();

        if (count1 > n / 3) result.add(candidate1);
        if (count2 > n / 3) result.add(candidate2);

        return result;
    }
}
