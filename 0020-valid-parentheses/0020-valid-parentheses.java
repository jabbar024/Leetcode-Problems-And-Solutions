class Solution {
    public boolean isValid(String s) 
    {
        Stack<Character> st = new Stack<Character>();

        if(s.length()%2 != 0)
        {
            return false;
        }

        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{')
            {
                st.push(ch);
            }
            else if(ch==')' && !st.isEmpty() && st.peek()=='(')
            {
                st.pop();
            }
             else if(ch=='}' && !st.isEmpty() && st.peek()=='{')
            {
                st.pop();
            }
             else if(ch==']' && !st.isEmpty() && st.peek()=='[')
            {
                st.pop();
            }
            else
            {
                return false;
            }
        }


        return st.isEmpty();   
    }
}