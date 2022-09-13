class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int i = 0 , l = 0;      //if found 0-swap with initial position l
        int r = n-1;            //if found 2-swap with initial position r
        
        while(i <= r){
            if(nums[i] == 0){
                //swap(nums[l] , nums[i]);
                int c = nums[l];
                nums[l] = nums[i];
                nums[i] = c;
                l++;
                i++;
            }
             else if(nums[i] == 2){
                //swap(nums[r] , nums[i]);
                int c = nums[r];
                nums[r] = nums[i];
                nums[i] = c;
                r--;
            }
            else{
                i++;
            }
        }
        
    }
    
}