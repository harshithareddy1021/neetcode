class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>>res=new ArrayList<>();
        pp(s,res,new ArrayList(),0);
        return res;
        
    }
    private void pp(String s, List<List<String>> res,List<String> temp,int st){
        if(st==s.length())res.add(new ArrayList(temp));
        for(int i=st;i<s.length();i++){
            if(check(s,st,i)){
                temp.add(s.substring(st,i+1));
                pp(s,res,temp,i+1);
                temp.remove(temp.size()-1);

            }

        }

    }
    private boolean check(String s,int st,int e){
        while(st<e){
            if(s.charAt(st)!=s.charAt(e)) return false;
            st++;
            e--;
        }
        return true;
    }
}
