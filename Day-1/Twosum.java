// Brute Force with T- O(n^2) and S- O(1)
import java.util.*;
public class Twosum{
public static int[] Sum(int [] arr,int target){

    int result[]=new int[2];
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]+arr[j]==target){
              result[0]=i;
              result[1]=j;
            }
        }

    }

    return result;
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
