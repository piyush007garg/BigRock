package com.ds.stack;

import javafx.util.Pair;

import java.util.*;

public class MaximumAreaHistogram {

    public static void main(String[] args) {
        Integer[] integers = {6,2,5,4,5,1,6};
        int size =6;
//        System.out.println(Arrays.toString(MAH(integers, size)));
        System.out.println(MAH(integers,size));
    }
    
    // find Index of nearest smaller to left
    // find Index of nearest smaller to right
    // Resulted Array =(NSL Index - NSR Index) -1
    // Given Array Value * Resulted Array value
    // Now pick the Highest value
    
    
    public static List<Integer> NSR(Integer[] nsrArray,int size){
        Stack<Pair<Integer,Integer>> stack = new Stack<Pair<Integer, Integer>>();
        List<Integer> list = new ArrayList<Integer>(); 
        
        for(int i=nsrArray.length-1;i>=0;i--){
        if(stack.isEmpty()) {
            list.add(size+1);
            stack.push(new Pair<Integer, Integer>(nsrArray[i],i));
        } else if (stack.peek().getKey()<nsrArray[i]){
            list.add(stack.peek().getValue());
            stack.push(new Pair<Integer, Integer>(nsrArray[i],i));
        }
        else if (stack.peek().getKey()>=nsrArray[i]){
            while (stack.size()>0 && stack.peek().getKey()>=nsrArray[i]){
                stack.pop();
            } if (stack.isEmpty()){
                list.add(size+1);
            } else {
                list.add(stack.peek().getValue());
            }             
            stack.push(new Pair<Integer, Integer>(nsrArray[i],i));
        }
        }
        Collections.reverse(list);
        return list;
    }
    
    public static List<Integer> NSL(Integer[] nslArray){
        Stack<Pair<Integer,Integer>> stack = new Stack<Pair<Integer, Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i=0;i<nslArray.length;i++){
            if(stack.isEmpty()){
                list.add(-1);
                stack.push(new Pair<Integer, Integer>(nslArray[i],i));
            } else if (stack.peek().getKey()<nslArray[i]){
                list.add(stack.peek().getValue());
                stack.add(new Pair<Integer, Integer>(nslArray[i],i));
            } else if(stack.peek().getKey()>=nslArray[i]){
                while (stack.size()>0 && stack.peek().getKey()>=nslArray[i]){
                    stack.pop();
                } if (stack.isEmpty()){
                    list.add(-1);
                } else {
                    list.add(stack.peek().getValue());
                }
                stack.push(new Pair<Integer, Integer>(nslArray[i],i));
            }
        }
        return list;
    }
    
    public static int MAH(Integer[] mahArray, int size){
        int maximumArea =0;
        List<Integer> nearestSmallRightIndex = NSR(mahArray, size);
        List<Integer> nearestSmallLeftIndex = NSL(mahArray);
        int[] resultedArray = new int[nearestSmallRightIndex.size()];
        int[] finalResult = new int[nearestSmallRightIndex.size()];
        for(int i=0;i<nearestSmallRightIndex.size();i++){
             resultedArray[i] = (nearestSmallRightIndex.get(i) - nearestSmallLeftIndex.get(i))-1;
        }
        
        for(int i=0;i<resultedArray.length;i++){
            finalResult[i] = resultedArray[i]* mahArray[i];
        }
        
        for(int i=0;i<finalResult.length;i++){
            if(finalResult[i]>maximumArea){
                maximumArea = finalResult[i];
                
            }
        }
        
        
        return maximumArea;
    }
    
    
    
    
    
}
