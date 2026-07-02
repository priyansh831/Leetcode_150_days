package Day2;

import java.util.Scanner;

public class PivoteIndex_Optimized {
        public static  int pivotIndex(int[] nums) {
    int SumT=0;
    int SumL=0;

    for(int num:nums){
        SumT+=num;
    }
   for(int i=0;i<nums.length;i++){
    int SumR= SumT-SumL-nums[i];
    if(SumR==SumL){
        return i;
    }
    SumL+=nums[i];
   }
   return -1;

    }
        public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr= new int [n];
        for(int i = 0; i<n;i++){
            arr[i]=sc.nextInt();

        }
        int ans= pivotIndex(arr);
     System.out.println(ans);
    }
}
