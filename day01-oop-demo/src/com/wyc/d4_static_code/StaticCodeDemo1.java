package com.wyc.d4_static_code;

import java.util.ArrayList;

public class StaticCodeDemo1 {
    public static String reverseVowels(String s) {
        //'a' 'e' 'i' 'o' 'u'
        ArrayList<Character> vowelList = new ArrayList<>();
        vowelList.add('a'); vowelList.add('e'); vowelList.add('i'); vowelList.add('o'); vowelList.add('u');
        vowelList.add('A'); vowelList.add('E'); vowelList.add('I'); vowelList.add('O'); vowelList.add('U');

        char[] result = s.toCharArray();
        int low = 0;
        int high = s.length() - 1;
        while (low <= high) {
            char cLow = s.charAt(low);
            char cHigh = s.charAt(high);
            while(low < s.length() && vowelList.contains(cLow) == false) { // low这边不是元音
                low++;
                cLow = s.charAt(low);
            }
            while(high > 0 && vowelList.contains(cHigh) == false) { // high这边不是元音
                high--;
                cHigh = s.charAt(high);
            }
            if(low < high)
                swapItem(result, low, high);
        }
        return new String(result);
    }

    public static void main(String[] args) {
        String s = "hello";
        System.out.println(reverseVowels(s));
    }

    public static void swapItem(char arr[], int i, int j) {
        char ch;
        ch = arr[i];
        arr[i] = arr[j];
        arr[j] = ch;
    }

}
