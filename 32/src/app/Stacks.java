package app;

import app.StackNode;

public class Stacks {
    
    StackNode top;
    StackNode minTop;

    public Stacks(int data){
        this.top = new StackNode(data);
        this.minTop = new StackNode(data);
    }
    public int pop(){
        if(this.isEmpty()) {
            return -1;
        }
        StackNode popedNode = this.top;
        this.top = this.top.next;
        if((this.minTop.next != null) && (this.minTop.data == this.top.data)) {
            this.minTop = this.minTop.next;
        }
        return popedNode.data;
    }
    public void push(int data){
        this.top = new StackNode(data, this.top);
        if(this.minTop.data >= this.top.data){
            this.minTop = new StackNode(data, this.minTop);
        }
    }
    public int peek(){
        return this.top.data;
    }
    public int min(){
        if(this.minTop == null){
            return -1;
        }
        return this.minTop.data;
    }
    public boolean isEmpty(){
        if(this.top == null) {
            return true;
        } else {
            return false;
        }
    }
}