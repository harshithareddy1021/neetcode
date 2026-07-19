class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int l=1,high=piles[piles.length-1];
        while(l<=high){
            int m=l+(high-l)/2;
            int hours=0;
            for(int i:piles){
                hours+=(i%m==0)?i/m:(i/m)+1;
            }
            if(hours<=h)high=m-1;
            else l=m+1;
        }
        return l;

        
    }
}
