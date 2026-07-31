class Solution {
    public int countSubstrings(String s) {
        int tot=0;
        for(int i=0;i<s.length();i++){
            tot+=cs(s,i,i)+cs(s,i,i+1);
        }
        return tot;


    }
    public int cs(String s,int l,int r){
        int cnt=0;
        while(l>=0&&r<s.length()){
            if(s.charAt(l)!=s.charAt(r))break;
            l--;
            r++;
            cnt++;
        }
        return cnt;
    }
}
