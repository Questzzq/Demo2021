package modules.structure;

import java.util.HashMap;

/**
 * @author EricTseng
 * @date 2021/10/2 22:14
 */
public class Solution {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqChar(s));
    }

    public static int firstUniqChar(String s) {
        if(s.length() == 1)
            return 0;
        char [] str = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        map.put(str[0], 1);
        for(int i = 1; i < str.length; i++) {
            if(!map.containsKey(str[i])) {
                map.put(str[i], 1);
            } else  {
                map.put(str[i], map.get(str[i])+1);
            }
        }
        char res;
        for(int i = 0; i < str.length; i++) {
            res = str[i];
            if(map.get(res) == 1) {
                return i;
            }
        }
        return  -1;
    }
}
