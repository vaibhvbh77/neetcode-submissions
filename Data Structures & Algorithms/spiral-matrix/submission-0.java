class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rows=matrix.length;
        int columns=matrix[0].length;
        ArrayList<Integer> ans = new ArrayList<>();
        int top=0;
        int right=columns-1;
        int left=0;
        int bottom=rows-1;
        while(top<=bottom &&left<=right){
            //first row
            for(int i=left;i<=right;i++){
                ans.add(matrix[top][i]);
            }
            top++;
                //last column
            for(int i=top;i<=bottom;i++){
                 ans.add(matrix[i][right]);
            }
            right--;

                //last row in reverse
                if(top <= bottom) {
            for(int i=right;i>=left;i--){
                 ans.add(matrix[bottom][i]);
            }
            bottom--;}


if(left <= right) {
            for(int i=bottom;i>=top;i--){
                 ans.add(matrix[i][left]);
            }
            left++;}

  

        }
        return ans;

    }
}
