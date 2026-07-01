package Day2;
//Q-448
// brute force with TC O(n^2)
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Disapeared_num {
    public static  List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list= new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
     list.add(nums[i]);
        }
        for(int i=1;i<=nums.length;i++){
            if(list.contains(i)){

            }
            else{
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