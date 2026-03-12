class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int s=0;
        int ws=0;
        int n=cardPoints.length-k;
        for(int i=0;i<cardPoints.length;i++){
            s += cardPoints[i];
        }
        for(int i=0;i<n;i++){
            ws += cardPoints[i];
        }
        int min=ws;
        for(int i=n;i<cardPoints.length;i++){
            ws=ws+cardPoints[i]-cardPoints[i-n];
            min=Math.min(ws,min);
        }
        return s-min;
    }
}