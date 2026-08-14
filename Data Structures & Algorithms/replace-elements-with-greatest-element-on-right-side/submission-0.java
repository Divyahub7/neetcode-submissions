class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        res[n-1] = -1;
        if(n == 1) return res;

        res[n-2] = arr[n-1];

        int i = n-2;

        while(i > 0) {
            int greater = Math.max(arr[i], res[i]);
            res[i-1] = greater;
            i--;
        }
        return res;
    }
}