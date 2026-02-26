package leetcode;
/*
    1266 - Minimum Time Visiting All Points
    Topic: Math / Geometry
    Time: O(n)
    Notes: Find the maximum absolute distance between x and y coordinates and add to final result.
*/
public class _1266_Minimum_Time_Visiting_All_Points {
    public int minTimeToVisitAllPoints(int[][] points) {
        int result = 0;
        for(int i=1; i<points.length; i++){
            result += Math.max(Math.abs(points[i][0] - points[i-1][0]), Math.abs(points[i][1] - points[i-1][1]));
        }
        return result;
    }
}
