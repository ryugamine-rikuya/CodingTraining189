package app;

import app.StackNode;

public class Stacks<T> {
    
    StackNode<T> top;

    public Stacks(T data){
        this.top = new StackNode<T>(data);
    }
    public T pop(){
        if(this.isEmpty()) {
            return null;
        }
        StackNode<T> popedNode = this.top;
        this.top = this.top.next;
        return popedNode.data;
    }
    public void push(T data){
        this.top = new StackNode<T>(data, this.top);
    }
    public T peek(){
        return this.top.data;
    }
    public boolean isEmpty(){
        if(this.top == null) {
            return true;
        } else {
            return false;
        }
    }
}