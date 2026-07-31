class Solution {
    public int rob(int[] nums) {
        int f=nums[0];
        if(nums.length<2)return nums[0];
        int s=Math.max(f,nums[1]);
        int sum=Math.max(s,f);
        for(int i=2;i<nums.length;i++){
            sum=Math.max(s,f+nums[i]);
            f=s;
            s=sum;

        }
        return sum;
        
    }
}
