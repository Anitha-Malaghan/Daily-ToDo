package day12;

import java.util.Arrays;

public class closestMinMax {
    public static void main(String[] args){
        int[] A = {2, 6, 1, 6, 0};
        int n=A.length;
        int maxElm= Arrays.stream(A).max().orElseThrow();
        int minElm=Arrays.stream(A).min().orElseThrow();
        int minIndex=-1, maxIndex=n, finalLen=n;
        for(int i=n-1; i>-1; i--){
            if(A[i]==minElm) {
                minIndex = i;
                if (maxIndex != n) {
                    finalLen = Math.min(finalLen, (maxIndex - minIndex)+1);

                }
            }
            if(A[i]==maxElm){
                maxIndex=i;
                if(minIndex!=-1){
                    finalLen= Math.min(finalLen, (minIndex-maxIndex)+1);
                }
            }
        }
        System.out.println(finalLen);


    }
}