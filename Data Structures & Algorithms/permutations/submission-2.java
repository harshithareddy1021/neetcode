class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList();
        boolean []f=new boolean[nums.length];
        per(res,nums,new ArrayList(),f);
        return res;
        
    }
    public void per(List<List<Integer>> res,int []nums,List<Integer> temp,boolean []f){
        if(temp.size()==nums.length){
            res.add(new ArrayList(temp));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(f[i])continue;
            temp.add(nums[i]);
            f[i]=true;
            per(res,nums,temp,f);
            temp.remove(temp.size()-1);
            f[i]=false;
        }

    }
}
