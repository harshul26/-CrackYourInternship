class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] ts = new int[2];
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                int sum = nums[i] + nums[j];
                
                if(sum == target){
                    ts[0] = i;
                    ts[1] = j;
                    break;
                }
            }
            
            if(ts[1] != 0){
                break;
            }
        }
        
        return ts;
    }
}