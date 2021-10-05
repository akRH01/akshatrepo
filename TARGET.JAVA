class Solution {
    public int search(int[] nums, int target) {
     int l=0; int r=nums.length-1; int x=target;
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == x)
                return mid;
  
            if (nums[mid] > x)
                return binarySearch(nums, l, mid - 1, x);
  
            
            return binarySearch(nums, mid + 1, r, x);
        }
        return -1;
    }
        
    }
    
}
