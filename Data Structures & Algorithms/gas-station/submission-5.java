class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gasTotal=sum(gas);
        int costTotal=sum(cost);
        if(costTotal>gasTotal)return -1;

        int tank=0;
        int ans=0;
        for(int i=0;i<gas.length;i++){
            tank=tank+gas[i]-cost[i];
            if(tank<0){
                //reset
                ans=i+1;
                tank=0;
            }
        }
        return ans;

    }
}
public int sum(int []arr){
    int res=0;
for(int x:arr){
res+=x;
}
return res;
}