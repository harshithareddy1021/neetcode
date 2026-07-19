class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<int []> l=new ArrayList<>();
        for(Map.Entry<Integer, Integer> e:map.entrySet()){
            l.add(new int[]{e.getValue(),e.getKey()});
        }
        Collections.sort(l,(a,b)->b[0]-a[0]);
        int []res=new int[k];
        for(int i=0;i<k;i++){
            res[i]=l.get(i)[1];
        }
        return res;
        
    }
}
