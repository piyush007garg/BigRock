package general.programing.interview;

public class StringReversal {

    public static void main(String[] args) {

        // System.out.println(reverseStringByFirstIndex("piyush garg"));
        // System.out.println(reverseStringByLastIndex("piyush garg"));
        // System.out.println(reverseStringWithPreservePositionOfSpecialCharacter("1p334%$34%7*7j5$"));

    }

    /**
     * input- piyush garg output - hsuyip grag
     */

    public static String[] reverseStringByFirstIndex(String str) {
        String[] splitString = str.split(" ");
        for (int i = 0; i < splitString.length; i++) {
            for (int j = splitString[i].length() - 1; j >= 0; j--) {
                System.out.print(splitString[i].charAt(j));
            }
            System.out.print(" ");
        }
        return splitString;
    }

    /**
     * input - piyush garg output - grag hsuyip
     *
     * @return
     */

    public static String[] reverseStringByLastIndex(String str) {
        String[] splitString = str.split(" ");
        for (int i = splitString.length - 1; i >= 0; i--) {
            for (int j = splitString[i].length() - 1; j >= 0; j--) {
                System.out.print(splitString[i].charAt(j));
            }
            System.out.print(" ");
        }
        return splitString;
    }

    /**
     * input - !7!#$garg$%
     *
     * @param str
     * @return
     */
    public static char[] reverseStringWithPreservePositionOfSpecialCharacter(String str) {
        char[] charArray = str.toCharArray();
        int r = charArray.length - 1, l = 0;
        while (r > l) {
            if (!((charArray[l] >= 65 && charArray[l] <= 90) || (charArray[l] >= 97 && charArray[l] <= 122)
                    || (charArray[l] >= 48 && charArray[l] <= 57))) {
                l++;
            } else if (!((charArray[r] >= 65 && charArray[r] <= 90) || (charArray[r] >= 97 && charArray[r] <= 122)
                    || (charArray[r] >= 48 && charArray[r] <= 57))) {
                r--;
            } else {
                char temp = charArray[l];
                charArray[l] = charArray[r];
                charArray[r] = temp;
                l++;
                r--;
            }
        }
        return charArray;

    }

}

