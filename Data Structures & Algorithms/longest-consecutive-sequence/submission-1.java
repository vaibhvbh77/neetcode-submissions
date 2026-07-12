class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>set=new HashSet<Integer>();
        if(nums.length==0) return 0;
        int res=1;
        for(int i:nums)
        set.add(i);

        for(Integer x:set){
            int curr=1;
            while(set.contains(curr+x)){
                curr++;
            }
            res=Math.max(res,curr);
            curr=1;

        }
        return res;

    }
}
