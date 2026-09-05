class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int cols=matrix[0].length;

        for(int i=0;i<row;i++){
            int left=0;
            int right=cols-1;
            // quick check
            if(matrix[i][left]<=target &&target<=matrix[i][right])
            {
                while(left<=right){
                    int middle=left+(right-left)/2;
                    if(target==matrix[i][middle]) return true;
                    else if(target>matrix[i][middle]){
                        left=middle+1;
                    }
                    else right=middle-1;
                }


            }
            else continue;

        }
        return false;

    }
}
