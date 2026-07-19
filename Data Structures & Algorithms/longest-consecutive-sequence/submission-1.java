class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int max=0;
        for(int i:nums){
            set.add(i);
        }
        for(int i:set){
            int c=1;
            if(!set.contains(i-1)){
                while(set.contains(i+1)){
                    c++;
                    i++;
                }   
            }
        max=Math.max(max,c);
        }
        return max;
        
    }
}
