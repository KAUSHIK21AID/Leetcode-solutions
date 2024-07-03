class Solution {
    public int minDifference(int[] arr) {
        int n = arr.length;
        if (n <= 4) {
            return 0;
        }
        Arrays.sort(arr);
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < 4; i++) {
            res = Math.min(res, arr[n - 1 - 3 + i] - arr[i]);
        }
        return res;
    }
}