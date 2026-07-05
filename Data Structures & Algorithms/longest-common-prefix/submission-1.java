class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = "";
        if (strs.length == 0)
            return ans;

        ans = strs[0];

        for (int i = 1; i < strs.length; i++) {
            String str = strs[i];
            int j = 0;
            while (j < str.length() && j < ans.length() && str.charAt(j) == ans.charAt(j)) {
                j++;
            }
            ans = str.substring(0, j);
            if(ans.isEmpty()) break;
        }

        return ans;
    }
}