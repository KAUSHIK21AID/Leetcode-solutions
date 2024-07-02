class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int odd = 0, mine = 0;
        boolean ans = false;

        while(mine<arr.length-1)
        {
            if(arr[mine]%2==0)
            {
                odd = mine+1;
            }
            mine++;
            if(mine-odd==2 && arr[mine]%2==1)
            {
                ans = true;
                break;
            }
        }
        

        return ans;
    }
}