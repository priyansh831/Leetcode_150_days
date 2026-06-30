// Optimal TC:O(n), SC:O(1);
import java.util.*;
class BestTimeToBuySell{
    public static int MaxProfit(int [] prices){
     int max=0;
        int i=0;
        int buy=prices[i];
            for(int j=i+1;j<prices.length;j++){
        int sell=prices[j];
        if(sell>buy){
              int profit= sell - buy;
              max=Math.max(profit,max);
        }
        else if(sell<buy){
            buy=prices[j];
        }
            }
        
        return max;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int prices[] = new int [n];
        for(int i=0;i<prices.length;i++){
            prices[i]=sc.nextInt();
        }
        int ans=MaxProfit(prices);
       System.out.println(ans);
    }
}