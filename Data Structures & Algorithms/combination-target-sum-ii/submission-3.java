class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(candidates);
        cs(candidates,res,new ArrayList(),target,0);
        return res;
        
    }
    public void cs(int []nums,List<List<Integer>> res,List<Integer> temp,int target,int s){
        if(target==0){
            res.add(new ArrayList(temp));
        }
        else if(target<0)return;
        for(int i=s;i<nums.length;i++){
            if(i>s&&nums[i-1]==nums[i])continue;
            temp.add(nums[i]);
            cs(nums,res,temp,target-nums[i],i+1);
            temp.remove(temp.size()-1);
        }
    }
}
