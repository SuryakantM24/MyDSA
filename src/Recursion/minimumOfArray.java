package Recursion;

import java.util.Scanner;

public class minimumOfArray {



    public static void minimum(int arr[],int ans,int s){

        if(s==arr.length){
            System.out.println(ans);
            return;
        }
        if(arr[s]<ans){
            ans=arr[s];
        }
        minimum(arr,ans,s+1);

    }
    public static void main(String[] args){

        Scanner s=new Scanner(System.in);
       int arr[]={1,2,3,4,5,5,6,6,4,2,3,3,4,5,34,43,-3,-100};

        minimum(arr,Integer.MAX_VALUE,0);



    }
}
