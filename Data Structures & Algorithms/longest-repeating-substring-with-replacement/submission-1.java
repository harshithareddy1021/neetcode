class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> map=new HashMap();
        int l=0,r=0,ans=0,max=0;
        while(r<s.length()){
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
            ans=Math.max(ans,map.get(s.charAt(r)));
            while(r-l+1-ans>k){
                map.put(s.charAt(l),map.getOrDefault(s.charAt(l),0)-1);
                if(map.get(s.charAt(l))==0)map.remove(s.charAt(l));
                l++;

            }
            max=Math.max(max,r-l+1);
            r++;
        }
        return max;

        
    }
}
