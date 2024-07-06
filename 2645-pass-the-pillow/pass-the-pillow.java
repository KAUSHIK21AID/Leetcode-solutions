class Solution {
    public int passThePillow(int n, int time) {
        int count =1, front=1;
        while(time>0)
        {
            if(front==1)
            {
                count++;
            }
            else
            {
                count--;
            }

            if(count==n)
            {
                front = 0;
            }
            if(count==1)
            {
                front=1;
            }
            time--;
        }

        return count;
    }
}