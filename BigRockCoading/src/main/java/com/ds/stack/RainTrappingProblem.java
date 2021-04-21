package com.ds.stack;


public class RainTrappingProblem {

    public static void main(String[] args) {
        Integer[] integers = {3,0,0,2,0,4};
        System.out.println(rTP(integers));
    }
    
    
    public static int rTP(Integer[] integers){
        int[] maximumLeft = new int[integers.length];
        int[] maximumRight = new int[integers.length];
        int[] water = new int[integers.length];
        int finalNumber=0;
        
        for(int i=1;i<integers.length;i++){
            maximumLeft[0]= integers[0];
            maximumLeft[i] = Math.max(maximumLeft[i-1],integers[i]);
        }
        
        for(int i=integers.length-2;i>=0;i--){
            maximumRight[integers.length-1] = integers[integers.length-1];
            maximumRight[i] = Math.max(maximumRight[i+1],integers[i]);
        }
        
        for(int i=0 ;i< integers.length;i++){
            water[i] = Math.min(maximumLeft[i],maximumRight[i])- integers[i];
        }
        
        for(int i=0;i<water.length;i++){
            finalNumber = finalNumber + water[i];
        }
        return finalNumber;
        
    }
}
