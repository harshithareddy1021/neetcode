class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res=new ArrayList<>();
        cs(nums,res,new ArrayList(),target,0);
        return res;

        
    }
    public void cs(int []nums,List<List<Integer>> res,List<Integer> temp, int target, int s){
        if(target==0)res.add(new ArrayList<>(temp));
        else if(target<0)return;
        for(int i=s;i<nums.length;i++){
            temp.add(nums[i]);
            cs(nums,res,temp,target-nums[i],i);
            temp.remove(temp.size()-1);
        }
        

    }
}
