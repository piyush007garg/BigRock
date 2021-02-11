package general.programing.interview;

public class ReverseVowelsOfAString {

    public static void main(String[] args) {

        System.out.println(reversalString("LeetCode"));

    }

    public static String reversalString(String s) {
        int left = 0;
        int right = s.length() - 1;

        char[] charArray = s.toCharArray();

        while (left < right) {
            if (!(charArray[left] == 'a' || charArray[left] == 'e' || charArray[left] == 'i' || charArray[left] == 'o'
                    || charArray[left] == 'u' || charArray[left] == 'A' || charArray[left] == 'E'
                    || charArray[left] == 'I' || charArray[left] == 'O' || charArray[left] == 'U')) {
                left++;

            } else if (!(charArray[right] == 'a' || charArray[right] == 'e' || charArray[right] == 'i' || charArray[right] == 'o'
                    || charArray[right] == 'u' || charArray[right] == 'A' || charArray[right] == 'E'
                    || charArray[right] == 'I' || charArray[right] == 'O' || charArray[right] == 'U')) {
                right--;

            }else {
                char temp = charArray[left];
                charArray[left]=charArray[right];
                charArray[right]=temp;
                left++;
                right--;
            }
        }
        return String.copyValueOf(charArray);

    }

}
