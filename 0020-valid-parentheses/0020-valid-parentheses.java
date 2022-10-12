class Solution {
    public boolean isValid(String str) {
          // add your code here
              Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c=='{' || c=='(' || c=='[') s.push(c);
            else {
                if(s.isEmpty()) return false;
                else {
                    char a=s.peek();
                    
                    if(c==')' && a=='(' ||  c=='}' && a=='{' || c==']' && a=='[') s.pop();
                    else return false;
                }
            }
        }
        if(s.isEmpty()) return true;
        else return false;
    }
}