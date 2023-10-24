public class Solution {
    public boolean isPalindrome(String symbol) {

        if (symbol.isEmpty()) {
            return true;
        }
        int start = 0;
        int last = symbol.length() - 1;
        while (start <= last) {
            char currFirst = symbol.charAt(start);
            char currLast = symbol.charAt(last);
            if (!Character.isLetterOrDigit(currFirst)) {
                start++;
            } else if (!Character.isLetterOrDigit(currLast)) {
                last--;
            } else {
                if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
                    return false;
                }
                start++;
                last--;
            }
        }
        return true;
    }

}
