package day11;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SubArrayWithKPerfectSquare {
    public static boolean isPerfect(int num) {
        int i = 1;
        while (num > 0) {
            num -= i;
            i += 2;
        }
        return num==0;
    }

    public static int findSubarray(int[] perfect, int n, int k){
        Map<Integer, Integer> prevSum = new HashMap<>();
        int subArrayCount=0;
        int curSum=0;
        for(int i=0; i<n; i++){
            curSum+=perfect[i];
            if(curSum==k){
                subArrayCount+=1;
            }
            if(prevSum.containsKey(curSum-k)){
                subArrayCount+=prevSum.get(curSum-k);
            }
            prevSum.put(curSum, prevSum.getOrDefault(curSum,0)+1);

        }
        return subArrayCount;
    }
    public static void main(String[] args) {
        int [] arr ={4, 2, 5};
        int n=arr.length;
        int k=3;
        int[] perfect = new int[arr.length];
        for(int i=0; i<n; i++) {
            if (isPerfect(arr[i])) {
                perfect[i] = 1;
            } else {
                perfect[i] = 0;
            }
        }

        System.out.println(SubArrayWithKPerfectSquare.findSubarray(perfect,n, k));
    }
}
