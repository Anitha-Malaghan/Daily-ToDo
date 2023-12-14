package day11;

/*
1. Given an array arr[] consisting of integers, the task is to split the given
array into two sub-arrays such that the difference between their maximum elements
is minimum. (Easy)
Example:
Input: arr[] = {7, 9, 5, 10}
Output: 1
Explanation:
The subarrays are {5, 10} and {7, 9} with the difference between their maximums = 10 – 9 = 1.
Input: arr[] = {6, 6, 6}
Output: 0
*/
public class MinimumDifference {
    public static void main(String[] args) {

       int[] arr = {6, 6, 6};
        int highest = Math.max(arr[0],arr[1]);
       int second_highest =Math.min(arr[0],arr[1]);
       for(int i=2; i<arr.length; i++){
           if(arr[i]>highest){
               if(highest>second_highest){
                   second_highest=highest;
                   highest=arr[i];
               }
           }else if(arr[i]>second_highest){
               second_highest=arr[i];
           }
       }
        System.out.println(highest-second_highest);
    }
}