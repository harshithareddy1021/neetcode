class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=0,r=numbers.length-1;
        while(l<r){
            int v=numbers[l]+numbers[r];
            if(v==target)return new int[]{l+1,r+1};
            else if(v>target)r--;
            else l++;
        }
        return new int[]{};
    }
}
