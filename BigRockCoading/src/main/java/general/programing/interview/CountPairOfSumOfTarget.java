package general.programing.interview;

import java.util.Arrays;

public class CountPairOfSumOfTarget {
    public static void main(String[] args) {
        int target = 10;
        int[] arr = {3,3,5,7,3,9};
        Arrays.sort(arr);
        int r = arr.length-1,l=0;
        while(l<r) {
            if(arr[l]+arr[r]>target) {
                r--;
            }else if(arr[l]+arr[r]<target) {
                l++;
            }else {
                System.out.println(arr[l]+","+arr[r]);
                l++;
            }
        }
    }


}
