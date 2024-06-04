class Solution {
    public boolean isValid(String st) {
        Stack<Character>s = new Stack<>();

        for(char c:st.toCharArray())
        {
            if(c=='(' || c=='{' || c=='[')
            {
                s.push(c);
            }
            else
            {
                if(c==')')
                {
                    if(!s.isEmpty() && s.peek()=='(')
                    {
                        s.pop();
                    }
                    else
                    {
                        return false;
                    }
                }
                else if(c==']')
                {
                    if(!s.isEmpty() && s.peek()=='[')
                    {
                        s.pop();
                    }
                    else
                    {
                        return false;
                    }
                }
                else if(c=='}')
                {
                    if(!s.isEmpty() && s.peek()=='{')
                    {
                        s.pop();
                    }
                    else
                    {
                        return false;
                    }
                }
                
            }
        }

        return s.isEmpty();
    }
}