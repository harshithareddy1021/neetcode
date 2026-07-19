class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList();
        per(res,nums,new ArrayList());
        return res;
        
    }
    public void per(List<List<Integer>> res,int []nums,List<Integer> temp){
        if(temp.size()==nums.length){
            res.add(new ArrayList(temp));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(temp.contains(nums[i]))continue;
            temp.add(nums[i]);
            per(res,nums,temp);
            temp.remove(temp.size()-1);
        }

    }
}
