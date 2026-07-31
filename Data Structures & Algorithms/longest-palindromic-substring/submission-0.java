class Solution {
    public String longestPalindrome(String s) {
        int lp=0;
        int st=0;
        for(int i=0;i<s.length();i++){
            int odd=palindrome(s,i,i);
            int even=palindrome(s,i,i+1);
            int f=Math.max(odd,even);
            if(f>lp){
                lp=f;
                st=i-((f-1)/2);

            }
        }
        return s.substring(st,st+lp);
        
        
    }
    private static int palindrome(String s,int l,int r){
        while(l>=0&&r<s.length()){
            if(s.charAt(l)!=s.charAt(r))break;
            l--;
            r++;

        }
        return r-l-1;
    }
}
