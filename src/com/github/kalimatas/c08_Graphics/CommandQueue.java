package com.github.kalimatas.c08_Graphics;

import java.util.LinkedList;

public class CommandQueue {
    private LinkedList<Command> queue = new LinkedList<>();

    public void push(final Command command) {
        queue.add(command);
    }

    public Command pop() {
        return queue.removeFirst();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
