package Week_1.Day_3;

public class Containerwithmostwater {

    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int maxwater = 0;
        while (i < j) {
            int w = j - i;
            int h = Math.min(height[i], height[j]);
            int area = w * h;
            maxwater = Math.max(maxwater, area);
            if (height[i] > height[j]) {
                j--; 
            }else {
                i++;
            }
        }
        return maxwater;
    }
}
