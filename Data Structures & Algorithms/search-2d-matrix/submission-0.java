class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l=0;
        int r=matrix.length;
        int c=matrix[0].length;
        int h=r*c-1;
        while(l<=h){
            int m=l+(h-l)/2;
            int v=matrix[m/c][m%c];
            if(v==target)return true;
            else if(v<target)l=m+1;
            else h=m-1;
        }
        return false;

        
        
    }
}
