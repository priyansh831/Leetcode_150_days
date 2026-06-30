// Optimal Solution  :  TC:O(n) SC:O(1);
// Boyer -Moore Voting algo is used int this!!
import java.util.*;
public class MajorityElement(Optimal) {
     public static int majorityElement(int[] nums) {
        
       int a=0;
       int count =0;
       for(int num:nums){
        if(count==0){
            a=num;

        }
        if(a==num){
            count++;
        }
        else{
            count--;
        }

       }
       return a;
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
