package Recursion;

import java.lang.reflect.Array;
import java.util.*;



public class returnSubsequences {


    public static ArrayList<String> returnSub(String str){


         if(str.length()==0){
             ArrayList<String> base= new ArrayList<String>();
             base.add("");
             return base;
         }
        char c=str.charAt(0); // first char;
        String ros=str.substring(1); // rest of string

        ArrayList<String> smallAns=returnSub(ros); // faith that small answer wil be returned.

        ArrayList<String> res=new ArrayList<>();

        for(String s: smallAns){
            res.add(""+s);// ignore first char
            res.add(c+s); // take first char
        }

        return res;
     }


    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String str=s.next();

        ArrayList<String> res= returnSub(str);
        for(String ss: res){
            System.out.print(ss+" ");
        }

    }
}
