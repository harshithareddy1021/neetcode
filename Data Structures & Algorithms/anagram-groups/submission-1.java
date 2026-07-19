class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> res=new HashMap<>();
        for(String s:strs){
            int []cnt=new int[26];
            for(char c:s.toCharArray()){
                cnt[c-'a']++;
            }
            String n=Arrays.toString(cnt);
            res.putIfAbsent(n,new ArrayList<>());
            res.get(n).add(s);

        }
        return new ArrayList<>(res.values());

        
    }
}
