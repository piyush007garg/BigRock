package com.ds.stack;

import java.util.Iterator;
import java.util.Stack;

public class GoodString {


    public static void main(String[] args) {
        String str = "orRoOrROwnTNW";
        System.out.println(goodStringValue(str));
    }
    
    public static String goodStringValue(String string){
        Stack<Character> stack = new Stack<Character>();
        String result= "";
        
        char[] charArray=string.toCharArray();
        for(int i=0;i<charArray.length;i++){
            if(stack.empty()){
                stack.push(charArray[i]);
            } else if (Math.abs(stack.peek()-charArray[i])==32){
                    stack.pop();
            } else if (stack.peek()-charArray[i]!=32){
                stack.push(charArray[i]);
            }
        }
        Iterator<Character> itr = stack.iterator();
        while(itr.hasNext()){
            result = result + itr.next().toString();
        }
        return result;
        
    }
}
