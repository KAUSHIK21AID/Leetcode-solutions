class Solution {
    public double averageWaitingTime(int[][] customers) {
        int current = 0;
        double sum = 0;
        for(int i=0;i<customers.length;i++)
        {
            int arrival = customers[i][0];
            int time = customers[i][1];
            if(current<arrival)
            {
                current = arrival;
            }
            int wait = current+(time-arrival);
            current = current+time;
            sum = sum + wait;

        }

        return sum/(double)customers.length;
    }
}