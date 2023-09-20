package Recursion;

import java.util.Scanner;

public class recursiveBubble {



    public static  void bubble(int[] arr,int s,int li){

        if(li==0){
            return;
        }
        if(s==li){
            bubble(arr,0,li-1);
            return;
        }

        if(arr[s]>arr[s+1]){
            int temp=arr[s];
            arr[s]=arr[s+1];
            arr[s+1]=temp;

        }
        bubble(arr,s+1,li);

    }
    public static void main(String[] args){

        Scanner s=new Scanner(System.in);
        int arr[] ={1,6,3,5,9,2,7};
        bubble(arr,0,arr.length-1);
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}
