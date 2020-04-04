package com.midium;

/**
 * 你现在手里有一份大小为 N x N 的『地图』（网格） grid，上面的每个『区域』（单元格）都用 0 和 1 标记好了。
 * 其中 0 代表海洋，1 代表陆地，你知道距离陆地区域最远的海洋区域是是哪一个吗？请返回该海洋区域到离它最近的陆地区域的距离。
 *
 * 我们这里说的距离是『曼哈顿距离』（ Manhattan Distance）：
 * (x0, y0) 和 (x1, y1) 这两个区域之间的距离是 |x0 - x1| + |y0 - y1| 。
 *
 * 如果我们的地图上只有陆地或者海洋，请返回 -1。
 *
 * 该题意思为 距离所有陆地最远的海洋区域，应该用多源BFS，该算法还不会，此处实现为简单遍历
 *
 */
public class maxDistance {
    public static void main(String[] args) {
        int[][] grid = {{1,0,0},{0,0,0},{0,0,0}};
        System.out.println(new maxDistance().maxDistance(grid));
    }

    public int maxDistance(int[][] grid) {
        int distance = -1;
        int sum = 0;//记录点数
        boolean first = true;
        //依次遍历，直到找完所有的点
        while (sum < (grid.length * grid.length)) {
            distance ++;
            //每次全点遍历，只标记符合条件的点
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    //第一遍统计1的个数
                    if (first && grid[i][j] == 1) {
                        sum++;
                    }
                    //后续轮次仅统计当前轮次的点
                    //第二轮：统计离1最近的0点，标记为2
                    //第三轮：统计离2最近的0点，标记为3
                    //......以此类推 直到找完所有的点
                    else if((!first) && grid[i][j] == distance){
                        if (i > 0 && grid[i - 1][j] == 0) {
                            grid[i - 1][j] = distance + 1;
                            sum++;
                        }
                        if (i < grid.length - 1 && grid[i + 1][j] == 0) {
                            grid[i + 1][j] = distance + 1;
                            sum++;
                        }
                        if (j > 0 && grid[i][j - 1] == 0) {
                            grid[i][j - 1] = distance + 1;
                            sum++;
                        }
                        if (j < grid.length-1 && grid[i][j + 1] == 0) {
                            grid[i][j + 1] = distance + 1;
                            sum++;
                        }
                        if (sum == (grid.length * grid.length)) {
                            break;
                        }
                    }
                }
            }
            //第一遍遍历时，只会统计1的个数，如果都是0 或 1 ，那么sum为0或所有
            if(first && (sum == 0 || sum == grid.length * grid.length)){
                return -1;
            }
            first = false;
        }
        return distance;

    }
}
