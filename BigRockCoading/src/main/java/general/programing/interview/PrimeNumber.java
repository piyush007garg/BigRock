package general.programing.interview;

public class PrimeNumber {

    public static void main(String[] args) {
        System.out.println(getNumbers(5));


    }


    public static String getNumbers(int number) {
        String primeNumber = "";

        for(int i=1;i<number;i++) {
            int counter =0;

            for(int num=i;num>=1;num--) {
                if(i%num==0) {
                    counter= counter +1;
                }
            }

            if(counter ==2) {
                primeNumber = primeNumber + i + " ";
            }
        }


        return primeNumber;
    }

}
