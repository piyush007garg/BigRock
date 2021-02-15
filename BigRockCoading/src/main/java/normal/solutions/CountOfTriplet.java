package normal.solutions;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CountOfTriplet {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int  sc =scanner.nextInt();
        Integer[] arr1 = new Integer[sc];
        
        for(int i=0;i<sc;i++){
            arr1[i] = scanner.nextInt();
        }

//        Integer[] arr = {0, 0, 1, 4, 3};
        System.out.println(getTriplet(arr1));
    }
    public static int getTriplet(Integer[] arr) {
        List<Integer> value = Arrays.asList(arr);
        int result;
        int count = 0;
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                result = arr[i] + arr[j];
                if (value.contains(result)) {
                    count++;
                }
            }
        }
        return count;
    }
    
    // solve this problem with MAP and getting input from user
}
