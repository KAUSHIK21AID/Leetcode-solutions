class Solution {
    public boolean validPalindrome(String s) {
        int left=0, right = s.length()-1;
        int count=0;
        while(left<right)
        {
            if(s.charAt(left)!=s.charAt(right))
            {
                return checkpal(s,left+1,right)||checkpal(s,left,right-1);
            }
            left++;
            right--;
        }
        return true;
    }
    public boolean checkpal(String s, int left, int right)
    {
        
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