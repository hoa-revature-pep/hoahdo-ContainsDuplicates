import java.util.HashSet;

public class ContainsDuplicates {
    /**
     * Determine if an array of items contains any duplicate values. You should use a Set for this: remember that
     * Sets can not have duplicate values, but you may check if a value is already contained using the .contains method.
     * @param nums an array of ints.
     * @return true if nums contains any duplicate values, false if it does not.
     */
    public boolean containsDuplicate(int[] nums){

        HashSet<Integer> hSet = new HashSet<>();

        for (int idx = 0; idx < nums.length; idx++) {
            if (hSet.contains(nums[idx])) {
                return true;
            }
            hSet.add(nums[idx]);
        }

        return false;
    }
}
