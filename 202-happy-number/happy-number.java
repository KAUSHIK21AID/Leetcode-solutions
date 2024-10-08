class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer>hs = new HashSet<>();
        if(n==1)
        {
            return true;
        }
        while(n!=1)
        {
            int sum = digitsquare(n);
            if(!hs.contains(sum))
            {
                hs.add(sum);
            }
            else
            {
                return false;
            }

            n = sum;
            if(n==1)
            {
                return true;
            }
        }

        return false;
    }
    public int digitsquare(int n)
    {
        int sum = 0;
        while(n!=0)
        {
            int rem = n%10;
            sum = sum + (int)Math.pow(rem,2);
            
            n = n/10;
        }
        return sum; 
    } 
}