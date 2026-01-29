class Solution {
    public int maxArea(int[] height) {
        int a = 0;
        int b = height.length-1;
        int maxArea = 0;

        while(a < b){
            int width = b - a;
            int h = Math.min(height[a], height[b]);
            int area = h * width;

            maxArea = Math.max(maxArea , area);

            if(height[a] < height[b]){
                a++;
            }
            else{
                b--;
            }
        }
        return maxArea;
    }
}