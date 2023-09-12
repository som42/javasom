package 연습.리트코드;

import java.util.Stack;

public class Solution844 {
    public boolean backspaceCompare(String s, String t)  {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        for(char c : s.toCharArray()){
            if (c =='#'){
                stack1.pop();
            }else {
                stack1.push(c);
            }
        }
        for (char c : t.toCharArray()){
            if (c == '#') {
                stack2.pop();
            }else {
                stack2.push(c);
            }
        }

        if (stack1.size() != stack2.size()){
            return false;
        }
        while (stack1.size() > 0){
            Character char1 = stack1.pop();
            Character char2 = stack2.pop();
            if (!char1.equals(char2)){
                return false;
            }
        }
        return false;
    }
}
