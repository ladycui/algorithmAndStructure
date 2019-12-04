package algorithmAndStructure.stack;

import java.util.List;
import java.util.Stack;

/**
 * @Auther: cyn
 * @Date: 2019-10-22 11:19
 * @Description:
 */
public class StackDemo {
    static String s = "]";

    public static void main(String[] args) {
        System.out.println(simplifyPath("/../"));
    }


    /**
     * leetcode #71
     */
    public static String simplifyPath(String path) {
        String[] eles = path.split("/");
        Stack<String> stack = new Stack<>();
        int len = eles.length;
        for (int i = 0; i < len; i++) {
            if (eles[i].isEmpty() || ".".equals(eles[i]))
                continue;
            if ("..".equals(eles[i])) {
                if(stack.empty())
                    continue;
                stack.pop();
                continue;
            }
            stack.push(eles[i]);
        }
        if (stack.empty()) {
            return "/";
        }
        Stack<String> tmp = new Stack<>();
        while (!stack.empty()) {
            tmp.push(stack.pop());
        }
        StringBuilder result = new StringBuilder();
        while (!tmp.empty()) {
            result.append("/" + tmp.pop() );
        }
        return result.toString();
    }


    /**
     * 给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合。
     * 例如，给出 n = 3，生成结果为：
     * <p>
     * [
     * "((()))",
     * "(()())",
     * "(())()",
     * "()(())",
     * "()()()"
     * ]
     *
     * @return
     */
    public List<String> generateParenthesis(int n) {


        return null;
    }

    public static boolean isValid() {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        Character tmp;
        for (char ele : chars) {
            if (stack.empty()) {
                stack.push(ele);
                continue;
            }
            if (ele == '(' || ele == '[' || ele == '{') {
                stack.push(ele);
            } else {
                tmp = stack.pop();
                if (tmp == null)
                    return false;
                if (ele == ')' && tmp != '(')
                    return false;
                if (ele == ']' && tmp != '[')
                    return false;
                if (ele == '}' && tmp != '{')
                    return false;
            }
        }
        if (!stack.empty())
            return false;
        return true;
    }

}
