import java.io.*;
import java.util.*;

public class subset {

    public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=scn.nextInt();
    }
    int tar=scn.nextInt();
    boolean[][] dp = new boolean[n+1][tar+1];
    for(int i=0;i<dp.length;i++)
    {
        for(int j=0;j<dp[0].length;j++)
        {
            if(i==0 && j==0)
            {
                dp[i][j] = true;
            }else if(i==0){
                dp[i][j] = false;
            }else if(j==0){
                dp[i][j] = true;
            }else{
                dp[i][j] = dp[i-1][j];
                if(dp[i][j]==false && arr[i-1]<=j){
                int val = j-arr[i-1];
                dp[i][j] = dp[i-1][val];
                }
            }
        }
    }
        System.out.println(dp[dp.length-1][dp[0].length-1]);
    
    
    }
}