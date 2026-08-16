class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int fleets=0;
        int n=position.length;
        int [][]newSpeed=new int[n][2];
          double previousTime = 0;
        for(int i=0;i<n;i++){
            newSpeed[i][0]=position[i];
            newSpeed[i][1]=speed[i];
        }

        Arrays.sort(newSpeed,(a,b)->b[0]-a[0]);


        for(int i=0;i<n;i++){
            // calcuate the time
            double time=((double)(target-newSpeed[i][0])/newSpeed[i][1]);
            if(time>previousTime){
                   previousTime = time;
                   fleets++;
            }
        }

        return fleets;
        
    }
}
