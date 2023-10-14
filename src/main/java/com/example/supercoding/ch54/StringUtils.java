package com.example.supercoding.ch54;

import org.w3c.dom.ls.LSOutput;

public class StringUtils {

    public static boolean isEmpty(String  str){
        if(str==null || str.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }



    public static String reverse(String str){
        StringBuilder sb = new StringBuilder();

        for(int i =str.length()-1; i>=0; i--){
            sb.append(str.charAt(i));

        }
        return sb.toString();
    }

    public static class CharChecker{
        public static int countChar(String str, char targetChar){
            int cnt = 0;
            for(int i=0; i<str.length(); i++){
                if(str.charAt(i) == targetChar){
                    cnt++;
                }
            }
            return cnt;
    }

    }
    public static boolean containsChar(String str, char targetChar){
        return CharChecker.countChar(str, targetChar) >=1;
    }



}
