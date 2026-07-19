class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList();
        subset( res,nums,new ArrayList(),0);
        return res;
        
    }
    public void subset(List<List<Integer>> res,int []nums,List<Integer> temp,int s){
        res.add(new ArrayList(temp));
        for(int i=s;i<nums.length;i++){
            temp.add(nums[i]);
            subset(res, nums,temp,i+1);
            temp.remove(temp.size()-1);
        }
        
    }
}
