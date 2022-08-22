package stack4;

import java.util.Scanner;
import java.util.Stack;

public class bracket {
    /**
     * 题目描述：
     * 给出一个仅包含字符’(’,’)’,’{’,’}’,’[‘和’]’,的字符串，判断给出的字符串是否是合法的括号序列
     * 括号必须以正确的顺序关闭，"()“和”()[]{}“都是合法的括号序列，但”(]“和”([)]"不合法。
     * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char[] chars = str.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(' || chars[i] == '[' || chars[i] == '{') {
                stack.push(chars[i]);
            } else if (chars[i] == ')') {
                if (stack.peek() == '(')
                    stack.pop();
            } else if (chars[i] == ']') {
                if (stack.peek() == '[')
                    stack.pop();
            } else if (chars[i] == '}') {
                if (stack.peek() == '{')
                    stack.pop();
            }
        }
        System.out.println(stack.size() == 0);
    }
}
