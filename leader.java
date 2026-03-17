class Solution {
    public int[] replaceElements(int[] arr) {
       int n=arr.length;
       int []res=new int[n];
       for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            res[i]=Math.max(res[i],arr[j]);
        }
        if(i==n-1){
            res[i]=-1;
        }
       } 
       return res;
    }
}