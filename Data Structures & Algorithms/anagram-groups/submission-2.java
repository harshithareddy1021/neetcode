class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap();
        for(String s:strs){
            char [] ch=s.toCharArray();
            Arrays.sort(ch);
            String n=new String(ch);
            map.putIfAbsent(n,new ArrayList());
            map.get(n).add(s);
        }
        return new ArrayList<>(map.values());
        
    }
}
