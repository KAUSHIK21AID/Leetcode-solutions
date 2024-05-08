class Solution {
    public boolean isStrictlyPalindromic(int n) {
        boolean flag = false;

        for(int i=2;i<n-2;i++)
        {
            if(!ispalindrome(Integer.toString(n,i)))
            {
                flag = false;
                break;
            }
        }

        return flag;
    }
    public boolean ispalindrome(String s)
    {
        int left=0, right=s.length()-1;
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