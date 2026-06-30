import java.util.*;
public class MoveZeros {
    public static int[] moveZeroes(int[] nums) {
 
     int i=0;
     for(int j=0;j<nums.length;j++){
        if(nums[j]!=0){
            nums[i]=nums[j];
            i++;
        }
     }
     while(i<nums.length){
        nums[i]=0;
        i++;
     } 
     return nums;

    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in); 
    int n= sc.nextInt();
    int [] arr= new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();

    }
   int ans[]=moveZeroes(arr);
   for(int num:ans){
    System.out.println(num+",");
   }
    }


}
