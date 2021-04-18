package com.ds.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NearestSmallestLeft {

    public static void main(String[] args) {
        Integer[] integers = {4,5,2,0,8};
        System.out.println(NSL(integers));
    }
    
    
    public static List<Integer> NSL(Integer[] arr){
        Stack<Integer> stack = new Stack<Integer>();
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i=0;i<arr.length;i++){
            if(stack.isEmpty()){
                list.add(-1);
                stack.push(arr[i]);
            } else if (stack.peek()<arr[i]){
                list.add(stack.peek());
                stack.push(arr[i]);
            } else if (stack.peek()>= arr[i]){
                while (stack.size()>0 && stack.peek()>= arr[i]){
                    stack.pop();
                } if (stack.isEmpty()){
                    list.add(-1);
                } else {
                    list.add(stack.peek());
                }
                stack.push(arr[i]);
            }
        }
        return list;
    }
}
