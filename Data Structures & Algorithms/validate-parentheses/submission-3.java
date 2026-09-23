class Solution {
    public boolean isValid(String s) {
        if(s.length()%2==1)
        return false;
        Stack<Character> stk = new Stack<>();
        for(int i=0; i<s.length();i++){
            char c = s.charAt(i);
            if(c=='[' || c == '(' || c=='{')
                stk.push(c);
            else {
                if(stk.isEmpty())
                    return false;
                char top = stk.peek();
                if( (c==')' && top =='(') ||
                    (c=='}' && top == '{') ||
                    (c == ']' && top == '[')){
                    stk.pop();
                    }
                else {
                    return false;
                }
            }
        }
        return stk.size()==0;
    }
}
