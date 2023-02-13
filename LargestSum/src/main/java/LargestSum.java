
import java.util.Collections;
import java.util.List;

public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums){
        Collections.sort(nums, Collections.reverseOrder());
        int max1 = nums.get(0);
        int max2 = nums.get(1);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) == max1) {
                max2 = max1;
                break;
            } else if (nums.get(i) > max2) {
                max2 = nums.get(i);
            }
        }
        return max1 + max2;
    }
}
