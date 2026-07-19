class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res= new ArrayList();
        Arrays.sort(candidates);
        cs(res,candidates,target,new ArrayList(),0);
        return res;
        
    }
    public void cs(List<List<Integer>> res,int []nums,int t,List<Integer> temp,int s){
        if(t==0)res.add(new ArrayList(temp));
        if(t<0)return;
        for(int i=s;i<nums.length;i++){
            if(i>s&&nums[i]==nums[i-1])continue;
            temp.add(nums[i]);
            cs(res,nums,t-nums[i],temp,i+1);
            temp.remove(temp.size()-1);

        }

     
    }
}
