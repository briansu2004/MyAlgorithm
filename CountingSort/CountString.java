import java.io.*;
import java.util.Arrays;

class CountString {
    /* Assuming s only contains a-z, or A-Z */
    public static int[] countingSortString(String s, char firstChar) {
        int[] cs = new int[26];
        for (int i = 0; i < s.length(); i++) {
            cs[s.charAt(i) - firstChar]++;
        }
        return cs;
    }

    public static void main(String[] args) {
        String s = "helloworld";
        int[] cs = countingSortString(s, 'a');
        System.out.println(Arrays.toString(cs));
    }
}