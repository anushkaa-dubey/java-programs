class Solution {
    public int countSubarrays(int[] nums) {
        int count=0;
    for(int i=0;i<nums.length-2;i++){
        int x=nums[i];
        int y=nums[i+1];
        int z=nums[i+2];
        if(2*(x+z)==y){
            count++;
        }
    }
    return count;    
    }

}
