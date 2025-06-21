// User function Template for Java

class Solution {
    public int maximumSumSubarray(int[] arr, int k) {
        // Code here
        //fixed size
        
        // start =0, end =0;
        // end++ till end-start+1 != k
        int maxSum=Integer.MIN_VALUE;
        int start=0,end=0;
        int sum=0;
        while(end < arr.length){
            sum+=arr[end];
            if(end-start+1 < k){
                end++;
            }else if(end-start+1 ==k){
                
                maxSum=Math.max(sum,maxSum);
               
                
                sum=sum-arr[start];
                start++; 
                end++;
                
                
            }
            
        }
       return maxSum;
    }
}