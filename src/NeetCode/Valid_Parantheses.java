package NeetCode;

import java.util.Stack;

public class Valid_Parantheses {
    public static void main(String[] args) {
        System.out.println(isValid("()"));
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char a : s.toCharArray()) {
            if (a == '(' || a == '[' || a == '{') stack.push(a);
            if (stack.empty()) return false;
            if (a == ')' && stack.pop() != '(') return false;
            if (a == ']' && stack.pop() != '[') return false;
            if (a == '}' && stack.pop() != '{') return false;
        }
        return stack.isEmpty();
    }

}

