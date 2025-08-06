class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int maxElement = 0;
        int[] left = new int[n];
        int[] right = new int[n];

        for (int i = 0; i < n; i++) {
            int l = i;
            while (l > 0 && heights[l - 1] >= heights[i]) {
                l = left[l - 1];
            }
            left[i] = l;
        }

        for (int i = n - 1; i >= 0; i--) {
            int r = i;
            while (r < n - 1 && heights[r + 1] >= heights[i]) {
                r = right[r + 1];
            }
            right[i] = r;
        }

        for (int i = 0; i < n; i++) {
            int l = left[i];
            int r = right[i];
            int w = (r - l) + 1;
            int area = w * heights[i];
            maxElement = Math.max(maxElement, area);
        }

        return maxElement;
    }
}
