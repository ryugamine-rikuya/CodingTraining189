package app;

public class QueueNode<T> {
    T data;
    QueueNode<T> next = null;
    public QueueNode(T data){
        this.data = data;
    }
    public QueueNode(T data, QueueNode<T> next){
        this.data = data;
        this.next = next;
    }
}