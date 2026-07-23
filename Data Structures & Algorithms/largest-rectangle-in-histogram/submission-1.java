class Solution {
    public int largestRectangleArea(int[] heights) {
        int max=0, n=heights.length;
        int []r=new int[n];
        Arrays.fill(r,n-1);
        Stack<Integer> st=new Stack();
        for(int i=0;i<n;i++){
            while(!st.isEmpty()&&heights[st.peek()]>heights[i]){
                r[st.peek()]=i-1;
                st.pop();
            }
            st.push(i);
        }
        int []l=new int[n];
        st.clear();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty()&&heights[st.peek()]>heights[i]){
                l[st.peek()]=i+1;
                st.pop();
            }
            st.push(i);
        }
        for(int i=0;i<n;i++){
        
            max=Math.max(max,heights[i]*(r[i]-l[i]+1));
        }
        return max;
        
    }
}
