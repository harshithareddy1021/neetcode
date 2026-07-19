class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res= new ArrayList();
        Arrays.sort(nums);
        cs(res,nums,new ArrayList(),0);
        return res;
        
    }
    public void cs(List<List<Integer>> res,int []nums,List<Integer> temp,int s){
        res.add(new ArrayList(temp));
        for(int i=s;i<nums.length;i++){
            if(i>s&&nums[i]==nums[i-1])continue;
            temp.add(nums[i]);
            cs(res,nums,temp,i+1);
            temp.remove(temp.size()-1);

        }

    
        
    }
}
