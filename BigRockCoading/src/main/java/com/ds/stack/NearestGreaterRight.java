package com.ds.stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class NearestGreaterRight {

    public static void main(String[] args) {
        Integer[] integer = {1,3,0,0,1,2,4};
        System.out.println(NGR(integer));
    }

    public static List<Integer> NGR(Integer[] arr) {

        Stack<Integer> stack = new Stack();
        List<Integer> list = new ArrayList<Integer>();


        for (int i = arr.length-1; i >= 0; i--) {

            if (stack.isEmpty()) {
                list.add(-1);
                stack.push(arr[i]);
            } else if (!stack.isEmpty() && stack.peek() > arr[i]) {
                list.add(stack.peek());
                stack.push(arr[i]);
            }   else if(stack.peek()<=arr[i]){
                while(!stack.isEmpty() && stack.peek()<=  arr[i]){
                    stack.pop();
                } if(stack.isEmpty()){
                    list.add(-1);
                }else {
                    list.add(stack.peek());   
                }
                stack.push(arr[i]);
            }

        }
        Collections.reverse(list);
        return list;
    }
}
