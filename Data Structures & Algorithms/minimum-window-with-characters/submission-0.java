class Solution {
    public String minWindow(String s, String t) {
        int []tf=new int[123];
        for(char c:t.toCharArray())tf[c]++;
        int []f=new int[123];
        int mins=0,min=Integer.MAX_VALUE,l=0;
        for(int r=0;r<s.length();r++){
            f[s.charAt(r)]++;
            while(check(tf,f)){
                if(min>r-l+1){
                    mins=l;
                    min=r-l+1;
                }
                
                f[s.charAt(l)]--;
                l++;
                
            }
        }
        if(min!=Integer.MAX_VALUE)return s.substring(mins,mins+min);
        return "";
        
    }

    public boolean check(int []tf,int []f){
        for(int i=0;i<123;i++){
            if(tf[i]>f[i])return false;
        }
        return true;
    }
}
