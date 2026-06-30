// Optimal Solution  with T- O(n) and S- O(n)
import java.util.*;
public class Twosum(Optimal){
public static int[] Sum(int [] nums,int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            int diff= target-nums[i];
            if(map.containsKey(diff)){
               return new int[] {map.get(diff),i}; 
            }
           else{
             map.put(nums[i],i);
           }
        }
        return new int[]{};
    }


public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int arr[] = new int [n];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    int target=sc.nextInt();
    int indexs[]=Sum(arr,target);
    System.out.print(indexs[0]+" "+indexs[1]);
}
}
