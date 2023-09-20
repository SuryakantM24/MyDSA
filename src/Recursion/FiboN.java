package Recursion;

import java.util.Scanner;

public class FiboN {


    public static int fibo(int n){

        if(n==1){
            return 1;
        }
        if(n==2){
            return 1;
        }

        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args){

        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        System.out.println(fibo(a));

    }
}
