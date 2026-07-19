class Solution {
    public int characterReplacement(String s, int k) {
        int []f=new int[26];
        int l=0,maxfreq=0,res=0,r=0;
        while(r<s.length()){
            f[s.charAt(r)-'A']++;
            maxfreq=Math.max(maxfreq,f[s.charAt(r)-'A']) ;
            
            while((r-l+1)-maxfreq>k){
                f[s.charAt(l)-'A']--;
                l++;
               

            }
            res=Math.max(res,r-l+1);
            r++;
        }
        return res;
        
    }
}
