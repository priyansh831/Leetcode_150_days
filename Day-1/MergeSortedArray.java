import java.util.Scanner;

public class MergeSortedArray {

    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int j=0;
        int i=0;
        while(i<m){
             if(nums1[i]<=nums2[j]){
                i++;
             }
             else{
                int temp =nums1[i];
                nums1[i]=nums2[j];
                nums2[j]=temp;
                i++;
             }
        }
        while(i<nums1.length){
            nums1[i]=nums2[j];
            i++;
            j++;
        }

       
    return nums1;
    }
     public static void main(String[] args){
        Scanner sc= new Scanner(System.in); 
        int m=sc.nextInt();
        int n=sc.nextInt();
        int [] nums1=new int [m+n];
        int nums2[]= new int [n];
        for(int i=0;i<m;i++){
            nums1[i]=sc.nextInt();

        }
        for(int j=0;j<n;j++){
            nums2[j]=sc.nextInt();
        }
        int nums[]=MergeSortedArray(nums1,nums2,m,n);
        for(int num){
            System.out.println(num);
        }
}
}
