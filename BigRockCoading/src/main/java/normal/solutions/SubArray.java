package normal.solutions;

public class SubArray {
    /*
    Problem :
    Given an unsorted array A of size N that contains only non-negative integers,
     find a continuous sub-array which adds to a given number S.
     */

    /*
    example:
    Input:
    N = 5, S = 12
    A[] = {1,2,3,7,5}
    Output: 2 4
    Explanation: The sum of elements
    from 2nd position to 4th position
    is 12.
     */

    public static void main(String[] args) {
        int[] sum = {1,2,3,7,5};
    subArrayGivenSum(sum,5,3);
    }

    public static  int subArrayGivenSum(int[] arr, int n , int sum){
        for(int i=0;i<n;i++){
            int curr_sum=arr[i];
            for(int j=i+1;j<=n;j++){
                if(curr_sum ==sum){
                    System.out.println("index are: "+i +" "+ (j-1));
                    return 1;
                }
                if(curr_sum>sum || j==n)
                    break;
                curr_sum=curr_sum+arr[j];
                }
            }
        System.out.println("No sub Array found");
        return 0;
        }
    }

