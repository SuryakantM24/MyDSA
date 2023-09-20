package Recursion;

import java.util.*;

public class Power
{

    public static int  power(int a,int b){

        if(b==0){
            return 1;
        }

        int x=power(a,b/2);
        if(b%2==0){
            return x*x;
        }
        else{
            return x*x*a;
        }
    }

    public static void main(String[] args){

        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println(power(a,b));



    }
}
