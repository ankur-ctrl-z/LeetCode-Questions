class Solution {
    public int maxProduct(String s) {
        return dfs(s.toCharArray(),"","",0,0);
    }
    
    public int dfs(char[] arr,String s,String p,int pos,int max){
        if(pos == arr.length){
            if(isValid(s) && isValid(p))max = Math.max(max,s.length() * p.length());
            return max;
        }
        return Math.max(dfs(arr,s + arr[pos],p,pos + 1,max),Math.max(dfs(arr,s,p + arr[pos],pos+1,max),dfs(arr,s,p,pos+1,max)));
    }
    
    public boolean isValid(String s){
        int i = 0,j = s.length()-1;
        while(i < j)if(s.charAt(i++) != s.charAt(j--))return false;
        return true;
    }
}