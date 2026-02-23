package leetcode;
/*
    836 - Rectangle Overlap
    Topic: Geometry
    Time: O(1)
    Notes: Check if x,y coordinates of bottom left corner of rectangle 1 are strictly less than upper right corner of rectangle 2. And also check if coordinates of upper right corner of rectangle 1 are strictly greater than bottom left corner of rectangle 2.
*/
public class _0836_Rectangle_Overlap {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        return (rec1[0] < rec2[2] &&
                rec1[1] < rec2[3] &&
                rec1[2] > rec2[0] &&
                rec1[3] > rec2[1]);
    }
}
