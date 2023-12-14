package day11;

import java.util.Arrays;
/*
* Given an array arr[] of length N, the task is the find the length of the longest sub-array with the maximum possible GCD value.(Easy)
Examples:

Input: arr[] = {1, 2, 2}
Output: 2
Here all possible sub-arrays and there GCD’s are:
1) {1} -> 1
2) {2} -> 2
3) {2} -> 2
4) {1, 2} -> 1
5) {2, 2} -> 2
6) {1, 2, 3} -> 1
Here, the maximum GCD value is 2 and longest sub-array having GCD = 2 is {2, 2}.
Thus, the answer is {2, 2}.

Input: arr[] = {3, 3, 3, 3}
Output: 4 */
public class MaxSubbarrayWithMaxGcd {
    public static void main(String[] args) {
        int[] arr= {2,2,9,9,0,0,0,9,9,9,9,9};
        int max_elm= Arrays.stream(arr).max().orElse(Integer.MIN_VALUE);
        int max_len=1;
        int cur_len=0;
        for(int i=0; i<arr.length; i++){
            if(max_elm==arr[i]){
                cur_len+=1;
                max_len=Math.max(cur_len, max_len);
            }
            else{
                cur_len=0;
            }
        }
        System.out.println(max_len);
    }
}
