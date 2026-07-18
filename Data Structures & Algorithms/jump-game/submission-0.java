class Solution {
    public boolean canJump(int[] nums) {
        return canReach(0,nums);
    }

    boolean canReach(int index,int []nums){

    if(index>=nums.length)    return false;
    if(index == nums.length - 1)
        return true;

    for(int i=1;i<=nums[index];i++){
        if(canReach(index+i,nums))
            return true;
    }

    return false;
}
}
