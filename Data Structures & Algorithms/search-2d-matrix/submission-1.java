class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low=0;
        int high=matrix.length-1;
        int rows=matrix.length;
        int columns=matrix[0].length;
        int row=0;
        //catching the row
        while(low<=high){
            int mid=(low+high)/2;
            if(matrix[mid][0]==target){
                return true;
            }
            else if(matrix[mid][0]<=target && matrix[mid][columns-1]>=target){
                row=mid;
                break;
            }
            else if(matrix[mid][0]<target){
                low=mid+1;
            }
            else
            high=mid-1;
        }

        low=0;
        high=columns-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(matrix[row][mid]==target){
                return true;
            }
            else if(matrix[row][mid]<target){
                low=mid+1;
            }
            else
            high=mid-1;
        }
        return false;
        
    }
}
