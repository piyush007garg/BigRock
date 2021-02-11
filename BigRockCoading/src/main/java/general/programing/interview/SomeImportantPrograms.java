package general.programing.interview;

import java.util.HashSet;
import java.util.Set;

public class SomeImportantPrograms {

    /**
     * fibonicii series
     */

    // public static void main(String[] args) {
    //
    // int n=8;
    // int i = 0,temp;
    // int n1=0,n2=1,n3;
    // System.out.println(n1+n2);
    //
    // for(i =0;i<n;i++) {
    // n3 = n1+n2;
    // System.out.println(n3);
    // n1=n2;
    // n2=n3;
    //
    //
    // }
    // }

    /**
     *
     * palindrome of integer number
     */
//	public static void main(String[] args) {
//
//		int number = 123;
//		int sum = 0;
//		int temp;
//		temp = number;
//
//		while (number > 0) {
//			int reminder = number % 10;
//			sum = (sum * 10) + reminder;
//			number = number / 10;
//		}
//
//		if (sum == temp) {
//			System.out.println("paimdrome");
//		} else {
//			System.out.println("Not palindrome");
//		}
//
//	}


    /**
     * Swap a number without third variable
     */

    public static void main(String[] args) {
        int a=12;
        int b=23;

        a= a+b; // a=35
        b= a-b; //35-23 b = 12
        a=a-b;  //35-12 a = 23

        System.out.println("after swaping a,b the values of a is-->"+a +"and valueof b i--->"+b);
    }


}

/**
 * given string is anagram or not
 */

class Anagram{

    public static boolean isAnagram(String str ,String str2) {
        char[] Chararacter = str.toCharArray();
        StringBuilder sb = new StringBuilder(str2);
        for(Character Ch :Chararacter) {
            int index = sb.indexOf(""+Ch);
            //System.out.println(index);
            if(index!=-1) {
                sb.deleteCharAt(index);
            }
        }
        if (sb.length()==0) {
            return true;
        }else {
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(isAnagram("my name is piyush", "piyush is my name"));
    }
}

/**
 * @author piyush.garg
 * find a palindrome inside a string
 */


class PalindromeInsideAPalindrome{

    public static boolean checkPalindrome(String str) {
        for(int i =0;i<str.length()/2;i++) {
            if(str.charAt(i)!= str.charAt(str.length()-1-i))	{
                return false;
            }
        }
        return true;
    }

    public static Set<CharSequence> printAllPalindrome(String str) {
        Set<CharSequence> set = new HashSet();
        for(int i=0;i<str.length();i++) {
            for(int j=i+1;j<str.length();j++) {
                if(checkPalindrome(str.substring(i, j)))
                    set.add(str.substring(i, j));

            }
        }
        return set;
    }
    public static void main(String[] args) {
        System.out.println(printAllPalindrome("abaabcaab"));
    }
}



