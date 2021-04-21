package com.ds.stack;

import java.util.Iterator;
import java.util.Stack;

public class RemoveAdjecent {

    public static void main(String[] args) {
        String data = "abbaca";
        System.out.println(remove(data));
    }
    
    
    
    public static String remove(String s){
        Stack<Character> stringStack = new Stack<Character>();
        char[] charArray = s.toCharArray();
        String result="";
        
        for(int i=0;i<charArray.length;i++){
            if(stringStack.size()==0){
                stringStack.push(charArray[i]);
            } else if (stringStack.peek()==charArray[i]){
                while (stringStack.size()>0 && stringStack.peek()==charArray[i]){
                    stringStack.pop();
                }
            } else if(stringStack.peek()!=charArray[i]){
                stringStack.push(charArray[i]);
            }
        }

        Iterator<Character> itr = stringStack.iterator();
        while (itr.hasNext()){
            result = result+ itr.next().toString(); 
        }
        return result;
    }
}
