class Solution {
    public int minSwaps(String s) {
        Stack<Character>st = new Stack<>();
        int ans=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='[')
            {
                st.push(s.charAt(i));
            }
            else
            {
                if(st.isEmpty())
                {
                    ans++;
                }
                else
                {
                    st.pop();
                }
            }
        }
        return (ans+1)/2;
    }
}