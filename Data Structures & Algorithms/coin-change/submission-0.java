class Solution {
    public int coinChange(int[] coins, int amount) {
        int []amt=new int[amount+1];
        Arrays.fill(amt,amount+1);
        amt[0]=0;
        for(int i=1;i<=amount;i++){
            for(int c:coins){
                if(c<=i)amt[i]=Math.min(amt[i],amt[i-c]+1);
            }
        }
        return amt[amount]>amount? -1:amt[amount];
        
    }
}
