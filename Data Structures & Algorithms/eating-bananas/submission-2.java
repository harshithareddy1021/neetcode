class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length-1;
        int l=1,ans=-1;
        Arrays.sort(piles);
        int r=piles[n];
        while(l<=r){
            int m=l+(r-l)/2;
            int tot=0;
            for(int i:piles){
                tot+=(i%m==0)? i/m:(i/m)+1;
                if(tot>h){
                    l=m+1;
                    break;
                }
            }
            if(tot<=h){
                ans=m;
                r=m-1;
            }

        }
        return ans;

        
    }
}
