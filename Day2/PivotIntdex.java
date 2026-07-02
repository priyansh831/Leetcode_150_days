package Day2;
import java.util.*;
class PivoteIndex{
        public static int pivotIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int sumL=0;
            int sumR=0;
            for(int j=0;j<i;j++){
                sumL+=nums[j];

            }
            for(int j=i+1;j<nums.length;j++){
             sumR+=nums[j];
            }
            if(sumL==sumR){
                return i;
            }
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