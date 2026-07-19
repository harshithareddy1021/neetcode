class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int []p=new int[n];
        
        int pre=1;
        for(int i=0;i<n;i++){
            p[i]=pre;
            pre*=nums[i];
        }
        pre=1;
        for(int i=n-1;i>=0;i--){
            p[i]=p[i]*pre;
            pre*=nums[i];

        }
        return p;

        
    }
}  
