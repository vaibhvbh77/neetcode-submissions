class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int counter=0;
        int n=nums1.length;
        int m=nums2.length;
        int total=n+m;
        int i=0;
        int j=0;
        int curr=0;
        int prev=0;
        while(counter!=(total/2)+1){
            //i >j
            prev=curr;

            if(i==n){
                curr=nums2[j];
                j++;
            }
             else if (j == m) {
                curr = nums1[i];
                i++;
            }
            else if(nums1[i] <= nums2[j]){
                curr = nums1[i];
                i++;
            }
            else{
                 curr=nums2[j];
                j++;
            }
            counter++;
        }

        if((total)%2==0){
            return (double)(prev+curr)/2;
        }
        else{
            return (double)curr;
        }
        
    }
}
