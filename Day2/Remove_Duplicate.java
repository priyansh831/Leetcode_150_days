package Day2;
//Q-26


import java.util.*;
public class Remove_Duplicate {
    public static int removeDuplicates(int[] nums) {
            int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=nums[c]){
                c++;
                nums[c]=nums[i];
            }
        }

        return c+1;
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

