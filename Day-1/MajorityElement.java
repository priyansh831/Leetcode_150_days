// Brute force :  TC:O(nlogn) SC:O(1);
import java.util.*;
public class MajorityElement {
     public static int majorityElement(int[] nums) {
        //Quick sort is used by leetcode to sort an array

        Arrays.sort(nums);
        return nums[nums.length/2];
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in); 
    int n= sc.nextInt();
    int [] arr= new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();

    }
   int ans=majorityElement(arr);
   System.out.println(ans);
    }
}
