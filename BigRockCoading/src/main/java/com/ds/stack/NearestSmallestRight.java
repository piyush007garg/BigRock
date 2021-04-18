package com.ds.stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class NearestSmallestRight {

    public static void main(String[] args) {
        Integer[] integers = {4,5,2,10,8};
        System.out.println(NSR(integers));
    }
    
    
    public static List<Integer> NSR(Integer[] arr){
        Stack<Integer> stack = new Stack<Integer>();
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i =arr.length-1;i>=0;i--){
            if(stack.isEmpty()){
                list.add(-1);
                stack.push(arr[i]);
            } else if (stack.peek()<arr[i]){
                list.add(stack.peek());
                stack.push(arr[i]);
            } else if (stack.peek()>= arr[i]){
                while (stack.size()>0 && stack.peek()>=arr[i]){
                    stack.pop();
                } if (stack.isEmpty()){
                    list.add(-1);
                } else {
                    list.add(stack.peek());
                }
                Collections.reverse(list);
                stack.push(arr[i]);
            }
            
        }

        return list;
    }
    
    
}
