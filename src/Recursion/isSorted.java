package Recursion;

import java.util.Scanner;

public class isSorted {

    public  static boolean isSorted(int arr[],int s){
        if(s==arr.length-1){
            return true;
        }
        if(arr[s]>arr[s+1]){
            return false;
        }

        return isSorted(arr,s+1);
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println(isSorted(arr,0));
    }
}
