class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int ws=0;
        for(int i=0;i<k;i++)
        {
            ws +=nums[i];
        }
        double sum=ws;
        for(int i=k;i<nums.length;i++){
            ws=ws+nums[i]-nums[i-k];
            sum=Math.max(ws,sum);
        }
        return sum/k;

    }
}