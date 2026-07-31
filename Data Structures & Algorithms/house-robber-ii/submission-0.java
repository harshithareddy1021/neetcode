class Solution {
    public int rob(int[] nums) {
       
        if(nums.length<2)return nums[0];
        return Math.max(rob(nums,0,nums.length-1),rob(nums,1,nums.length));
    }
    private int rob(int []nums,int s,int e){
        int prev=0;
        int cur=0;
        for(int i=s;i<e;i++){
            int temp=cur;
            cur=Math.max(cur,prev+nums[i]);
            prev=temp;
        }
        return cur;
    }
}
