class Solution {
    public int countSeniors(String[] details) {
        int ans = 0;
        for(String i:details)
        {
            int num = Integer.parseInt(i.substring(11,13));
            if(num>60)
            {
                ans++;
            }
        }

        return ans;
    }
}