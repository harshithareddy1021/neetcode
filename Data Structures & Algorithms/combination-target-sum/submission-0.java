class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res= new ArrayList();
        cs(res,nums,target,new ArrayList(),0);
        return res;
        
    }
    public void cs(List<List<Integer>> res,int []nums,int t,List<Integer> temp,int s){
        if(t==0)res.add(new ArrayList(temp));
        if(t<0)return;
        for(int i=s;i<nums.length;i++){
            temp.add(nums[i]);
            cs(res,nums,t-nums[i],temp,i);
            temp.remove(temp.size()-1);

        }

    }
}
