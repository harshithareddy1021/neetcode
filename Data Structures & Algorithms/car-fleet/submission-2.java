class Solution {
    public int carFleet(int target, int[] position, int[] speed) {   
    int [][]n=new int[position.length][2];
    for(int i=0;i<position.length;i++){
        n[i][0]=position[i];
        n[i][1]=speed[i];
    }
    Arrays.sort(n,(a,b)->b[0]-a[0]);
    double p=0;
    int count=0;
    for(int []t:n){
        double c=(double)(target-t[0])/t[1];
        if(c>p){
            count++;
            p=c;
        }
    }
    return count;
    }

    
}
