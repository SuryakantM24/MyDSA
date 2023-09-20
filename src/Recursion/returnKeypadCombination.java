package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class returnKeypadCombination {

    public static String[] map={"?","!!","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static List<String> findPossibleWords(String s) {
        // Write your code here.



        if(s.length()==0){
            List<String> base=new ArrayList<String>();
            base.add("");
            return base;

        }
        //faith
        List<String> small=findPossibleWords(s.substring(1));
        String str=map[(int)s.charAt(0)-(int)'0'];
        List<String> res=new ArrayList<String>();

        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            for(String ss:small){
                res.add(c+ss);
            }
        }

        return res;




    }

    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String str=s.next();
        List<String> res=findPossibleWords(str);

        for(String ss:res){
            System.out.print(ss+" ");
        }


    }
}
