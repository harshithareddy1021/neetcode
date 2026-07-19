class Solution {
   
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())return false;
        int []s=new int[26];
        int []f=new int[26];
       
        for(int i=0;i<s1.length();i++){
             f[s2.charAt(i)-'a']++;
             s[s1.charAt(i)-'a']++;
        }
        int l=0,r=s1.length();
        if(check(s,f)) return true;
        
        while(r<s2.length()){
            
            f[s2.charAt(r)-'a']++;
           
            f[s2.charAt(l)-'a']--;
            l++;
            
            if(check(s,f))return true;
            r++;
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

