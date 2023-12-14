package day12;

public class Equilibrium {
    public static void main(String[] args){
        int[] A ={-7, 1, 5, 2, -4, 3, 0};
        int n= A.length;
        int rightSum=0,leftSum=0;
        for(int i=0; i<n; i++){
            rightSum+=A[i];

        }
        for(int i=0; i<n; i++){
            if(i==0){
                leftSum=0;
            }
            else{
                leftSum+=A[i-1];
            }
            if(i==n-1){
                rightSum=0;
            }
            else{
                rightSum-=A[i];
            }
            if(leftSum==rightSum){
               System.out.println(i);
               return;
            }


        }
        System.out.println("-1");
        return;
    }
}
