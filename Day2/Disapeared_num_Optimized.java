package Day2;
//Q-448
// 
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

class Disapeared_num_Optimized {
    public static  List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
        List<Integer> ans= new ArrayList<>();
        for(int num:nums){
            set.add(num);

        }
        for(int i=1;i<=nums.length;i++){
            if(!set.contains(i)){
             ans.add(i);
            }
        }
        return ans;
    }
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int arr[] = new int [n];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    List<Integer> ans=findDisappearedNumbers(arr);
    System.out.println(ans);
}
}