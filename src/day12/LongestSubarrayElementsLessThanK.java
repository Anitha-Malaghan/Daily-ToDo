package day12;

public class LongestSubarrayElementsLessThanK {
    public static void main(String[] args){
        int[] arr = {1, 8, 3, 5, 2, 2, 1, 13};
        int k=6;
        int maxLen=0,curLen=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<k){
                curLen+=1;

            }
            else{
               maxLen=Math.max(maxLen,curLen);
               curLen=0;
            }
            maxLen=Math.max(maxLen,curLen);
        }
        System.out.println(maxLen);
    }
}
