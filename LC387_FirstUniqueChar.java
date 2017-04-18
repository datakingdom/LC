package sophieleetcode;

/**
 * Created by wenshuogao on 12/28/16.
 */
//import java.util.*;
public class LC387_FirstUniqueChar {
    public static void main (String arg[]) {
        String s = "aa-bcdee";
        System.out.println(firstUniqChar(s));
    }
    public static int firstUniqChar(String s) {
        int freq[] = new int[256];
        for (int i = 0; i < s.length(); i++)
            freq[s.charAt(i)]++;
        for (int i = 0; i < s.length(); i++)
            if (freq[s.charAt(i) ] == 1)
                return i;
        return -1;
    }
}

