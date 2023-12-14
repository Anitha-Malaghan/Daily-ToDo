package day12;

public class MaxConsecutiveOnes {
    public static void main(String[] args){
        int[] nums = {1,1,0,1,1,1};
        int curCount=0, maxCount=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                curCount+=1;
            }
            else{
                maxCount=Math.max(curCount, maxCount);
                curCount=0;
            }
        }
        maxCount=Math.max(curCount, maxCount);
        System.out.println(maxCount);


    }
    /*
    * public int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0, sum = 0;
        for (int n : nums) {
            sum *= n;
            sum += n;
            ans = Math.max(ans, sum);
        }
        return ans;
    }
    * */
}
