class Solution {
    public String reverseParentheses(String s) {
        char[] c = s.toCharArray();
        int i=0;
        Stack<Integer>st = new Stack<>();
        while(i<s.length())
        {
            if(s.charAt(i)=='(')
            {
                st.push(i);
            }
            else if(s.charAt(i)==')')
            {
                c = rev(st.pop()+1,i,c);
            }
            i++;
        }
        StringBuilder ss = new StringBuilder();

        for(int j=0;j<c.length;j++)
        {
            if(c[j]!='(' && c[j]!=')')
            {
                ss.append(c[j]);
            } 
        }
        
        return ss.toString();
    }
    public char[] rev(int start, int end, char[] c)
    {
        char temp;
        while(start<end)
        {
            temp = c[start];
            c[start] = c[end];
            c[end] = temp;

            start++;
            end--;
        }

        return c;
    }
}