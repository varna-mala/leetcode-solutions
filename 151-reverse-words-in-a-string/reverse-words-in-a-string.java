class Solution {
    public String reverseWords(String s) {
        char[] ch = s.trim().replaceAll("\\s+", " ").toCharArray();
        reverse(ch, 0, ch.length - 1);

        int start = 0;
        for (int i = 0; i <= ch.length; i++) {
            if (i == ch.length || ch[i] == ' ') {
                reverse(ch, start, i - 1);
                start = i + 1;
            }
        }
        return new String(ch);
    }

    void reverse(char[] a, int l, int r) {
        while (l < r) {
            char t = a[l];
            a[l++] = a[r];
            a[r--] = t;
        }
    }
}