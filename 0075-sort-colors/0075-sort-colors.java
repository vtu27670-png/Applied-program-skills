class Solution {
    public void sortColors(int[] nums) {
        int low = 0;             // Pointer for 0s (Red)
        int mid = 0;             // Pointer for current element
        int high = nums.length - 1; // Pointer for 2s (Blue)
        
        while (mid <= high) {
            if (nums[mid] == 0) {
                // Swap nums[mid] and nums[low], move both pointers forward
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                // 1 is in the middle, just move to the next element
                mid++;
            } else { // nums[mid] == 2
                // Swap nums[mid] and nums[high], move high pointer backward
                // Do NOT increment mid here because the swapped element from 'high' needs to be processed
                swap(nums, mid, high);
                high--;
            }
        }
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}