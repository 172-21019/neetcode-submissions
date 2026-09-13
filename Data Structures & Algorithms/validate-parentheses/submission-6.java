class Solution {
    public boolean isValid(String s) {
        char[] sArr = s.toCharArray();
        Stack<Character> st=new Stack<>();
        for(char ch : sArr){
            if(ch=='('||ch=='['||ch=='{'){
                st.push(ch);
            }
            else if(ch==')'&&!st.isEmpty()&&'('==st.peek()){
                st.pop();
            }
            else if(ch=='}'&&!st.isEmpty()&&'{'==st.peek()){
                st.pop();
            }
            else if(ch==']'&&!st.isEmpty()&&'['==st.peek()){
                st.pop();
            }
            else{
                return false;
            }
        }
        if(!st.isEmpty()){
            return false;
        }
        return true;
    }
}
