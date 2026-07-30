class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        boolean []bool=new boolean[nums.length];
        per(nums,res,new ArrayList(),bool);
        return res;
        
    }
    private void per(int []nums,List<List<Integer>> res,List<Integer> temp,boolean []bool){
        if(temp.size()==nums.length)res.add(new ArrayList(temp));
        for(int i=0;i<nums.length;i++){
            if(bool[i])continue;
            temp.add(nums[i]);
            bool[i]=true;
            per(nums,res,temp,bool);
            temp.remove(temp.size()-1);
            bool[i]=false;
        }

    }
}
