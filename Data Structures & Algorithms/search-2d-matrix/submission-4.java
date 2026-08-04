class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int n=matrix.length;
        int m= matrix[0].length;
        int total= m*n;

        int start=0;
        int end=total-1;

        while(end>=start){

            int mid = (start+end)/2;

            int row= (mid/m);
            int com= (mid%m);
           

            

            if(matrix[row][com]==target){
                return true;
            }else if(matrix[row][com]>target){
                end=mid-1;

            }else{
                start=mid+1;
            }

        }

        return false;
        
    }
}
