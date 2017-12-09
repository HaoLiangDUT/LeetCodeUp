/**
 * Created by Administrator on 2017/12/9.
 */
public class Solution {
    public int searchInsert(int[] nums, int target) {
        int length = nums.length;
        int left = 0,right = length - 1;
        int result = 0;
        while(left <= right){
            int mid = (left+right)/2;
            if(nums[mid] > target)
                right = mid-1;
            else if(nums[mid] < target)
                left = mid+1;
            else
                return mid;
        }
        return left;
    }
}
