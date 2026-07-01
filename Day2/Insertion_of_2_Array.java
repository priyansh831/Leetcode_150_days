package Day2;

import java.util.HashSet;
import java.util.Scanner;

public class Insertion_of_2_Array {
        public int[] intersection(int[] nums1, int[] nums2) {
        
    // nums1 = [1,2,2,1]
     //  nums2 = [2,2]
     HashSet<Integer> set= new HashSet<>();
     for(int i=0;i<nums2.length;i++){
        for(int j=0;j<nums1.length;j++){
            if(nums2[i]==nums1[j]){
             set.add(nums2[i]);
            }
        }
     }
     int [] res= new int [set.size()];
     int i=0;
     for(int num:set){
        res[i++]=num;
     }
     return res;

    } 

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [] nums1 = new int [n];
        int [] nums2 = new int [m];
        for(int i=0;i<n;i++){
            nums1[i]=sc.nextInt();

        }
        for(int i=0;i<m;i++){
            nums2[i]=sc.nextInt();
            
        }
        int arr[]=intersection(nums1,nums2);
        for(int num:arr){
            System.out.println(num);
        }
    }
}
