package sophieleetcode;
/**
 * Created by wenshuogao on 12/29/16.
 */
import java.util.*;
public class LC388_LongestAbsoluteFilePath {
    public static void main(String arg[]) {
        String input = "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext";
        System.out.println(lengthLongestPath(input));
    }
    public static int lengthLongestPath (String input) {
        Deque<Integer> stack = new ArrayDeque<>();
        int maxLen = 0;
        int len = 0;
        for (String s: input.split("\n")) {
            int lev = s.lastIndexOf("\t") + 1;
            while(stack.size() > lev) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                len = s.length() - lev + 1;
            }
            else {
                len = stack.peek() + s.length() - lev + 1;
            }
            stack.push (len);
            if (s.contains(".")) maxLen = Math.max(maxLen, len -1);
        }
        return maxLen;

    }
}
