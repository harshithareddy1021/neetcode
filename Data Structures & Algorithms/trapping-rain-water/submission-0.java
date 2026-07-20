class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int max=0;
        int []l=new int[n];
        int []r=new int[n];
        r[n-1]=height[n-1];
        l[0]=height[0];

        for(int i=1;i<n;i++){
            l[i]=Math.max(height[i],l[i-1]);
            r[n-i-1]=Math.max(height[n-i-1],r[n-i]);

        }
        for(int i=0;i<n;i++){
           max+=Math.min(l[i],r[i])-height[i];

        }
        return max;
        
    }
}
