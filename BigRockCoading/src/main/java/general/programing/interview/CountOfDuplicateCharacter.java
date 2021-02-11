package general.programing.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountOfDuplicateCharacter {

    public static void main(String[] args) {
        System.out.println(occurenceOfDuplicateCharacter("acdbbaecm"));
    }

    public static Map<Character, Integer> occurenceOfDuplicateCharacter(String input) {
        Map<Character,Integer> map = new HashMap<Character,Integer>();


        char[] chars = input.toCharArray();
        for(Character ch :chars) {
            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch)+1);
            }else {
                map.put(ch, 1);
            }
        }
        Set<Character> set = map.keySet();
        for(Character ch:set) {
            if(map.get(ch)>1) {
                System.out.println(ch+ ""+map.get(ch));
            }
        }
        return map;
    }

}
