class Solution {
    public int characterReplacement(String s, int k) {
        int []f=new int[26];
        int l=0,ans=0,max=0,r=0;
        while(r<s.length()){
            f[s.charAt(r)-'A']++;
            for(int i=0;i<26;i++)ans=Math.max(ans,f[i]);
            
            while(r-l-ans>=k){
                f[s.charAt(l)-'A']--;
                l++;
               

            }
            max=Math.max(max,r-l+1);
            r++;
        }
        return max;
        
    }
}
