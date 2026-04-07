class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //int i =0;
        int n = numbers.length;
        //int newarr[] = new int[2];
       
        for(int i =0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(numbers[i]+numbers[j]==target){
                    return new int[] { i + 1, j + 1 };
                }
            }
        }
        return new int[0];
        
    }
}
