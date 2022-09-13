class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int low = 1 , high = n-1;
        while(low < high){
            int mid = (low + high)/ 2;
            int count = 0; 
            for(int i = 0; i < n; i++){
                if(nums[i] <= mid)
                        count++;
            }
            
            if(count > mid){
                high = mid;
            }
            else{
                low = mid+1;
            }
        }
        
        return high;
        
    }
}


//n^2 approach---
// class Solution {
//     public int findDuplicate(int[] nums) {
//         int n = nums.length;
//         int count = 0;
//         for(int i = 0; i < n; i++){
//             for(int j = i+1; j < n; j++){
//                 if(nums[i] == nums[j])
//                         count = i;
//             }
//         }
        
//         return nums[count];
//     }
// }