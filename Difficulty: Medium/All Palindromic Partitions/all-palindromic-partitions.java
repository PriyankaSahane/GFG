import java.util.*;

class Solution {
    public ArrayList<ArrayList<String>> palinParts(String s) {
        ArrayList<ArrayList<String>> result = new ArrayList<>();
        backtrack(s, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(String s, int start, ArrayList<String> current, ArrayList<ArrayList<String>> result) {
        if (start == s.length()) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < s.length(); i++) {
            String sub = s.substring(start, i + 1);
            if (isPalindrome(sub)) {
                current.add(sub);
                backtrack(s, i + 1, current, result);
                current.remove(current.size() - 1); // backtrack
            }
        }
    }

    private boolean isPalindrome(String str) {
        int l = 0, r = str.length() - 1;
        while (l < r) {
            if (str.charAt(l) != str.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}
