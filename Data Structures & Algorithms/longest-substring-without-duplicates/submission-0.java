class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int i = 0, j = 0, length = 0, maxLength = 0;
        Set<Character> set = new HashSet<>();

        while(j < n) {
            char ch = s.charAt(j);

            if(set.contains(ch)) {
                while(set.contains(ch) && i < n) {
                    set.remove(s.charAt(i));
                    i++;
                    length--;
                }
            }
            else {
                set.add(ch);
                j++;
                length++;
                maxLength = Math.max(maxLength, length);
            }
        }
        return maxLength;
    }
}
