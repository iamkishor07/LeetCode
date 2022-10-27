class Solution {
    public String reverseWords(String s) {
        String A[]=s.split(" ");
        String a="";
        int len=s.length();
        for(String i:A){
            for(int j=i.length()-1;j>=0;j--){
                a+=i.charAt(j);
            }
            a+=" ";
        }
        return a.strip();
        
    }
}