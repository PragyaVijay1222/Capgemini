public class Solution{
    public int findUniquePeak(int[] nums) {

        int count = 0;
        int index = 0;
        for(int i=1; i<nums.length-1; i++){
            if(nums[i]>nums[i-1] && nums[i]>nums[i+1]){
                count++;
                index = i;
            }
        }

        if(count!=1){
            return -1;
        }
        return index;
    }
}
