class Solution {
    public String decodeString(String p) {
        // code here
        Stack<Character> s=new Stack<>();
        for(Character c:p.toCharArray()){
            if(c!=']')s.push(c);
            else{
                String str="";
                while(!s.isEmpty() && s.peek()!='['){
                    str=s.pop()+str;
                }
                s.pop();
                 String number="";
                while(!s.isEmpty() && s.peek() >='0' && s.peek()<='9'){
                    number=s.pop()+number;
                }
                int req=Integer.parseInt(number);
                String temp="";
                for(int i=0;i<req;i++){
                    temp+=str;
                }
                // s.push(temp);
                for(Character i:temp.toCharArray()){
                    s.push(i);
                }
                // System.out.println(str);
            }
        }
        String ans="";
        while(!s.isEmpty()){
            ans=s.pop()+ans;
        }
        return ans;
        
    }
}