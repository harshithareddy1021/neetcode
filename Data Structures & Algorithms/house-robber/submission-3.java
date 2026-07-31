class Solution {
    public int rob(int[] nums) {
       
        if(nums.length<2)return nums[0];
        int prev=0;
        int cur=0;
        for(int i=0;i<nums.length;i++){
            int temp=cur;
            cur=Math.max(cur,prev+nums[i]);
            prev=temp;
        }
        return cur;

        
    }
}
