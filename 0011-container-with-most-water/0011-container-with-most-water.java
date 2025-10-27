class Solution {
    public int maxArea(int[] height) {
        int max=-1;
        int l=0,r=height.length-1;
        while(l<r){
            int wt=r-l;
            int ht=Math.min(height[l],height[r]);
            int area=wt*ht;
            max=Math.max(max,area);
            if(height[l]<height[r])l++;
            else r--;
        }
        return max;
    }
}