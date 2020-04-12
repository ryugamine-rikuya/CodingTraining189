package app;

public class StackNode<T> {
    public T data;
    public StackNode<T> next = null;
    public StackNode(T _data){
        this.data = _data;
    }
    public StackNode(T _data, StackNode<T> _next){
        this.data = _data;
        this.next = _next;
    }
}