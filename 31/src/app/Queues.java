package app;

import app.QueueNode;

public class Queues<T> {
    QueueNode<T> first;
    QueueNode<T> last;
    public Queues(T data){
        first = new QueueNode<T>(data);
        last = first;
    }
    public void add(T data){
        QueueNode<T> tmpNode = new QueueNode<T>(data);
        if(this.first == null){
            this.first = tmpNode;
            this.last = tmpNode;
        } else {
            last.next = tmpNode;
            last = tmpNode;
    
        }
    }
    public T remove() {
        if(this.isEmpty()){
            return null;
        }
        QueueNode<T> tmpNode = first;
        first = first.next;
        return tmpNode.data;
    }
    public T peek(){
        if(this.isEmpty()){
            return null;
        }
        return first.data;
    }
    public boolean isEmpty(){
        if(this.first == null){
            return true;
        } else {
            return false;
        }
    }
}