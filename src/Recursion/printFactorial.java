package Recursion;

import java.util.Scanner;

public class printFactorial {


    public  static void printFact(int n, int ans){

        if(n==0){
            System.out.println(ans);
            return;
        }
        ans=ans*n;
        printFact(n-1,ans);

    }
    public static void main(String[] args){

        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        printFact(a,1);



    }
}
