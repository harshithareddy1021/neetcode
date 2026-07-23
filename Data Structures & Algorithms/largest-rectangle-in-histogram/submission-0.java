class Solution {
    public int largestRectangleArea(int[] heights) {
        int max=0, n=heights.length;
        for(int i=0;i<n;i++){
            int l=i-1, r=i+1;
            while(l>=0&&heights[l]>=heights[i])l--;
            while(r<n&&heights[r]>=heights[i])r++;
            l++;
            r--;
            max=Math.max(max,heights[i]*(r-l+1));
        }
        return max;
        
    }
}
