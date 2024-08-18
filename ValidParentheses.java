package org.example;

import java.util.Arrays;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args){
        ValidParentheses validParentheses = new ValidParentheses();
        String s = "(}";
        System.out.println(validParentheses.isValid(s));
    }
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        for(char c:s.toCharArray()){
            if(c=='(' || c=='[' || c=='{'){
                stack.push(c);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.peek();
                if((c==')' && top=='(') || (c==']' && top=='[') || (c=='}' && top=='{')){
                    stack.pop();
                }
                else
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
