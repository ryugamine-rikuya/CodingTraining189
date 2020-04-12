package app;

public class StackNode {
    public int data;
    public StackNode next = null;
    public StackNode(int _data){
        this.data = _data;
    }
    public StackNode(int _data, StackNode _next){
        this.data = _data;
        this.next = _next;
    }
}