package leetcode;
/*
    832 - Flipping an Image
    Topic: Array / Two Pointers
    Time: O(n^2)
    Notes: Reverse each row and invert bits using XOR to produce flipped binary image.
*/
public class _0832_Flipping_an_Image {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for(int i=0;i<n;i++){
            int left = 0, right = n-1;
            while(left < right){
                int temp = image[i][left];
                image[i][left] = image[i][right];
                image[i][right] = temp;
                left++; right--;
            }
            for(int j=0;j<n;j++){
                image[i][j] = image[i][j] ^ 1;
            }
        }
        return image;
    }
}
