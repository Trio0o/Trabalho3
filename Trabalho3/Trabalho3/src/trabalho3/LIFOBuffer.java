/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho3;

import java.util.Stack;

/**
 *
 * @author muriloamado
 */


public class LIFOBuffer {
    private Stack<String> stack;

    public LIFOBuffer() {
        stack = new Stack<>();
    }

    public void push(String text) {
        stack.push(text);
    }

    public String pop() {
        return stack.pop();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}

