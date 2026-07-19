class Solution {
    public int missingNumber(int[] nums) {
       
        for(int i=0;i<nums.length;i++){
            int j=i;
            while(j<nums.length&&nums[j]!=i){
                j++;
            }
            if(j<nums.length&&i!=j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            }
            
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i)return i;
        }
        return nums.length;
    }
}
