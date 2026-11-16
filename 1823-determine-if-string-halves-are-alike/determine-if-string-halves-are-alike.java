class Solution {
    public boolean halvesAreAlike(String s) {
        int a = 0, b = 0;
        int n = s.length();

        for (int i = 0; i < n / 2; i++) {

            char left = Character.toLowerCase(s.charAt(i));
            char right = Character.toLowerCase(s.charAt(i + n / 2));

            if (left == 'a' || left == 'e' || left == 'i' ||
                left == 'o' || left == 'u') {
                a++;
            }

            if (right == 'a' || right == 'e' || right == 'i' ||
                right == 'o' || right == 'u') {
                b++;
            }
        }

        return a == b;
    }
}