class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0 , j = 0;
        while(i < nums.length-1){
            while(i < nums.length-1 && nums[j] >= nums[i+1]){
                i++;
            }
            if(i < nums.length-1 ){
                int c = nums[j+1];
                nums[j+1] = nums[i+1];
                nums[i+1] = c;
                j++;
                i++;
            }
        }
        
        return j+1;
        
    }
}