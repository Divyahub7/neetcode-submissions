class Solution {

    public String generateKey(int[] freq) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<freq.length; i++) {
            sb.append("#");
            sb.append(freq[i]);
        }
        return sb.toString();
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];

            int freq[] = new int[26];
            for(int j=0; j<str.length(); j++) {
                char ch = str.charAt(j);
                freq[ch - 'a']++;
            }
            
            String key = generateKey(freq);

            if(map.containsKey(key)) {
                map.get(key).add(str);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(key, list);
            }
        }

        return new ArrayList<>(map.values());
    }
}
