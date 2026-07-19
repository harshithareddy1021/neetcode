class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int []s=new int[26];
        int []f=new int[26];
        int n=s1.length()-1;
        for(char c:s1.toCharArray()){
            s[c-'a']++;
        }
        int l=0;
        for(int r=0;r<s2.length();r++){
            f[s2.charAt(r)-'a']++;
            
            while(r-l>n){
                f[s2.charAt(l)-'a']--;
                l++;
            }
            if(r>=n&&check(s,f))return true;

        }
        return false;
        
    }
    public boolean check(int []s,int []f){
        for(int i=0;i<26;i++){
            if(s[i]!=f[i])return false;
        }
        return true;
    }
}
