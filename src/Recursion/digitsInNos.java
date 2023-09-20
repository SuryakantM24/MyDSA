package Recursion;

import java.util.Scanner;

public class digitsInNos {


    public static int digits(int n){
        if(n==0){
            return 0;
        }
        if(n<10){
            return 1;
        }

        return 1+digits(n/10);
    }
    public static void main(String[] args){

        Scanner s=new Scanner(System.in);
        int a=s.nextInt();

        System.out.println(digits(a));



    }
}
