class Solution {

    public String alphanumericString(String s) {
        StringBuilder sb = new StringBuilder();

        for(char ch : s.toCharArray()) {
            if(Character.isLetterOrDigit(ch)) {
                sb.append(Character.toLowerCase(ch));
            }
        }

        return sb.toString();
    }

    public boolean isPalindrome(String s) {
        if(s == "") return true;

        String str = alphanumericString(s);
        int l = 0, r = str.length()-1;

        while(l <= r) {
            char ch_l = str.charAt(l);
            char ch_r = str.charAt(r);

            if(ch_l != ch_r) {
                return false;
            }
            l++;
            r--;
         }
         return true;
    }
}
