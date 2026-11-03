class Solution {
    public int minMoves(int[] nums) {
        int highest = nums[0];
        int ans = 0;
        for(int x: nums){
            if(x > highest){
                highest = x;
            }
        }

        for(int x: nums){
            ans += (highest - x);
        }

        return ans;
    }
}