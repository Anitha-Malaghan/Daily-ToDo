package day12;

public class LongestSubarrayWithAlternatingEvenOdd {
    public static void main(String[] args) {
        int[] A = {1, 3, 5};
        int n = A.length;
        int i = 0;
        int curLen = 0;
        int maxLen = 0;
        while (i<n) {
            while ((i<n )&& (A[i] % 2 == 0) ){
                if (i + 1 < n && A[i + 1] % 2 == 1) {
                    curLen += 2;
                    i += 2;
                    maxLen = Math.max(maxLen, curLen);
                }
                else{
                    if(curLen>0){
                        maxLen=Math.max(maxLen, curLen+1);
                    }
                    curLen=0;
                    i+=1;
                }
            }
            while ((i<n )&& (A[i] % 2 == 1) ){
                if (i + 1 < n && A[i + 1] % 2 == 0) {
                    curLen += 2;
                    i += 2;
                    maxLen = Math.max(maxLen, curLen);
                }
                else{
                    if(curLen>0){
                        maxLen=Math.max(maxLen, curLen+1);
                    }
                    curLen=0;
                    i+=1;
                }
            }
        }
        System.out.println(maxLen);

    }
}
