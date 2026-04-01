class Solution {
    public int largestRectangleArea(int[] heights) {

        int maxM = 0;
        int n = heights.length;
        int min = Integer.MAX_VALUE;
        for(int i =0;i<n;i++){
            min = Integer.MAX_VALUE; 
            for(int j = i;j<n;j++){

                min = Math.min(min,heights[j]);
                int currM = min*(j-i+1);
                //maxM = Math.max(maxM,currM);
                if(currM > maxM){
                    maxM = currM;
                }
            }
        }
        return maxM;
        
    }
}
