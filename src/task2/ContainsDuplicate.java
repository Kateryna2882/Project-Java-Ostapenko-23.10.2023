package task2;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> seen = new HashSet<>();
        for (int number : nums) {
            if (seen.contains(number)) {
                return true;
            }
            seen.add(number);
        }
        return false;
    }
}
