class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        Arrays.sort(strs);
        String str1=strs[0];
        String str2=strs[n-1];
        int i=0;
        while(i<str1.length()){
if(str1.charAt(i)==str2.charAt(i)){
    i++;
}else{
    break;
}
        }
        return i==0?"":str1.substring(0,i);
    }
}
