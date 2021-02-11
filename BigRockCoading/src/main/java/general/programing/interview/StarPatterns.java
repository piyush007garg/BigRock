package general.programing.interview;

public class StarPatterns {

    /**
     * *
     * **
     * ***
     * ****
     * *****
     */

//	public static void main(String[] args) {
//		for(int i=0;i<5;i++) {
//			for(int j=0;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println(" ");
//		}
//	}

    /**
     *      *
     *     **
     *    ***
     *   ****
     *  *****
     */

    public static void main(String[] args) {
        int i, j, k=4;
        for(i=0; i<5; i++)
        {
            for(j=0; j<k; j++)
            {
                System.out.print(" ");
            }
            k = k - 1;
            for(j=0; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     *  *****
     *  ****
     *  ***
     *  **
     *  *
     */

//	public static void main(String[] args) {
//		for(int i =5;i>0;i--) {
//			for(int j =0;j<i;j++) {
//				System.out.print("*");
//			}
//			System.out.println(" ");
//		}
//	}

//	public static void main(String[] args) {
//		String s = "akansha";
//		int piyush=0;
//
//		for(Character Char : s.toCharArray() ) {
//			piyush++;
//		}
//		System.out.println(piyush);
//
//
//	}

    /**
     * O/P will be
     * 2
     3 4
     5 6 7
     8 9 10 11
     *
     */

//	public static void main(String[] args) {
//
//		int count = 1;
//		for( int i=0;i<5;i++) {
//			for( int j=0;j<i;j++) {
//				System.out.print(++count + " ");
//			}
//			System.out.println(" ");
//		}
//	}

    /**
     * O/P will be
     * 1
     12
     123
     1234
     12345
     *
     */

//	public static void main(String[] args) {
//		for(int i=0;i<=5;i++) {
//			for( int j=1;j<i+1;j++) {
//				System.out.print(j + " ");
//			}
//			System.out.println(" ");
//		}
//	}


}

