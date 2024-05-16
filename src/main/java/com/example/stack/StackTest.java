package com.example.stack;

import java.util.EmptyStackException;

public class StackTest {
    public static void main(String[] args) {
        // Create a new stack
        Stack<Integer> stack = new Stack<>();

        // Test case 1: Pushing elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Test case 2: Popping elements from the stack
        assert stack.pop() == 3;
        assert stack.pop() == 2;
        assert stack.pop() == 1;

        // Test case 3: Pushing and popping mixed
        stack.push(4);
        assert stack.pop() == 4;

        // Test case 4: Trying to pop from an empty stack
        boolean exceptionThrown = false;
        try {
            stack.pop();
        } catch (EmptyStackException e) {
            exceptionThrown = true;
        }
        assert exceptionThrown;

        System.out.println("All test cases passed!");
    }
}
