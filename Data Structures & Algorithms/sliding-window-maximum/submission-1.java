class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int []res=new int[n-k+1];
        Deque<Integer> q=new ArrayDeque();
        int j=0;
        for(int r=0;r<n;r++){
           
            while(!q.isEmpty() && q.getFirst()<=r-k)q.pollFirst();
            while(!q.isEmpty()&& nums[r]>nums[q.getLast()])q.pollLast();
            q.offerLast(r);
            if(r>=k-1){
                res[j++]=nums[q.getFirst()];
            }

        }
        return res;
        
    }
}
