package Recursion;

import java.util.Scanner;

public class firstnNaturalNos {



    public static void  printN(int n){
        if(n==0){
            return;
        }
        printN(n-1);
        System.out.println(n);
    }

    public static void main(String[] args){

        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        printN(a);

    }
}
