package Week_2.Day_4;

import java.util.Stack;

public class ReverseWord {

    public String reverseWords(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                stack.push(ch);
            } else {
                while (!stack.isEmpty()) {
                    result.append(stack.pop());
                }
                result.append(" ");
            }
        }
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.toString();
    }
}
