class Solution {
    public int heightChecker(int[] heights) {
        int n=heights.length;
        int []res=Arrays.copyOf(heights,n);
        int count=0;
        Arrays.sort(res);
        for(int i=0;i<n;i++){
            if(heights[i]!=res[i]){
                count++;
            }
        }
        return count;
    }
}
