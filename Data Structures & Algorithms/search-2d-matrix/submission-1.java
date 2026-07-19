class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l=0,h=matrix.length-1;
        int c=matrix[0].length-1;
        while(l<=h){
            int m=l+(h-l)/2;
            if(target>=matrix[m][0]&&target<=matrix[m][c]){
                return bs(matrix,m,target);
            }
            else if(target>matrix[m][c])l=m+1;
            else h=m-1;
        }
        return false;


        
        
    }
    public boolean bs(int [][]a,int r,int t){
        int l=0,h=a[0].length-1;
        while(l<=h){
            int m=l+(h-l)/2;
            if(a[r][m]==t)return true;
            else if(a[r][m]>t)h=m-1;
            else l=m+1;
        }
        return false;
    }
}
