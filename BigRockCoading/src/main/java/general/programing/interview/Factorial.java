package general.programing.interview;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorialNumber(6));

    }

    public static int factorialNumber(int number) {

        int result = 1;

        int sum = number;

        for (int i = sum - 1; i > 0; i--) {

            if (number > 0) {

                result = number * factorialNumber(number - 1);
            }

        }
        return result;
    }

    // without recursion

//	 public static int factorialNumber(int number){
//
//	        int result =1;
//	        for(int i=1;i<=number;i++){
//	            result = result *i;
//	        }
//	        return result;
//	    }

}
