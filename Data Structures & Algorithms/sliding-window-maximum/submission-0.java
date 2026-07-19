class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int []res=new int[nums.length-k+1];
        int j=0;
        Deque<Integer> q=new ArrayDeque<>();
        for(int r=0;r<nums.length;r++){
            while(!q.isEmpty()&&nums[r]>nums[q.getLast()]){
                q.removeLast();
            }
            while(!q.isEmpty()&&r-q.getFirst()+1>k){
                q.removeFirst();
            }
            q.addLast(r);

            if(r>=k-1){
                res[j++]=nums[q.getFirst()];
            }
            

        }
        return res;
        
    }
}
