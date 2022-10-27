class Solution {
    public String reverseWords(String s) {
        String A[]=s.split(" ");
        String a="";
        int len=s.length();
        for(String i:A){
            String p="";
            for(int j=i.length()-1;j>=0;j--){
                p+=i.charAt(j);
            }
            a+=" "+p;
        }
        return a.strip();
        
    }
}