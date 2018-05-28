package com.oodesign.lsp;

import java.util.List;
import java.util.Stack;

/**
 * @author suresh.gupta
 *
 */
public class StackLspViolator {
    public static void main(String[] args) {
        Stack<Integer> orgStack = initiateList();
        System.out.println("first int: " + orgStack.pop());
        Stack<Integer> updatedStack = (Stack<Integer>) removeFirstElement(orgStack);
        updatedStack.forEach(System.out::println);
    }

    public static Stack<Integer> initiateList() {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        return s;
    }

    public static List<Integer> removeFirstElement(List<Integer> numbers) {
        numbers.remove(0);
        return numbers;
    }
}
