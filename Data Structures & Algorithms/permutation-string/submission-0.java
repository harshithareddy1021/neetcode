class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int []sf=new int[26];
        int []f=new int[26];

        int n=s1.length(),l=0;
        for(char c:s1.toCharArray())sf[c-'a']++;
        for(int r=0;r<s2.length();r++){
            f[s2.charAt(r)-'a']++;
            while(l<=r-n){
                f[s2.charAt(l)-'a']--;
                l++;
            }
            if(r>=n-1){
                if(check(sf,f))return true;
            }

        }
        return false;
        
    }
    public boolean check(int []sf,int []f){
        for(int i=0;i<26;i++){
            if(sf[i]!=f[i])return false;
        }
        return true;
    }
}
