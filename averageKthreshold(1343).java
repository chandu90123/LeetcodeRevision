import java.util.*;
class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count=0;
        int currentsum=0;
        for(int i=0;i<k;i++){
            currentsum+=arr[i];
        }
            if(currentsum>=k*threshold){
                count++;
            }
        
       
        for(int i=k;i<arr.length;i++){
            currentsum=currentsum+arr[i]-arr[i-k];
            if(currentsum>=k*threshold){
                count++;
            }
            
        }
        
        return count;
    }
}