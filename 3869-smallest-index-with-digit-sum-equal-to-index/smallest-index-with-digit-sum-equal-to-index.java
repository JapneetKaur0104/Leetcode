class Solution {
    private int sum(int n){
        if(n < 10) return n;

        int ans = 0;
        while(n > 0){
            ans += (n % 10);
            n = n / 10;
        }
        return ans;
    }
    public int smallestIndex(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            if(sum(nums[i]) == i) return i;
        }
        return -1;
        
    }
}