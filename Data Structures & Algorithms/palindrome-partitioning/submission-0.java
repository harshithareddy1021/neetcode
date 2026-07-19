class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList();
        ps(res,s,new ArrayList(),0);
        return res;

        
    }
    public void ps(List<List<String>> res,String s, List<String> temp,int st){
        if(st==s.length())res.add(new ArrayList(temp));
        for(int i=st;i<s.length();i++){
            if(check(s,st,i)){
                temp.add(s.substring(st,i+1));
                ps(res,s,temp,i+1);
                temp.remove(temp.size()-1);
            }
        }
    }
    public boolean check(String s,int st,int e){
        while(st<e){
            if(s.charAt(st)!=s.charAt(e))return false;
            st++;
            e--;
        }
        return true;
    }
}
