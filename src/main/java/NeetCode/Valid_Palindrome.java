package NeetCode;

public class Valid_Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^0-9a-z]", "");
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) != s.charAt(s.length() - 1 - i))
                return false;

        return true;
    }
}
