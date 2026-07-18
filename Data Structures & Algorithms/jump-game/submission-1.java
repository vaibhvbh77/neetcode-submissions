class Solution {
    public boolean canJump(int[] nums) {
        int good=nums.length-1;
        for(int i=nums.length-2;i>=0;i--){
            int jump=nums[i];
            //for any jump 1-nums[i] i can reach to good it is good
            if(jump+i>=good)good=i;
        }
        return good==0?true:false;
    }
}
