class Solution {

    public String encode(List<String> strs) {
        if (strs.isEmpty()) return "";

        StringBuilder res = new StringBuilder();
        // List<Integer> sizes = new ArrayList<>();

        for(String str : strs) {
            // sizes.add(str.length());
            res.append(str.length());
            res.append(',');
        }
        // for(int size : sizes) {
        //     res.append(size).append(',');
        // }
        res.append('#');
        for(String str : strs) {
            res.append(str);
        }
        return res.toString();
    }

    public List<String> decode(String str) {
        if (str.length() == 0) return new ArrayList<>();

        List<String> res = new ArrayList<>();
        List<Integer> sizes = new ArrayList<>();

        int i=0;
        
        while(str.charAt(i) != '#') {
            StringBuilder currSize = new StringBuilder();
            while(str.charAt(i) != ',') {
                currSize.append(str.charAt(i));
                i++;
            }
            sizes.add(Integer.parseInt(currSize.toString()));
            i++; // ',' found
        }
        i++;  // '#' found
        for(int sz : sizes) {
            res.add(str.substring(i, i + sz));
            i += sz;
        }
        return res;
    }
}
