package com.huwei;

public class airLineBooking {
    public static void main(String[] args) {
        //airline order
        int[][] bookings = {{3,3,5},{1,3,20},{1,2,15}};
        int airlines = 3;
        airLineBooking customs = new airLineBooking();
        int[] result = customs.corpFlightBookings(bookings,airlines);
        for (int i=0;i<result.length;i++)
        {
            System.out.print(result[i]);
        }

    }
    public int[] corpFlightBookings(int[][] bookings, int n)
    {
        int[] count = new int[n];
        //遍历订单
        for(int i = 0; i<bookings.length;i++)
        {
            //每一站人数变化量是相对于前一站来说的
            count[bookings[i][0]-1]+=bookings[i][2];
            if(bookings[i][1]<n)
            {
                count[bookings[i][1]]+=-bookings[i][2];
            }
        }
        //计算每一站总人数，前一站+本站变化人数（相对于前一站来说的变化人数总和）
        for(int i=1;i<n;i++)
        {
            count[i] += count[i-1];
        }
        return count;
    }
}

