class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int N = 0;
        for(int i = 0; i<n ; i++){
            N += nums[i];
        }
        int val = (n*(n+1))/2;
        int total = val - N;
        return total;
    }
}