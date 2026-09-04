class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] largest = new int[n];
        int[] smallest = new int[n];
        
        largest[0] = nums[0];
        for(int i = 1; i < n; i++){
            if(nums[i] > largest[i - 1]){
                largest[i] = nums[i];
            }
            else{
                largest[i] = largest[i - 1];
            }
        }

        smallest[n - 1] = nums[n - 1];
        for(int i = n - 2; i >= 0; i--){
            if(nums[i] < smallest[i + 1]){
                smallest[i] = nums[i];
            }
            else{
                smallest[i] = smallest[i + 1];
            }
        }
        
        for(int i = 0; i < n; i++){
            if((largest[i] - smallest[i]) <= k){
                return i;
            }
        }
        return -1;
    }
}