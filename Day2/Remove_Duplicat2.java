package Day2;
//Q-80


import java.util.*;
    public class Remove_Duplicat2{
    public static int removeDuplicates(int[] nums) {
     int k=2;
     for(int i=2;i<nums.length;i++){
       if(nums[i]!=nums[k-2]){
        nums[k]=nums[i];
        k++;
       }
     }
     return k;
    }
public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int arr[] = new int [n];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    int ans=removeDuplicates(arr);
    System.out.println(ans);
}
}

