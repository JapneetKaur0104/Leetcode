class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n = nums.length;
        int min = nums[0];
        int max = nums[0];
        for(int i = 1; i < n; i++){
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        int[] temp = new int[max];
        for(int i = 0; i < n; i++){
            temp[nums[i] - min]++;
        }

        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < max; i++){
            if(i + min > max) break;
            if(temp[i] == 0) ans.add(i + min);
        }

        return ans;
    }
}
