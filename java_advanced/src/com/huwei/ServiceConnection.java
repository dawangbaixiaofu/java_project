package com.huwei;

public class ServiceConnection {
    public static void main(String[] args) {
        // 统计参与通信的服务器
        int[][] nets = {{1,1,1,1},{1,1,0,0},{1,0,1,0},{0,0,0,1}};
        solution net = new solution(nets);
        int ans = net.countServers();
        System.out.println("可联网的服务器个数是："+ans+"台！");

    }
}

class solution{
    public int[][] grid;
    public solution(int[][] grid)
    {
        this.grid = grid;
    }
    public int countServers()
    {
        //统计二维数组的行和列个数
        int[] row = new int[grid.length];
        int[] col = new int[grid[0].length];
        for (int i = 0;i<grid.length;i++)
            for (int j = 0;j<grid[0].length;j++)
            {
                if (grid[i][j]==0)
                    continue;
                row[i]++;
                col[j]++;
            }

        int ans = 0;
        for (int i = 0;i<grid.length;i++)
            for (int j = 0;j<grid[0].length;j++)
            {
                if(grid[i][j]==0) continue;
                if (row[i]==1&&col[j]==1) continue;
                ans++;
            }
        return(ans);

    }
}