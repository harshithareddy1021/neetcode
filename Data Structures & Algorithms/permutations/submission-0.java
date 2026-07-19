class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res= new ArrayList();
        cs(res,nums,new ArrayList(),0);
        return res;
        
    }
    public void cs(List<List<Integer>> res,int []nums,List<Integer> temp,int s){
        if(temp.size()==nums.length){
            
            res.add(new ArrayList(temp));
            return;
        }
        
       
        for(int i=0;i<nums.length;i++){
            if(temp.contains(nums[i]))continue;
            temp.add(nums[i]);
            cs(res,nums,temp,i+1);
            temp.remove(temp.size()-1);

        }

    
        
    }
}
