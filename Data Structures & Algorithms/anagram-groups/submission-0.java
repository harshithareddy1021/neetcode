class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> res=new HashMap<>();
        for(String s:strs){
            char []c=s.toCharArray();
            Arrays.sort(c);
            String n=new String(c);
            res.putIfAbsent(n,new ArrayList<>());
            res.get(n).add(s);

        }
        return new ArrayList<>(res.values());

        
    }
}
