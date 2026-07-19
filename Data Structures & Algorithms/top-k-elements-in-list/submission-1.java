class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        PriorityQueue<int []> q=new PriorityQueue<>((a,b)->a[0]-b[0]);
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            q.add(new int[]{e.getValue(),e.getKey()});
            if(q.size()>k){
                q.remove();
            }
        }
        int []res=new int[k];

        for(int i=0;i<k;i++){
            res[i]=q.remove()[1];
        }
        return res;
        

        
    }
}
