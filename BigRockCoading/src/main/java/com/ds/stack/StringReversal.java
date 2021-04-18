package com.ds.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StringReversal {
    
    /*
    Input  piyush garg 
    Output garg piyush
     */
    
    public static String pattern1(String str){
        String[] split =str.split(" ");

        Stack<String> stack = new Stack<String>();
        List<String> list = new ArrayList<String>();
        
        String updtedString = "";
        
        for(int i=0;i<split.length;i++){
            stack.push(split[i]);
        }
        for(int i=stack.size();i>0;i--){
            updtedString = updtedString+stack.pop() + " ";
        }
        return updtedString;
    }


    public static void main(String[] args) {
        String str = "Piyush Garg";
        System.out.println(pattern1(str));
    }
}
