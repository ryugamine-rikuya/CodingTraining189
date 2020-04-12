package app;

import app.Stacks;
import app.StackNode;

import app.Queues;

import app.LimitedStacks;

public class App {
    public static void main(String[] args) throws Exception {
        LimitedStacks stacks = new LimitedStacks(3);
        stacks.push(1);
        stacks.push(2);
        stacks.push(3);
        System.out.println(stacks.pop());
        System.out.println(stacks.pop());
        System.out.println(stacks.pop());
        System.out.println(stacks.pop());
        System.out.println(stacks.pop());
        System.out.println(stacks.pop());
        stacks.push(1);
        stacks.push(2);
        stacks.push(3);
        System.out.println(stacks.pop());
        System.out.println(stacks.pop());
        System.out.println(stacks.isEmpty());
        System.out.println(stacks.pop());
        System.out.println(stacks.isEmpty());
    }
}