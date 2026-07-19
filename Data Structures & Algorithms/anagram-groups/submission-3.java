class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap();
        for(String s:strs){
            int [] ch=new int[26];
            for(char c:s.toCharArray())ch[c-'a']++;
           
            String n=Arrays.toString(ch);
            map.putIfAbsent(n,new ArrayList());
            map.get(n).add(s);
        }
        return new ArrayList<>(map.values());
        
    }
}
