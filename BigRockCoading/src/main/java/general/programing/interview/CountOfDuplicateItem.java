package general.programing.interview;

import java.util.*;

public class CountOfDuplicateItem {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String[] city = {"texas", "ny", "sydney", "ny", "paris", "texas", "ny"};
        System.out.println(DuplicateString(city));

    }


    public static Map<String, Integer> DuplicateString(String[] str) {
        List list= Arrays.asList(str);
        Map<String,Integer> map = new HashMap<String, Integer>();
        for(String s : str) {
            map.put(s, Collections.frequency(list, s));
        }
        return map;
    }

}
