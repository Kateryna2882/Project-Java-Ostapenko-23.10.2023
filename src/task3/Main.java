package task3;

public class Main {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        TwoSum twoSums = new TwoSum();
        int[] result = twoSums.twoSum(nums, target);
        System.out.println("Indices of the two numbers : [ " + result[0]
                + " , " + result[1] + "] ");
    }
}
