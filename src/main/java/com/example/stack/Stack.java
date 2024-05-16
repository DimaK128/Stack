package com.example.stack;

import java.util.EmptyStackException;
import java.util.LinkedList;

class Stack<T> extends LinkedList<T> {
    // Method to push an item onto the stack
    public void push(T item) {
        addFirst(item);
    }

    // Method to pop an item from the stack
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return removeFirst();
    }
}
