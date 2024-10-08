class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder st = new StringBuilder();

        for(char a: s.toCharArray())
        {
            if(Character.isLetterOrDigit(a))
                st.append(Character.toLowerCase(a));
        } 

        s = st.toString();
        System.out.println(s.length());
        if(s.length()==1)
        {
            return true;
        }
        int left = 0, right = s.length()-1;
        while(left<right)
        {
            if(s.charAt(left)!=s.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}