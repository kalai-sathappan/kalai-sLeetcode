class Solution {
    // Mapping of digits to corresponding letters
    private static final String[] KEYS = {
        "",     // 0
        "",     // 1
        "abc",  // 2
        "def",  // 3
        "ghi",  // 4
        "jkl",  // 5
        "mno",  // 6
        "pqrs", // 7
        "tuv",  // 8
        "wxyz"  // 9
    };
    
    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return new ArrayList<>();
        }
        return combine("", digits);
    }
    
    static List<String> combine(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> a = new ArrayList<>();
            a.add(p);
            return a;
        }
        
        ArrayList<String> ans = new ArrayList<>();
        int digit = up.charAt(0) - '0';  // Convert character to integer
        String letters = KEYS[digit];    // Get the corresponding letters
        
        for (char ch : letters.toCharArray()) {  // Iterate through each letter
            ans.addAll(combine(p + ch, up.substring(1)));
        }
        
        return ans;
    }
}
