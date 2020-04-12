package app;

public class LimitedStacks {
    int limitedNumber;
    int list[];
    int topIndex = -1;
    public LimitedStacks(int _limitedNumber){
        this.limitedNumber = _limitedNumber;
        list = new int[this.limitedNumber];
    }
    public int pop(){
        if(topIndex<0){
            return -1;
        }
        return list[topIndex--];
    }
    public void push(int data){
        if(topIndex < limitedNumber-1){
            list[++topIndex] = data;
        }
    }
    public boolean isEmpty(){
        if(topIndex < 0){
            return true;
        }
        return false;
    }
    public boolean isFull(){
        if(topIndex >= limitedNumber-1){
            return true;
        }
        return false;
    }
}