class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length;
        int[] res = heights.clone();
        for(int i = 0; i < n - 1; i++){
            int minIndex = i;

            for(int j = i + 1; j < n; j++){
                if(res[j] < res[minIndex]){
                    minIndex = j;
                }
            }
            int temp = res[i];
            res[i] = res[minIndex];
            res[minIndex] = temp;
        }
        int count = 0;
        for(int i = 0; i < n; i++){
            if(heights[i] != res[i]){
                count++;
            }
        }
        return count;
    }
}
