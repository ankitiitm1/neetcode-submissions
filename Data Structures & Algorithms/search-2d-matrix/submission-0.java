class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length; // rows
        int n=matrix[0].length; //columns
        int start=0;
        int end=m*n-1;


        while(start<=end){

            int mid=(start+end)/2;
            int midElement=matrix[mid/n][mid%n];

            if(midElement==target){
                return true;
            }else if(midElement>target){
                end=mid-1;
            }else{
               start=mid+1; 
            }


        }

        return false;
        
    }
}