
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String input1 = "A man, a plan, a canal : Panama";
        System.out.println("Input : " + input1);
        System.out.println("Output : " + solution.isPalindrome(input1));
        String input2 = "race a car";
        System.out.println("Input : " +input2);
        System.out.println("Output : " + solution.isPalindrome(input2));
        String input3 = " ";
        System.out.println("Input : " + input3);
        System.out.println("Output : " + solution.isPalindrome(input3));
    }
}