class Solution {
    public int maxArea(int[] height) {
        int l=0,j=height.length-1;
        int max=0;
        while(l<j){
            int area=(j-l)*Math.min(height[l],height[j]);
            max=Math.max(max,area);
            if(height[l]<height[j]){
                l++;
            }
            else{
                j--;
            }
        }
        return max;
    }
}