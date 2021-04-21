package com.ds.stack;


import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StockSpanProblem {
    
    // Find the index of nearest Greater to left
    // Index of Input Array - Index of Value of NGL
    

    public static void main(String[] args) {
        Integer[] integers = {100,80,60,70,60,75,85};
        System.out.println(SPP(integers));
    }
    
    public static List<Integer> SPP(Integer[] arr){
        Stack<Pair<Integer,Integer>> stack =new Stack<Pair<Integer, Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> updatedList = new ArrayList<Integer>();
        
        for(int i=0;i<arr.length;i++){
            if(stack.isEmpty()){
                list.add(-1);
                stack.push(new Pair<Integer, Integer>(arr[i],i));
            }
            else if (stack.peek().getKey()>arr[i]){
                list.add(stack.peek().getValue());
                stack.push(new Pair<Integer, Integer>(arr[i],i));
            } else if (stack.peek().getKey()<= arr[i]){
                while(stack.size()>0 && stack.peek().getKey()<=arr[i])
                {
                    stack.pop();
                } if (stack.size()==0){
                    list.add(-1);
                } else {
                    list.add(stack.peek().getValue());
                }
                stack.push(new Pair<Integer, Integer>(arr[i],i));            }
        }
        
        for(int i=0;i<list.size();i++){
            int variable = i - (Integer) list.get(i);
            updatedList.add(variable);
        }
        System.out.println(list);
        return updatedList;
    }
    
}
